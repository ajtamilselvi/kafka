package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.Producer;

@RestController
@RequestMapping("/rest/api")
public class RestControllerForKafkaMsg {

	@Autowired
	Producer producer;
	
	@GetMapping("/producerMsg")
	public void getMessage(@RequestParam("message") String message) {
		producer.sendMsgToConsumer(message);		
	}
}
