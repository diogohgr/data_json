package com.diogo.testefullstack;

import com.diogo.testefullstack.util.ConsumidorFila;
import com.diogo.testefullstack.util.ProdutorFila;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class TesteFullstackApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteFullstackApplication.class, args);
	}
}
