package org.example.factory;

import org.example.model.Cliente;
import org.example.model.Seguro;

import java.time.LocalDate;

public class ConcreteFactory extends EntidadeFactory {

    @Override
    public Cliente criarCliente(String nome, String cpf) {
        return new Cliente(nome, cpf);
    }

    @Override
    public Seguro criarSeguro(Cliente cliente, double valor) {

        // Definindo datas de início e fim do seguro para cumprir com a assinatura do construtor

        LocalDate dataInicio = LocalDate.now();  // Data de início como hoje
        LocalDate dataFim = dataInicio.plusYears(1);  // Data de fim como um ano após a data de início

        // Chamando o construtor de Seguro com todos os parâmetros necessários
        return new Seguro(cliente, valor, dataInicio, dataFim);
    }
}

