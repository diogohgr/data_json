package com.diogo.testefullstack;

import com.diogo.testefullstack.util.ConsumidorFila;
import com.diogo.testefullstack.util.ProdutorFila;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.concurrent.TimeUnit;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TesteFullstackApplicationTests {

	//@Autowired
	//private TesteRepository repository;

	@Autowired
	private ConsumidorFila receiver;

	@Autowired
	private ProdutorFila sender;

	@Test
	public void testReceive() throws Exception {
		sender.send("Hello Spring JMS ActiveMQ!");

		receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
		assertThat(receiver.getLatch().getCount()).isEqualTo(0);
	}
}
