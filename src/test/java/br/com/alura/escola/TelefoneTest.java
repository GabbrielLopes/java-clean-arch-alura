package br.com.alura.escola;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelefoneTest {


    @Test
    public void testNaoDeveCriarTelefoneInvalido(){
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone(null,"123456789"));
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("dd1",null));
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("dd1","123456789"));
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("011","abc123456"));
    }

    @Test
    public void testDeveCriarTelefone(){
        assertNotNull(new Telefone("011","123456789"));
    }

}