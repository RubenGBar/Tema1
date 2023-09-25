package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
	/* Le pido que introduzca su nombre */
	System.out.println("Introduzca un número:");
	Scanner sc = new Scanner(System.in);
	/* declaración de la variable */
	double numero;
	numero = sc.nextDouble();
	/* Impresión del resultado */
	System.out.println("Ha escrito " + numero);
	sc.close();
	
	}

}
