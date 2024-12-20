package com.example.demo.Service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	@KafkaListener(topics = "tamil_topic", groupId = "demo_group")
	public void listenToTopic(String receivedMessage) {
		System.out.println("The message is " + receivedMessage);
	}
}
