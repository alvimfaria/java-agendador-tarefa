package com.marcosalvim.java_agendador_tarefas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class JavaAgendadorTarefasApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaAgendadorTarefasApplication.class, args);
	}

}
