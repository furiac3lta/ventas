package com.ventas.ventas.repository;

import com.ventas.ventas.model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepository extends JpaRepository<Clientes, Long> {
}
