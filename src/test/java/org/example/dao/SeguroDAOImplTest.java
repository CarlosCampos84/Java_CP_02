package org.example.dao;

import org.example.model.Cliente;
import org.example.model.Seguro;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class SeguroDAOImplTest {

    private SeguroDAO seguroDAO;

    private Connection connection;

    @Before
    public void setUp() throws Exception {
        connection = DriverManager.getConnection("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1", "", "");
        seguroDAO = new SeguroDAOImpl(connection);
    }

    @Test
    public void testAdicionarEBuscarSeguro() {
        Cliente cliente = new Cliente("Jane Doe", "987654321");
        Seguro seguro = new Seguro(cliente, 2500.0);
        seguroDAO.adicionar(seguro);
        Seguro encontrado = seguroDAO.buscarPorCliente(cliente);
        assertNotNull(encontrado);
        assertEquals(2500.0, encontrado.getValor(), 0.001);
    }
}