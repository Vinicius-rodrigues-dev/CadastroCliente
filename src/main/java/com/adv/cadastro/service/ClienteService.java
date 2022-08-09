package com.adv.cadastro.service;

import com.adv.cadastro.entity.ClienteEntity;
import com.adv.cadastro.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClienteService {

    void cadastrar(ClienteEntity cliente);

    List<ClienteEntity> listarTodos();

}
