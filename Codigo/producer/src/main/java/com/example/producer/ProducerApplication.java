package com.example.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.Message;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableBinding(ProducerChannels.class)
@SpringBootApplication
public class ProducerApplication {

    private final MessageChannel consumer;
    
    public ProducerApplication(ProducerChannels channels) {
        this.consumer = channels.consumer();
    }
    
    /**
     * Método para envio de mensagens de saudação
     * @param name String: Nome ao qual se quer saudar
     */
    @PostMapping ("/greet/{name}")
    public void publish(@RequestBody String name) {
        String greeting = "Hello, " + name + "!";
        Message <String> msg = MessageBuilder.withPayload(greeting).build();
        System.out.println(msg);
        this.consumer.send(msg);
        
    }
    
    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }
}

interface ProducerChannels {
    @Output
    MessageChannel consumer();
}
