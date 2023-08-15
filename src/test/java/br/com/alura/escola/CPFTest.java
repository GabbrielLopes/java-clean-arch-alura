package br.com.alura.escola;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CPFTest {

    @Test
    public void testNaoDeveCriarCpfInvalido(){
        assertThrows(IllegalArgumentException.class,
                () -> new CPF("12.456.789-11"));
        assertThrows(IllegalArgumentException.class,
                () -> new CPF("123.456.789-1"));
        assertThrows(IllegalArgumentException.class,
                () -> new CPF("123456.789-11"));
        assertThrows(IllegalArgumentException.class,
                () -> new CPF("12345678911"));
    }

    @Test
    public void testDeveCriarCpf(){
        assertNotNull(new CPF("123.456.789-11"));
    }

}