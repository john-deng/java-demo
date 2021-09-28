package com.example.demo1;

import javax.websocket.server.PathParam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@SpringBootApplication
public class DemoApplication {

	@Data
	public class Response {
		private String message;
	}

	@RestController
	@RequestMapping("/")
	public class Controller {
		@GetMapping("/hello")
		public Response hello(String name) {
			Response response = new Response();
			response.setMessage("Hello" + name);
			return response;
		}

		@GetMapping("/world")
		public Response world() {
			Response response = new Response();
			response.setMessage(", world");
			return response;
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
