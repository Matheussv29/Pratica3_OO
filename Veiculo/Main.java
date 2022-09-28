package br.com.newton.poo.carro;
import javax.swing.JOptionPane;

public class Main {
	static String placa;
	static int ano, eixos, assentos, opcao; 

	public static void main(String[] args) throws NumberFormatException {
	     
	     JOptionPane.showMessageDialog(null,"Dados do veiculo:"+"\n"+"\n"+"Placa: ZAB-4613\nAno: 2008", " Menssagem ", JOptionPane.DEFAULT_OPTION);
         
		 placa = JOptionPane.showInputDialog("Informe a placa do onibus: " );
	     ano = Integer.parseInt((String) JOptionPane.showInputDialog("Informe o ano do onibus: " ));
	     assentos = Integer.parseInt((String) JOptionPane.showInputDialog("Informe a quantidade de assentos do onibus: " ));
	     
	     JOptionPane.showMessageDialog(null,"Dados do onibus:"+"\n"+"\n"+"Placa: "+placa+"\nAno: "+ano+"\nAssentos: "+assentos, " Menssagem ", JOptionPane.DEFAULT_OPTION);
         
	     placa = JOptionPane.showInputDialog("Informe a placa do caminhao: " );
	     ano = Integer.parseInt((String) JOptionPane.showInputDialog("Informe o ano do caminhao: " ));
	     	     
	     JOptionPane.showMessageDialog(null,"Dados do onibus:"+"\n"+"\n"+"Placa: "+placa+"\nAno: "+ano, " Menssagem ", JOptionPane.DEFAULT_OPTION);
	     JOptionPane.showMessageDialog(null,"Numero de eixos: "+eixos," Menssagem ", JOptionPane.DEFAULT_OPTION);
         
	}

}