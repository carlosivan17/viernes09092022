package Estructurapostprueba;

import java.util.Scanner;

public class Tablademultiplicar {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Tabla de multiplicacion: ");
		byte num = lector.nextByte();
		for(int i=1; i <= num; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
		}

	}

}
