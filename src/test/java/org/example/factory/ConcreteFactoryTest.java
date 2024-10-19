package org.example.factory;

import org.example.model.Cliente;
import org.example.model.Seguro;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConcreteFactoryTest {

    private ConcreteFactory factory;

    @Before
    public void setUp() {
        factory = new ConcreteFactory();
    }

    @Test
    public void testCriarCliente() {
        Cliente cliente = factory.criarCliente("Alice", "456789123");
        assertNotNull(cliente);
        assertEquals("Alice", cliente.getNome());
    }

    @Test
    public void testCriarSeguro() {
        Cliente cliente = new Cliente("Bob", "987654321");
        Seguro seguro = factory.criarSeguro(cliente, 10000.0);
        assertNotNull(seguro);
        assertEquals(10000.0, seguro.getValor(), 0.001);
    }
}