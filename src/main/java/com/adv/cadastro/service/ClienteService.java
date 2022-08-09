package com.adv.cadastro.service;

import com.adv.cadastro.entity.ClienteEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface ClienteService {

    String cadastrar(ClienteEntity cliente);

    Optional<Iterable<ClienteEntity>> listarTodos();

    Optional<ClienteEntity> findCliente(Optional id);

}
