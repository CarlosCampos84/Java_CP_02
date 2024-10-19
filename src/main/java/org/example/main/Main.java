package org.example.main;

import org.example.config.BancoConfig;
import org.example.model.Cliente;
import org.example.model.Seguro;
import org.example.factory.EntidadeFactory;
import org.example.factory.ConcreteFactory;
import org.example.service.ServicoSeguro;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        BancoConfig db = new BancoConfig(
                "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL",
                "RM555223",
                "190606");

        EntidadeFactory factory = new ConcreteFactory();
        Cliente cliente = factory.criarCliente("João Silva", "123.456.789-10");
        Seguro seguro = factory.criarSeguro(cliente, 5000);

        // Correção: Passando a configuração de banco de dados para getInstance()
        ServicoSeguro servico = ServicoSeguro.getInstance(db);
        servico.adicionarCliente(cliente);
        servico.adicionarSeguro(seguro);
    }
}