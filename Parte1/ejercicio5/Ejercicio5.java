package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		double radio;
		double longitud;
		double area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el valor del radio de la circunferencia:");
		radio = sc.nextDouble();
		longitud = 2*Math.PI*radio;
		area = Math.PI*Math.pow(radio, 2);
		System.out.println("La circunferencia tiene una longitud de " + longitud + " centímetros y el area es de " + area + " centímetros");
		sc.close();
	}

}
