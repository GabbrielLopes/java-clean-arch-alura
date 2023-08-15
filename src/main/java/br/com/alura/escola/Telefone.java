package br.com.alura.escola;

import java.util.Objects;

public class Telefone {

    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        if(Objects.isNull(ddd) || !isNumeric(ddd) || validaQntDigito(2,2, ddd)) {
            throw new IllegalArgumentException("DDD inválido!");
        }
        if(Objects.isNull(numero) || !isNumeric(numero) || validaQntDigito(9,9,numero)) {
            throw new IllegalArgumentException("Número inválido!");
        }

        this.ddd = ddd;
        this.numero = numero;
    }

    private static boolean validaQntDigito(int qntMinima,int qntMaxima, String str){
        return str.length() < qntMinima || str.length() > qntMaxima;
    }

    private static boolean isNumeric(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
