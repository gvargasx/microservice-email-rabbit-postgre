# Microservice email rabbit postgre 

![GitHub repo size](https://img.shields.io/github/repo-size/gvargasx/microservice-email-rabbit-postgre?style=for-the-badge)

This is a microservice for sending emails using RabbitMQ and storing them in a PostgreSQL database. It provides a simple REST API for sending emails, and can be used as a standalone service or integrated into a larger application architecture.

### Requirements

Before running this microservice, you will need:
* RabbitMQ server
* PostgreSQL server

### Configuration

This microservice uses environment variables to configure its behavior. The following variables must be set:

* spring.rabbitmq.addresses: The url of the RabbitMQ server
* spring.rabbitmq.queue: The name of the RabbitMQ queue to use for sending emails
* spring.datasource.url: The url of the PostgreSQL server

![image](https://user-images.githubusercontent.com/56303179/231745623-84a6b627-9951-4cae-923f-f7ed2f9e1ece.png)

### Usage

To send an email, make a POST request to the /sending-email endpoint with the following JSON payload:

![image](https://user-images.githubusercontent.com/56303179/231746437-f876a68f-20cd-402c-bdaf-51c421613c50.png)


