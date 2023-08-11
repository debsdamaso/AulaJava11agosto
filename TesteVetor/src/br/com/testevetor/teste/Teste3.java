package br.com.testevetor.teste;

import java.util.ArrayList;
import java.util.List;
import br.com.testevetor.beans.Aluno;

public class Teste3 {

    public static void main(String[] args) {
        // Utilizando uma lista para armazenar os objetos Aluno
        List<Aluno> listaAlunos = new ArrayList<>();

        Aluno alunoUm = new Aluno("Rafa", 37, 1122445);
        Aluno alunoDois = new Aluno("Karina", 34, 12378);

        // Adicionando os objetos Aluno à lista
        listaAlunos.add(alunoUm);
        listaAlunos.add(alunoDois);

        // Imprimindo os dados dos alunos da lista
        for (Aluno aluno : listaAlunos) {
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Idade: " + aluno.getIdade());
            System.out.println("RM: " + aluno.getRm());
            System.out.println("--------------------");
        }

        // Utilizando um array para armazenar os objetos Aluno
        Aluno[] arrayAlunos = new Aluno[2];
        arrayAlunos[0] = alunoUm;
        arrayAlunos[1] = alunoDois;

        // Imprimindo os dados dos alunos do array
        for (Aluno aluno : arrayAlunos) {
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Idade: " + aluno.getIdade());
            System.out.println("RM: " + aluno.getRm());
            System.out.println("--------------------");
        }
    }
}
