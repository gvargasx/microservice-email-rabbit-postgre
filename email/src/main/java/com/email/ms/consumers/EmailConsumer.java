package com.email.ms.consumers;

import com.email.ms.dtos.EmailDto;
import com.email.ms.models.EmailModel;
import com.email.ms.services.EmailService;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(EmailConsumer.class);

    @Autowired
    EmailService emailService;

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void listen(@Payload EmailDto emailDto) {
        EmailModel emailModel = new EmailModel();
        BeanUtils.copyProperties(emailDto, emailModel);
        emailService.sendEmail(emailModel);
        LOGGER.info("Email Status: {}", emailModel.getStatusEmail());
    }
}