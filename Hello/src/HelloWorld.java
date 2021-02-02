import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a;
		System.out.println("Primeiro Programa no Eclipse");
		System.out.println("Agora vai!!!");
		a = teclado.nextInt();
		System.out.println("Voce digitou = "+a);
				
		teclado.close();
	}
}
