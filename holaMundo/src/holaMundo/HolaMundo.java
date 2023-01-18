package holaMundo;

import java.util.Scanner;

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
	
	private static void ejemplosTipos1() {
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
		long largo1 = 2000000000;
		long largo2 = 1000000000;
		System.out.println("La suma de dos largos correctamente es: " + (largo1+largo2));
		char letraA = 'a';
		char letraB = 'b';
		System.out.println("La suma de letra a y letra a es: " + letraA + letraB);
		System.out.println("La suma de letra a y letra b es: " + (letraA+letraB));
		System.out.println("La suma de letra a mas 3 es: " + (letraA+3));  // 100
		System.out.println("La suma de letra a mas 3 es: " + (char)(letraA+3));  // 3
	}
	
	public static void ejemplosString() {
		
		String cadena1;   // String cadena1 = "Fran";
		cadena1 = "Fran";
		String cadena2 = "Hola", cadena3= "adiós";
		String cadena4 = cadena2 + cadena1;  // "HolaFran"
		String cadena5 = cadena2 + " " + cadena1;  // "Hola Fran"
		String prefijo = "34";  // variable que almacena el prefijo
		String telefono = "666666666";
		int numero = 40;
		System.out.print(prefijo + "-" + telefono);
		System.out.println("Otra cosa");
		System.out.printf("%s tiene %d años\n",cadena1,numero);
		System.out.println("Otra cosa");
		
		String fran = "Fran";
		//String int = "String";  // Da error
		
	}
	
	public static void ejemplosBoolean() {
		// Son valores que solo pueden almacenar true o false;
		boolean verdad = true;
		boolean falso = false;
		boolean comparacion1 = 10<18;  // true
		System.out.println(10<20);  // true;
		System.out.println(comparacion1);  // true;
		// Condiciones de comparación <,>,<=,>=,==,!=
		int numero1 = 10;
		int numero2 = 20;
		boolean c1 = 10<20; // true
		boolean c2 = 10>20;  // false
		boolean c3 = 20<=20; // true
		boolean c4 = 10>=20; // false
		boolean c5 = 10==20; // false
		boolean c6 = 10!=20; // true
		String cadena1 = "hola";
		String cadena2 = "adiós";
		String cadena3 = "hola";
		String cadena4 = "Hola";
		System.out.println(cadena1.equals(cadena2));  // false
		System.out.println(cadena1.equals(cadena3));  // true
		System.out.println(cadena1.equals(cadena4));  // false
		boolean cadenasIguales = cadena1.equals(cadena2);  // false
		numero1 = 5;
		double numero3 = 5.0;
		double numero4 = 5.1;
		System.out.println(numero1==numero3); // true o false? -> true
		System.out.println(numero1==numero4); // true o false? -> false
		System.out.println((11/2)==numero1); // true o false? -> true
		System.out.println((11.0/2)==numero1); // true o false? -> false
		System.out.println((11%2)==1); // true o false? -> true
		System.out.println((11%2)==0); // true o false? -> false
		System.out.println(23%4); // el resto de la división es 3
		
	}
	
	public static void tablasVerdad() {
		int edad = 25;
		int anyosCarnet = 6;
		String sexo = "Masculino";
		String nombre = "Pepe";
		boolean esPepeMayor = edad >= 18 && nombre.equals("Pepe");  // true
		System.out.println(esPepeMayor); // true
									//    true             &&   false  -> false
		boolean tieneDescuento = (sexo.equals("Masculino") && anyosCarnet > 10) || 
				(sexo.equals("Femenino") && anyosCarnet > 5); // false || false
		System.out.println(tieneDescuento); // false
		
		boolean estoQueDa = sexo.equals("Masculino") || anyosCarnet>5 && nombre.equals("Fran");
		System.out.println(estoQueDa); // true
		int numero = 7+4*5; // 27
	}
	
	public static void ejercicio3() {
		int valor1=6, valor2=6;
		System.out.println(valor1 + " es menor que " + valor2 + ": " + (valor1<valor2));  // false
		System.out.printf("%d y %d son iguales: %b \n",valor1,valor2,valor1==valor2); // true
		System.out.println(valor1>=valor2); // true
	}
	
	public static void algoritmoCesar() {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el texto a codificar: ");
        String text = scanner.nextLine();
        System.out.print("Ingresa el desplazamiento: ");
        int shift = scanner.nextInt();

        StringBuilder encodedText = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                int ascii = (int) c;
                ascii += shift;
                encodedText.append((char) ascii);
            } else {
                encodedText.append(c);
            }
        }

        System.out.println("Texto codificado: " + encodedText.toString());
	}

	public static void ejercicio5() {
		
	}
	
	
	public static void main(String[] args) {
		//ejemplosComentarios();
		//ejemplosTipos1();
		//algoritmoCesar();
		//ejemplosString();
		//ejemplosBoolean();
		//ejercicio3();
		//tablasVerdad();
		ejercicio5();
	}

}
