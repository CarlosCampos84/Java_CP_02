package org.example.service;

import org.example.config.BancoConfig;
import org.example.model.Cliente;
import org.example.model.Seguro;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ServicoSeguroTest {
    private ServicoSeguro servico;
    private BancoConfig bancoConfig;

    @Before
    public void setUp() throws Exception {
        bancoConfig = new BancoConfig("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1", "", "");
        servico = ServicoSeguro.getInstance();
    }

    @Test
    public void testAdicionarCliente() {
        Cliente cliente = new Cliente("Charlie", "123321123");
        servico.adicionarCliente(cliente);
        assertNotNull(cliente);
    }

    @Test
    public void testAdicionarSeguro() {
        Cliente cliente = new Cliente("Dana", "321123321");
        Seguro seguro = new Seguro(cliente, 5000.0);
        servico.adicionarSeguro(seguro);
        assertNotNull(seguro);
    }
}