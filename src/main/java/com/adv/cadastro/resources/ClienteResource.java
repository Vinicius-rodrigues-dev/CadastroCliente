package com.adv.cadastro.resources;

import com.adv.cadastro.entity.ClienteEntity;
import com.adv.cadastro.model.Cliente;
import com.adv.cadastro.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteResource {
    
    @Autowired
    ClienteService clienteService;

    @PostMapping("/cadastrar")
    public ResponseEntity<String> cadastrar(@RequestBody ClienteEntity cliente){
        clienteService.cadastrar(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body("Usuario cadastrado com sucesso");
    }

    @GetMapping("/listar")
    public ResponseEntity<Object> listarTodos() {
        return ResponseEntity.status(HttpStatus.OK).body(clienteService.listarTodos());
    }


}
