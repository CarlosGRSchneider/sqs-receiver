package br.example.sqsreceiver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SqsReceiverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqsReceiverApplication.class, args);
	}

}
