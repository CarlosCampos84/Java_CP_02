package org.example.service;

import org.example.config.BancoConfig;
import org.example.dao.ClienteDAO;
import org.example.dao.ClienteDAOImpl;
import org.example.dao.SeguroDAO;
import org.example.dao.SeguroDAOImpl;
import org.example.model.Cliente;
import org.example.model.Seguro;

import java.sql.Connection;

public class ServicoSeguro {

    private static ServicoSeguro instance;

    private ClienteDAO clienteDAO;

    private SeguroDAO seguroDAO;

    private ServicoSeguro(BancoConfig bancoConfig) {
        try {
            Connection connection = bancoConfig.getConnection();
            this.clienteDAO = new ClienteDAOImpl(connection);
            this.seguroDAO = new SeguroDAOImpl(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static synchronized ServicoSeguro getInstance(BancoConfig bancoConfig) {
        if (instance == null) {
            instance = new ServicoSeguro(bancoConfig);
        }
        return instance;
    }

    public void adicionarCliente(Cliente cliente) {
        clienteDAO.adicionar(cliente);
    }

    public void adicionarSeguro(Seguro seguro) {
        seguroDAO.adicionar(seguro);
    }
}
