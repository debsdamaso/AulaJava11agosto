package br.com.testevetor.beans;

public class Aluno extends Pessoa {

	private int rm;

	// construtor vazio
	public Aluno() {
		super();
	}
	//cheio
	
	public Aluno(String recebeNome, int recebeIdade, int recebeRm) {
		setNome(recebeNome);
		setIdade(recebeIdade);
	}
	
	public Aluno(int rm) {
		super();
		this.rm = rm;
	}
	//getter e setters
	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		this.rm = rm;
	}
	
	
}
