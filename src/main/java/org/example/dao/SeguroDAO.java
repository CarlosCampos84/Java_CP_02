package org.example.dao;

import org.example.model.Cliente;
import org.example.model.Seguro;

public interface SeguroDAO {
    void adicionar(Seguro seguro);

    Seguro buscarPorCliente(Cliente cliente);
}