package org.example.factory;

import org.example.model.Cliente;
import org.example.model.Seguro;

public abstract class EntidadeFactory {

    public abstract Cliente criarCliente(String nome, String cpf);

    public abstract Seguro criarSeguro(Cliente cliente, double valor);

}