package br.com.alura.escola;

import java.util.Objects;

public class CPF {

    private String numero;

    private static final String PATTERN_CPF = "\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}";
    public CPF(String numero) {
        if(Objects.isNull(numero) || !numero.matches(PATTERN_CPF)){
            throw new IllegalArgumentException("CPF inválido!");
        }
        this.numero = numero;
    }
}
