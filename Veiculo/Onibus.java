package br.com.newton.poo.carro;

public class Onibus extends Veiculo{
	private int assentos;

	public Onibus(String placa, int ano,int assentos) {
		super();
		this.placa = placa;
		this.ano = ano;
		this.assentos = assentos;
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	public void exibirDados() {		
		return;
	
	}
}
