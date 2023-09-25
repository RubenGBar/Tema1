package parte2ejercicio1;

import java.util.Scanner;

public class Parte2ejercicio1 {
	public static void main(String[] args) {
		final double KILO_MANZANA = 2.35;
		final double KILO_PERA = 1.95;
		double kilosM, kilosP, precioM, precioP;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca los kilos de manzana:");
		kilosM = sc.nextDouble();
		System.out.println("Introduzca los kilos de peras:");
		kilosP = sc.nextDouble();
		precioM = KILO_MANZANA*kilosM;
		precioP = KILO_PERA*kilosP;
		System.out.println("Se ha gastado en manzanas " + precioM + "€ y en peras " + precioP + "€");
		sc.close();
	}

}
