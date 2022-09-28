package br.com.newton.poo.carro;

public class Veiculo {
	protected String placa="";
	protected int ano=0;


	public Veiculo() {
		super();
	}

	public Veiculo(String placa, int ano) {
		super();
		this.placa = placa;
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	
	}
	public void exibirDados() {		
		return;
	
	
	}	

	}


