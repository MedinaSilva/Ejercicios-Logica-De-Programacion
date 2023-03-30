package ejerciciosLogicaProgramacion;

import java.util.Scanner;

public class Inversa {
	public static void main(String[] args) {
		Scanner palabra = new Scanner(System.in);
		System.out.print("Ingrese una palabra: ");
		String entrada = palabra.nextLine();
		String inversa = "";
		System.out.println("Palabra introducida: " + entrada);

		for (int i = 0;i < entrada.length(); i++) {
			inversa = entrada.charAt(i) + inversa;
		} 
		System.out.println("Palabra al reves: " + inversa);
	}

}


