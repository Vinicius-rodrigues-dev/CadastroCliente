package com.adv.cadastro.service;

import com.adv.cadastro.entity.ClienteEntity;
import com.adv.cadastro.model.Cliente;
import com.adv.cadastro.repository.ClienteRepository;
import com.adv.cadastro.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    ClienteRepository repository;

    @Override
    public void cadastrar(ClienteEntity cliente) {
        repository.save(cliente);
    }

    @Override
    public List<ClienteEntity> listarTodos() {
        return (List<ClienteEntity>) repository.findAll();
    }
}
