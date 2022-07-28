package com.adv.cadastro.resources;

import com.adv.cadastro.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteResource {
    
    @Autowired
    ClienteService clienteService;

    @PostMapping("/cadastrar")
    public String cadastrar(){
        clienteService.cadastrar();

        return "a";
    }



}
