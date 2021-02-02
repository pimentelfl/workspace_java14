
public class Loja {
	public static void main(String[] args) {
		Produto p1;
		
		p1 = new Produto(1, "Computador", 2000.00);
		
		System.out.println(p1.exibirInfo());
		
		Produto p2;
		
		p2 = p1; //pergunta: dupliquei a area da memoria?
		
		// simulacao: vou alterar o preco do produto p2
		// de 2000.00 vai para 2500.00
		
		//se efetivamente, ao atribuir p2 = p1 nos duplicassemos a area
		// de memoria 
		
		p2.setPreco(2500.00);
		
		System.out.println("------- apos a alteracao de p2");
		System.out.println("p1 = "+ p1.exibirInfo());
		System.out.println("p2 = "+ p2.exibirInfo());
		
		
	}

}
