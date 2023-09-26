package parte2ejercicio2;

import java.util.Scanner;

public class Parte2ejercicio2 {
	public static void main(String[] args) {
		int edad;
		boolean mayoria;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su edad");
		edad = sc.nextInt();
		mayoria = edad >= 18;
		System.out.println("¿Es usted mayor de edad? " + mayoria);
		sc.close();
	}

}
