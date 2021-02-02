/* Neste caso, a classe CARRO não terá método MAIN
 * ela será apenas uma estrutura que contém uma série de variaveis (atributos)
 * para armazenar todas as informações correspondentes a um carro
 * 
 * O que isso implica? Estamos criando um novo tipo de dado!!!
 * 
 */


public class Carro {
	// aqui basta criar varias variaveis (atributos)
	String 	marca;
	String 	modelo;
	int 	ano;
	String 	cor;
	double 	preco;

	void exibirAnuncio() {
		System.out.println("---- Anuncio do UCarros");
		System.out.println(" Carro: "+marca+" "+modelo+"/"+ano);
		System.out.println(" Cor: "+cor);
		System.out.println(" Preço: "+preco);
	}

	double calcularIPVA() {
		double valorIPVA;
		if (ano < 2000 ) {
			valorIPVA = 0.0;
		}
		else {
			valorIPVA = preco * 0.04;
		}
		return valorIPVA;
		}
	
	double calcularNovoPrecoComDesconto(double desconto) {
		double novoPreco = preco - preco * desconto / 100;
		return novoPreco;
		
	}

}
