package br.com.testevetor.teste;

import javax.swing.JOptionPane;
import br.com.testevetor.beans.Aluno;

public class Teste2 {

    public static void main(String[] args) {
        // variaveis de apoio, receber os valores nas variaveis
        String recebeNome = "";
        int recebeIdade = 0;
        int recebeRm = 0;

        // instanciar o vetor objeto aluno de 3 posições com o nome alunos	
        Aluno[] alunos = new Aluno[13];

        // for (int i = 0; i < 3; i++) {
        for (int i = 0; i < alunos.length; i++) {
            recebeNome = JOptionPane.showInputDialog("Digite seu nome");
            recebeIdade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
            recebeRm = Integer.parseInt(JOptionPane.showInputDialog("Digite seu Rm"));

            // instanciar o objeto aluno na posição i
            alunos[i] = new Aluno();
            alunos[i].setNome(recebeNome);
            alunos[i].setIdade(recebeIdade);
            alunos[i].setRm(recebeRm);
        }

        // Saída dos dados dos alunos
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Aluno " + (i + 1));
            System.out.println("Nome: " + alunos[i].getNome());
            System.out.println("Idade: " + alunos[i].getIdade());
            System.out.println("RM: " + alunos[i].getRm());
            System.out.println("--------------------");
        }
    }
}
