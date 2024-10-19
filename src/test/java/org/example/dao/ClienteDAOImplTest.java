package org.example.dao;

import org.example.model.Cliente;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class ClienteDAOImplTest {

    private ClienteDAO clienteDAO;

    private Connection connection;

    @Before
    public void setUp() throws Exception {
        connection = DriverManager.getConnection("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1", "", "");
        clienteDAO = new ClienteDAOImpl(connection);
    }

    @Test
    public void testAdicionarEBuscarCliente() {
        Cliente cliente = new Cliente("John Doe", "1234567890");
        clienteDAO.adicionar(cliente);
        Cliente encontrado = clienteDAO.buscarPorCPF("1234567890");
        assertNotNull(encontrado);
        assertEquals("John Doe", encontrado.getNome());
    }
}