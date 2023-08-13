package br.com.alura.escola;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class AlunoTest {



    @Test
    public void testDeveAdicionarTelefone(){

        Aluno aluno = new Aluno();

        aluno.addTelefone("11","123456789");

        assertNotNull(aluno.getTelefones());
    }
}