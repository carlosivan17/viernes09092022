package Estructurapostprueba;

public class EstructuraDoWhile {

	public static void main(String[] args) {
		/*Estructura repetitivas
		 * Estructura preprueba
		 * Estructura while
		 * Estructura Do..While*/
		int num = 5;
		System.out.println("Ciclo While");
		while(num < 10) {
			num++;
			System.out.println("num = " + num);
		}
		//con el do while
		System.out.println("Ciclo Do While");
		do {
			num++;
			System.out.println("num = " + num);
		}while(num < 10);
		
		System.out.println("Fin del programa.");

	}

}
