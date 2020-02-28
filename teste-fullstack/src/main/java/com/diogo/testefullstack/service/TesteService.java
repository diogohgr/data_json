package com.diogo.testefullstack.service;

import com.diogo.testefullstack.model.Item;
import com.diogo.testefullstack.repository.TesteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TesteService{

    public void add(List<Item> itens);
}

@Service
class TesteServiceImpl implements TesteService {

    @Autowired
    private TesteRepository repository;

    public void add(List<Item> itens) {
        repository.saveAll(itens);
    }
}

