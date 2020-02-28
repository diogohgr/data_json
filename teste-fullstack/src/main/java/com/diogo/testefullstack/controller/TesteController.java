package com.diogo.testefullstack.controller;

import com.diogo.testefullstack.service.TesteService;
import com.diogo.testefullstack.util.ConsumidorFila;
import com.diogo.testefullstack.util.ProdutorFila;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TesteController {

    @Autowired
    private TesteService service;

    @Autowired
    private ConsumidorFila receiver;

    @Autowired
    private ProdutorFila sender;

    @RequestMapping(value = "/api/v1/teste-fullstack/itens", method = RequestMethod.POST)
    public void add(@RequestBody JsonNode data) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        ArrayNode arrayNode = (ArrayNode) mapper.readTree(data.toString()).get("data");
        //List<String> itens = mapper.readValue(data.get("data").toString(), List.class);

        if(arrayNode.isArray()) {
            for(JsonNode jsonNode : arrayNode) {
                sender.send(jsonNode.toString());
            }
        }

    }
}
