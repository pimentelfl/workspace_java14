import java.util.Scanner;

public class Banco {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ContaBancaria c1 = new ContaBancaria();
		
		int opcao;
		double valor;
	
		c1.setNumeroConta(12345);
		c1.setDigitoVerif(6);
		c1.setCpfTitular("123.456.789-00");
		c1.setNomeTitular("Fabio LP");
		c1.setSaldo(0.0);
		
		do {
			System.out.println("Banco FPItau - Feito para voce");
			System.out.println("Digite 1 - Deposito / 2 - Saque / 3 - Infor / 0 - Encerrar");
			opcao = teclado.nextInt();
			switch(opcao) {
			case 1:
				System.out.print("Digite o valor do Deposito:");
				valor = teclado.nextDouble();
				c1.creditar(valor);
				break;
			case 2:
				System.out.println("Digite o valor do Saque:");
				valor = teclado.nextDouble();
				
				if (c1.debitar(valor)) {
					System.out.println("Saque autorizado!");
				}
				else {
					System.out.println("Saque não autorizado");
				}
				break;
			case 3:
					System.out.println(c1.exibirInfo());
					break;
			case 4:
					System.out.println("Obrigado pela preferencia");
					break;
			default:
					System.out.println("Opcao invalida! Tente novamente");
			}
		
		} while (opcao != 0);
		teclado.close();
	}	
}
