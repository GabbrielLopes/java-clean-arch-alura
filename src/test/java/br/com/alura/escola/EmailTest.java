package br.com.alura.escola;

import br.com.alura.escola.Email;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class EmailTest {


    @Test
    public void testNaoDeveCriarEmailInvalido() {
        assertThrows(IllegalArgumentException.class,
                () -> new Email(null));
        assertThrows(IllegalArgumentException.class,
                () -> new Email("testeemailInvalido"));
    }

    @Test
    public void testDeveCriarEmail() {
        assertNotNull(new Email("testeemail@gmail.com"));
    }

}