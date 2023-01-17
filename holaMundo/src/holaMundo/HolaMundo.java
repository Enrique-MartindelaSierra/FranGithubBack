package holaMundo;


/**
 * Esta es la clase inicial del curso
 * @author Fran
 * @since 1.0
 */
public class HolaMundo {
	
	public static void ejemplosComentarios() {
		/*
		 * Este es mi primer programa
		 * Fran 17/01/2023
		 */
		// System.out.println("Hola Fran");
		System.out.println("Adiós mundo cruel!");
		System.out.println("Otra línea");
		System.out.println("Tercera línea");
		System.out.println("Tercera línea");
		System.out.println("Segunda línea");
		System.out.println("Arriba línea");
	}
	
	private static void ejemplosTipos() {
		// Número enteros
		int numero = 5;
		int numero2 = 7;
		int suma = numero + numero2;
		int resta = numero2 - numero;
		double division = (double)numero2/numero;
		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("La division es: " + division);
		System.out.println("La division sobre la marcha es: " + ((double)numero2/numero));
		// Número con decimales
		double decimales1 = 3.14;
		double decimales2 = 2.22;
		System.out.println("La multiplicación es: "+ decimales1*decimales2);
		System.out.println("La suma es: "+ (decimales1+decimales2));
		double sumadecimales = numero + decimales1;
		System.out.println("Suma con decimales es: " + sumadecimales);
		// Enteros largos
		int maxInt = Integer.MAX_VALUE; // 2147483647
		int minInt = Integer.MIN_VALUE; // -2147483648
		System.out.println("Suma de dos largos: " + (maxInt+minInt));
		
	}

	public static void main(String[] args) {
		//ejemplosComentarios();
		ejemplosTipos();
	}

}
