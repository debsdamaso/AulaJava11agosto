package br.com.testevetor.teste;

import br.com.testevetor.beans.Aluno;

public class Teste {

    public static void main(String[] args) {

        Aluno alunoObjeto = new Aluno(); 

        alunoObjeto.setNome("Rafael");
        alunoObjeto.setIdade(37);
        alunoObjeto.setRm(12235);

        System.out.println(alunoObjeto.getNome());
        System.out.println(alunoObjeto.getIdade());
        System.out.println(alunoObjeto.getRm());

        // Criando o vetor alunos

        Aluno[] alunos = new Aluno[3]; 

        alunos[0] = new Aluno();
        alunos[0].setNome("Karina");
        alunos[0].setIdade(37);
        alunos[0].setRm(12235);
    }
}



