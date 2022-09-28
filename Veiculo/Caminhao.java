package br.com.newton.poo.carro;

public class Caminhao extends Veiculo {
	private int eixos;

	public Caminhao(String placa, int ano, int eixos) {
		super();
		this.placa = placa;
		this.ano = ano;
		this.eixos = eixos;
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	public void exibirDados() {		
		return;
	
	}
	
}
