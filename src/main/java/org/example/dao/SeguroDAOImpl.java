package org.example.dao;

import org.example.model.Cliente;
import org.example.model.Seguro;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SeguroDAOImpl implements SeguroDAO {
    private Connection connection;

    public SeguroDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void adicionar(Seguro seguro) {
        System.out.println("Seguro adicionado para: " + seguro.getCliente().getNome());
    }

    // Retorna um seguro - simulação

    @Override
    public Seguro buscarPorCliente(Cliente cliente) {
        LocalDate dataInicio = LocalDate.now();
        LocalDate dataFim = LocalDate.now().plusYears(1);  // Assumindo um seguro de 1 ano
        double valorBase = 1000.0;  // Supondo um valor base
        return new Seguro(cliente, valorBase, dataInicio, dataFim);
    }


}
