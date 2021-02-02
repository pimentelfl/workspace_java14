
public class ContaEspecial {
	int numConta;
	String nomeTitular;
	double saldo;
	double limite
	
	void creditar(double valor) {
		saldo += valor;
	}
	
	boolean debitar(double valor) {
		if(saldo+limite >= valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}
	
	String exibirInfo() {
		return numConta + " - " + nomeTitular + " R$ " +saldo; " R$ "+limite;
	}
}