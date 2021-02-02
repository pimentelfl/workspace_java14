
public class Empresa {
	public static void main(String[] args) {
		Employee e1, e2;
		
		e1 = new Employee();
		e2 = new Employee();
		
		e1.nome = "Fabio Pimentel";
		e1.cargo = "Coordenador Engenharia";
		e1.salario = 10000;
		
		e2.nome = "Fabio Luiz";
		e2.cargo = "Gerente Engenharia";
		e2.salario = 20000;
		
		e1.imprimirInfo();
		e2.imprimirInfo();
		
		e1.aumentarSalario(10);
		e2.aumentarSalario(15);
		
		e1.imprimirInfo();
		e2.imprimirInfo();	
				
	}

}
