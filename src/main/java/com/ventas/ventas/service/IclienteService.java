package com.ventas.ventas.service;

import com.ventas.ventas.model.Clientes;

import java.util.List;
import java.util.Optional;

public interface IclienteService {
    List<Clientes> findAll();
    Optional<Clientes> findById(Long id);
    Clientes create(Clientes clientes);
    Clientes update(Clientes clientes);
    void delete(Long id);


}
