package org.example.dao;

import org.example.model.Cliente;
import org.example.model.Seguro;


public interface ClienteDAO {

    void adicionar(Cliente cliente);

    Cliente buscarPorCPF(String cpf);

}
