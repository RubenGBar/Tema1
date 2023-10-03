package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
	
		/* declaración de la variable */
	int numero;
	
	Scanner sc = new Scanner(System.in);
	
	/* Le pido que introduzca su nombre */
	System.out.println("Introduzca un número:");
	numero = sc.nextInt();
	
	/* Impresión del resultado */
	System.out.println("Ha escrito " + numero);
	sc.close();
	
	}

}
