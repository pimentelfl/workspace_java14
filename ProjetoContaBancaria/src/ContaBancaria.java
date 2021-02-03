
public class ContaBancaria {
	private int 	numeroConta;
	private int 	digitoVerif;
	private String 	cpfTitular;
	private String 	nomeTitular;
	private double 	saldo;
	
	void modificarNumeroConta(int novoNumero) {
		if (novoNumero <= 0) {
			// Erro
		}
		numeroConta = novoNumero;
	}
	
	int consultarNumeroConta( ) {
		return numeroConta;
	}
	
	String exibirInfo() {
		return numeroConta+"-"+digitoVerif+" : "+nomeTitular+" ("+cpfTitular+") "+saldo;
		
	}
	
	void creditar(double valor) {
		saldo += valor;
	}
	boolean debitar(double valor) {
		if(valor <= saldo) {
			saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	

}
