package com.diogo.testefullstack.util;

import org.springframework.jms.annotation.JmsListener;
import java.util.concurrent.CountDownLatch;

public class ConsumidorFila {

    private CountDownLatch latch = new CountDownLatch(1);

    public CountDownLatch getLatch() {
        return latch;
    }

    @JmsListener(destination = "data_1.json")
    public void receive(String message) {
        latch.countDown();
    }
}
