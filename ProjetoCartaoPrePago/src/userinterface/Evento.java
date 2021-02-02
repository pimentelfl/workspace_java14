package userinterface;

import core.CartaoPrePago;

public class Evento {
	public static void main(String[] args) {
		CartaoPrePago cpp;
		
		cpp = new CartaoPrePago("1111 2222 3333 4444","Fabio", 2022,10,0.0);
		
		System.out.println(cpp);
		
	}

}
