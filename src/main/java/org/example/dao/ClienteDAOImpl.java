package org.example.dao;

import org.example.model.Cliente;
import org.example.model.Seguro;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAOImpl implements ClienteDAO {

    private final Connection connection;

    private PreparedStatement pstm;

    public ClienteDAOImpl(Connection connection) {
        this.connection = connection;
    }


    @Override
    public void adicionar(Cliente cliente) {
        System.out.println("Cliente adicionado: " + cliente.getNome());
    }

    // Retorna um cliente - simulação
    @Override
    public Cliente buscarPorCPF(String cpf) {
        return new Cliente("Cliente Simulado", cpf);
    }
}