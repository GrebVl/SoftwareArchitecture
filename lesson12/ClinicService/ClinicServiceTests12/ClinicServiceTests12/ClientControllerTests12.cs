﻿using ClinicService.Controllers;
using ClinicService.Models;
using ClinicService.Models.Requests;
using ClinicService.Services;
using Microsoft.AspNetCore.Mvc;
using Moq;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace ClinicServiceTests12
{
    public class ClientControllerTests12
    {
        private ClientController _clientController;
        private Mock<IClientRepository> _mocClientRepository;

        public ClientControllerTests12() {
            _mocClientRepository = new Mock<IClientRepository>();
            _clientController = new ClientController(_mocClientRepository.Object);
        }

        [Fact]
        public void GetAllClientsTest()
        {
            // [1.1] Подготовка данных для тестирования

            // [1.2]
            
            List<Client> list = new List<Client>();
            list.Add(new Client());
            list.Add(new Client());
            list.Add(new Client());


            _mocClientRepository.Setup(repository =>
                repository.GetAll()).Returns(list);

            // [2] Исполнение тестируемого метода
            var operationResult = _clientController.GetAll();

            // [3] Подготовка эталонного результата, проверка результата
            Assert.IsType<OkObjectResult>(operationResult.Result);
            Assert.IsAssignableFrom<List<Client>>(((OkObjectResult)operationResult.Result).Value);

            _mocClientRepository.Verify(repository =>
                repository.GetAll(), Times.AtLeastOnce());
        }

        // Создание двумерного массива объектов
        public static readonly object[][] CorrectCreateClientData =
        {
            new object[] { new DateTime(1985, 5, 20), "123 1234", "Иванов", "Андрей", "Сергеевич" },
            new object[] { new DateTime(1987, 2, 18), "123 2222", "Иванов", "Андрей", "Сергеевич" },
            new object[] { new DateTime(1979, 1, 22), "123 4321", "Иванов", "Андрей", "Сергеевич" },
        };

        // Тест на добавление
        [Theory]
        [MemberData(nameof(CorrectCreateClientData))]
        public void CreateClientTest(DateTime birthday, string document, string surName, string firstName, string patronymic)
        {
            //[1]
            _mocClientRepository.Setup(repository =>
            repository
                .Create(It.IsNotNull<Client>()))
                .Returns(1).Verifiable();


            var operationResult = _clientController.Create(new CreateClientRequest
            {
                Birthday = birthday,
                Document = document,
                SurName = surName,
                FirstName = firstName,
                Patronymic = patronymic
            });

            //[3]
            Assert.IsType<OkObjectResult>(operationResult.Result);
            Assert.IsAssignableFrom<int>(((OkObjectResult)operationResult.Result).Value);
            _mocClientRepository.Verify(repository =>
                repository.Create(It.IsNotNull<Client>()), Times.AtLeastOnce());

        }

    }
