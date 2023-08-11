package br.com.testevetor.beans;

public class Pessoa {

	private String nome;
	private int idade;
	
	//construtor vazio
	public Pessoa() {
		super();
	}
	

	//construtor cheio
	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
}
