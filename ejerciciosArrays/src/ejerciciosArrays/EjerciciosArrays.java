package ejerciciosArrays;

import java.util.Arrays;
import java.util.Scanner;

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
	
	
	public static void ejercicio13() {
		Scanner sc = new Scanner(System.in);
		String[][] productos = new String[10][3];  // Podemos almacenar hasta 10 productos con 3 campos
		//String[][] productos = {{"mesa","99,50","3"},{"silla","14,95","4"}};  // 2 productos con 3 campos
		
		// Obtener los datos de productos
		System.out.println("¿Cuántos productos desea almacenar? (máximo 10)");
		int numProductos = Integer.parseInt(sc.nextLine());
		if(numProductos>10 || numProductos<0) {
			System.out.println("No se pueden almacenar más de 10 productos o números negativos");
			sc.close();  // cierro el scanner porque el programa no va a llegar al final de la función
			return;  // salgo de la función
		} else {  // número entre 0 y 10
			for(int i=0;i<numProductos;i++) {
				System.out.println("Introduzca el nombre del producto " + (i+1));
				productos[i][0]=sc.nextLine();
				System.out.println("Introduzca el precio del producto " + (i+1));
				productos[i][1]=sc.nextLine();
				System.out.println("Introduzca la cantidad del producto " + (i+1));
				productos[i][2]=sc.nextLine();
			}
		}
		
		// Mostrar los datos
		System.out.printf("%-17s%10s%10s%10s\n","NOMBRE","PRECIO","CANTIDAD","TOTAL");
		/*for(int i=0; i<42;i++) {
			System.out.print("-");
		}*/		
		System.out.println(String.valueOf('-').repeat(47));
		for(int i=0;i<numProductos;i++) {  // Si usaramos datos fijos seria productos.length
			double precio = Double.parseDouble(productos[i][1].replace(',', '.'));
			int cantidad = Integer.parseInt(productos[i][2]);
			double total = precio * cantidad;
			System.out.printf("%-17s%9.2f€%10d%9.2f€\n",productos[i][0],precio,cantidad,total);
		}
		
		
		sc.close();
	}

	public static void main(String[] args) {
		//ejercicio1();
		//ejercicio2();
		ejercicio13();
		System.out.println("FIN");
	}

}
