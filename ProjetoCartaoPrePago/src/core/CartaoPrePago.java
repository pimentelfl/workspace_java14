package core;

public class CartaoPrePago {
	protected String nomeTitular;
	protected String numeroCartao;
	protected int anoValidade;
	protected int mesValidade;
	protected double saldo;
	
	public CartaoPrePago(String nomeTitular, String numeroCartao, int anoValidade, int mesValidade, double saldo) {
		super();
		this.nomeTitular = nomeTitular;
		this.numeroCartao = numeroCartao;
		this.anoValidade = anoValidade;
		this.mesValidade = mesValidade;
		this.saldo = saldo;
	}
	
		
	@Override
	public String toString() {
		return "CartaoPrePago [nomeTitular=" + nomeTitular + ", numeroCartao=" + numeroCartao + ", anoValidade="
				+ anoValidade + ", mesValidade=" + mesValidade + ", saldo=" + saldo + "]";
	}



	public void adicionarCredito(double valor) {
		this.saldo += valor;
	}
	
	public boolean comprar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public String getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public int getAnoValidade() {
		return anoValidade;
	}
	public void setAnoValidade(int anoValidade) {
		this.anoValidade = anoValidade;
	}
	public int getMesValidade() {
		return mesValidade;
	}
	public void setMesValidade(int mesValidade) {
		this.mesValidade = mesValidade;
	}
	public double getSaldo() {
		return saldo;
	}
	
	

}
