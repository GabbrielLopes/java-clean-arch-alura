package br.com.alura.escola;

import java.util.Objects;

public class Email {

    private String endereco;

    private static final String PATTERN_EMAIL = "^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

    public Email(String endereco) {
        if(Objects.isNull(endereco) || !endereco.matches(PATTERN_EMAIL)){
            throw new IllegalArgumentException("E-mail inválido!");
        }
        this.endereco = endereco;
    }
}
