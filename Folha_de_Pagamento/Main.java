
package br.com.newton.lp.atividade3;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws NumberFormatException{
        double salario, percentual, valor, vendas;
        String nome;
        int matricula, producao, opcao;
        
        nome = JOptionPane.showInputDialog("Informe seu nome: " );
        matricula = Integer.parseInt((String) JOptionPane.showInputDialog(nome+" informe sua matricula: " ));
       
        do {
        	  opcao = Integer.parseInt((String) JOptionPane.showInputDialog("Escolha uma opção a baixo:\n\n<1>  Funcionario Padrao\n<2>  Funcionario Comissionado\n<3>  Funcionario Produtividade\n<4>  Sair\n "));

              switch (opcao) {
                    case 1:
                        salario = Double.parseDouble((String) JOptionPane.showInputDialog("Informe o seu salario fixo: "));
                        FPadrao fPadrao = new FPadrao(matricula, nome, salario);
                        
                        double provento = fPadrao.calcularProventos();
                        
                        JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nMatricula: "+matricula+"\n "+"\nValor a receber: R$"+provento, " Folha de Pagamento ", JOptionPane.DEFAULT_OPTION);
                        break;
                    case 2:
                    	salario = Double.parseDouble((String) JOptionPane.showInputDialog("Salario Fixo: "));
                    	percentual = Double.parseDouble((String) JOptionPane.showInputDialog("Percentual pelas vendas realizadas: "));
                    	vendas = Double.parseDouble((String) JOptionPane.showInputDialog("Vendas realizadas: "));
                        FComissionado fcomissionado = new FComissionado(matricula, nome, salario, percentual, vendas);
                        
                        provento = fcomissionado.calcularProventos();
                        
                        JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nMatricula: "+matricula+"\n "+"\nValor a receber: R$"+provento, " Folha de Pagamento ", JOptionPane.DEFAULT_OPTION);
                        break;
                    case 3:
                    	salario = Double.parseDouble((String) JOptionPane.showInputDialog("Salario Fixo: "));
                        valor= Double.parseDouble((String)JOptionPane.showInputDialog("Valor por unidade produzida: "));
                        producao = Integer.parseInt((String)JOptionPane.showInputDialog("Unidade produzida: "));
                        FProdutividade fprodutividade = new FProdutividade(matricula, nome, valor, salario, producao);
                                                                     
                        provento = fprodutividade.calcularProventos();
                        
                        JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nMatricula: "+matricula+"\n "+"\nValor a receber: R$"+provento, " Folha de Pagamento ", JOptionPane.DEFAULT_OPTION);
                        break;
                    case 4:
                    default:

                        break;             
              }
		
        }while(opcao !=4 );
	}

}
