package br.com.newton.lp.atividade3;

public class Funcionario {
		
	private int matricula;
	private String nome;
	private double salario;

	public Funcionario(int matricula, String nome, double salario) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.salario = salario;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}


	
	@Override
	public String toString() {
		return "Funcionario [matricula=" + matricula + ", nome=" + nome + ", salario=" + salario + "]";
	}

	public double calcularProventos() {		
		return salario;
	}
}
