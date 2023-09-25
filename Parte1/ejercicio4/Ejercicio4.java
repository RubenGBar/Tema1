package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		double matematicas;
		double biologia;
		double sumaTotal;
		double media;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la nota de sus asignaturas.");
		System.out.println("Matemáticas:");
		matematicas = sc.nextDouble();
		System.out.println("Biología:");
		biologia = sc.nextDouble();
		sumaTotal = matematicas+biologia;
		media = sumaTotal/2;
		System.out.println("Su nota media es de " + media);
		sc.close();
	}

}
