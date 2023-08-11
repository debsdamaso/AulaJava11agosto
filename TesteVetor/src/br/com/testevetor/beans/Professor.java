package br.com.testevetor.beans;

public class Professor extends Pessoa {

	private double salario;

	public Professor() {
		super();
	}

	public Professor(String recebeNome, int recebeIdade, double recebeSalario) {
		setNome(recebeNome);
		setIdade(recebeIdade);
		setSalario (recebeSalario);
	}
	public Professor(double salario) {
		super();
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
