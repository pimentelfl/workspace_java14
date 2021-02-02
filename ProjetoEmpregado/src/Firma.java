
public class Firma {
	public static void main(String[] args) {
		Empregado e1, e2;

		e1 = new Empregado();
		e2 = new Empregado();

		e1.nome = "Fabio Pimentel";
		e1.cargo = "Coordenador";
		e1.salario = 10000.00;

		e2.nome = "Fabio Luiz";
		e2.cargo = "Gerente";
		e2.salario = 20000.00;

		e1.imprimirInfo();
		e2.imprimirInfo();
		
		e1.aumentarSalario(10);
		e2.aumentarSalario(15);
		
		e1.imprimirInfo();
		e2.imprimirInfo();
		
	}
}