package ejerciciosArrays;

import java.util.Arrays;

public class EjerciciosArrays {
	
	public static void ejercicio1() {
		String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		int mesElegido = 7;
		System.out.println(meses[mesElegido-1]);
	}
	
	public static void ejercicio2() {
		int total = 0;
		Integer[] numeros = {23,48,19,14,5,1000000,90,9,17,27};
		// La lista de números introducidos (recorrer)
		for (int numero : numeros) {
			System.out.println(numero);
		}
		// La suma de los números
		for (int numero : numeros) {
			total += numero;
		}
		System.out.println("El total es: " + total);
		
		// La media de los números
		System.out.println((double)total/numeros.length);
		
		// El mayor y el menor de los números (crea un máximo y un mínimo provisional que
		// será igual al primer número del array, después vas comparando con el resto de
		// posiciones).
		int mayorProvisional = numeros[0];  // 23
		int menorProvisional = numeros[0];  // 23
		// Opción A:
		for (int numero : numeros) {
			if(numero>mayorProvisional)
				mayorProvisional = numero;
			if(numero<menorProvisional)
				menorProvisional = numero;
		}
		System.out.println("El número mayor es: " + mayorProvisional);
		System.out.println("El número menor es: " + menorProvisional);
		// Opción B:
		Arrays.sort(numeros);
		System.out.println("El número mayor es: " + numeros[numeros.length-1]);
		System.out.println("El número menor es: " + numeros[0]);
	}

	public static void main(String[] args) {
		//ejercicio1();
		ejercicio2();

	}

}
