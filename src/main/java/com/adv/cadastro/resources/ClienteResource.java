package com.adv.cadastro.resources;

import com.adv.cadastro.entity.ClienteEntity;
import com.adv.cadastro.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/cliente")
public class ClienteResource {
    
    @Autowired
    ClienteService clienteService;

    @PostMapping("/cadastrar")
    public ResponseEntity<String> cadastrar(@RequestBody ClienteEntity cliente){
            String clienteEntity = clienteService.cadastrar(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body("Usuario cadastrado com sucesso ID" + clienteEntity);
    }

    @GetMapping("/listar")
    public ResponseEntity<Optional<Iterable<ClienteEntity>>> ResponseEntitylistarTodos() {
        return ResponseEntity.status(HttpStatus.OK).body(clienteService.listarTodos());
    }

    @GetMapping("/{id}")
    @ResponseBody
    ResponseEntity getCliente(@PathVariable Optional<Long> id) {
            return ResponseEntity.status(HttpStatus.OK).body(clienteService.findCliente(id));
        }
    }

