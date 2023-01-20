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

	public static void ejercicio5() {
		int N = 1;
		System.out.println("Valor inicial de N = " + N);
		//N = N + 77;  // N = 78
		N += 77;  // N = 78
		System.out.println("N + 77 = " + N);
		//N = N - 3;   // N = 75
		N -= 3;   // N = 75
		System.out.println("N - 3 = " + N);
		//N = N * 2;   // N = 150	
		N *= 2;   // N = 150	
		System.out.println("N * 2 = " + N);		
	}
	
	public static void ejercicio5b() {  // No es una solución correcta
		int N = 1;
		System.out.println("Valor inicial de N = " + N);  // ?
		System.out.println("N + 77 = " + (N+77));  // 78?
		System.out.println("N - 3 = " + (N-3));	// 75 o -2 -> -2
		System.out.println("N * 2 = " + N);		
	}
	
	public static void ejemplosIncrementosDecrementos() {
		int numero = 10;
		// pre-incremento
		++numero;  // 11
		System.out.println(numero);  // 11
		// post-incremento
		numero++;  // 12
		System.out.println(numero);  // 12
		// pre-decremento
		--numero;  // 11
		System.out.println(numero);  // 11
		// post-decremento
		numero--;  // 10
		System.out.println(numero);  // 10
		
		//// LO IMPORTANTE ES EL MOMENTO EN QUE INCREMENTA O DECREMENTA
		System.out.println(++numero);  // 10 u 11 ? -> 11 y número = 11
		System.out.println(numero++);  // 11 y número = 12
		System.out.println(numero);  // 12
		
		//System.out.println(++numero+numero++); // 26 (13 + 13) y luego numero=14  // a+b = b+a
		System.out.println(numero+++ ++numero); // 26 (13+13) y luego numero=14  // a+b = b+a
		System.out.println(numero);  // 14
		int numero2 = ++numero;  // numero2 = 15; numero = 15;
		System.out.println("numero2 = " + numero2 + " numero = " + numero);  // 15 y 15
		int numero3 = numero++;  // numero3 = 15; numero = 16;
		System.out.println("numero2 = " + numero3 + " numero = " + numero);
	}
	
	public static void ejemplosConstantes() {
		final double IVA = 0.21;
		final double PI = 3.1416;
		double precioVaquero = 50;
		System.out.println("El precio final es: " + (precioVaquero * (1+IVA)));
		//PI = 3.14159;  // daría error
	}
	
	public static void conversionesNumerosCadenas() {
		int numero = 10;
		String cadena = "11";
		System.out.println(cadena + numero);  // 1110
		// Convertir cadena a número
		System.out.println(Integer.parseInt(cadena) + numero);  // 21
		int prefijo=34;
		int telefono=666666666;
		System.out.println(prefijo+telefono); // 666666700
		System.out.println(""+prefijo+telefono); // 003466666666
		// Convertir numero a cadena
		System.out.println(String.valueOf(prefijo)+String.valueOf(telefono)); // 3466666666
		System.out.println("00" + prefijo + "-" + telefono);//0034-666666666
	}
	
	public static void ejercicio6() {
		// Ejemplo para almacenar valores iniciales de variables que podrán cambiar en el código
		int A = 1;
		int B = 2;
		int C = 3;
		int D = 4;
		int auxB = B;  // 2
		
		System.out.println("Valores iniciales: A = " + A + " B = " + B + " C = " + C + " D = " + D);
		B=C;  // B = 3
		System.out.println("B toma el valor de C -> B = " + B);
		C=A;
		System.out.println("C toma el valor de A -> C = " + C);
		A=D;
		System.out.println("A toma el valor de D -> A = " + A);
		D=auxB;
		System.out.println("D toma el valor de B -> D = " + D);
	}
	
	public static void ejemplosSaltos() {
		//System.out.println("Hola\n\tFran\nBien?");
		System.out.println("Elige una opción");
		System.out.println("\t1) Añadir producto");
		System.out.println("\t2) Borrar producto");
	}
	
	public static void ejemplosFormateos() {
		String fran = "Fran";
		String consuelo = "Consuelo";
		double salario1 = 95567.89;
		double salario2 = 2589.3674;
		
		System.out.printf("%-12s%14s\n","NOMBRE","SALARIO");
		System.out.println("--------------------------");
		System.out.printf("%-12s%14.2f€\n",fran,salario1);
		System.out.printf("%-12s%14.2f€\n",consuelo,salario2);		
	}
	
	public static void ejemplosScanner() {  // Leer de la consola
		Scanner sc = new Scanner(System.in); // Abro el Scanner
		System.out.println("Introduzca su nombre:");
		String nombre = sc.nextLine();  // En nombre tendré lo que ponga por pantalla el usuario hasta que pulsa Intro
		System.out.println("Introduzca su localidad");
		String localidad = sc.nextLine();
		System.out.println("Introduzca su salario:");
		double salario = sc.nextDouble();
		sc.nextLine();  // Limpiar el buffer
		System.out.println("Introduzca cuanto desearía ganar:");
		double salarioDeseado = sc.nextDouble();
		sc.nextLine();
		System.out.println("Hola " + nombre + " me encanta " 
		+ localidad + " y que usted gane " + salario + " y que quiera ganar " + salarioDeseado);
		sc.close();  // cerrar el Scanner
	}
	
	public static void ejemplosScanner2() {  // Leer de la consola
		Scanner sc = new Scanner(System.in); // Abro el Scanner
		System.out.println("Introduzca su nombre:");
		String nombre = sc.nextLine();  // En nombre tendré lo que ponga por pantalla el usuario hasta que pulsa Intro
		System.out.println("Introduzca su localidad");
		String localidad = sc.nextLine();
		System.out.println("Introduzca su salario:");
		double salario = Double.parseDouble(sc.next().replace(',', '.'));
		sc.nextLine();
		System.out.println("Introduzca cuanto desearía ganar:");
		double salarioDeseado = Double.parseDouble(sc.next().replace(',', '.'));
		sc.nextLine();
		System.out.println("Hola " + nombre + " me encanta " 
				+ localidad + " y que usted gane " + salario + " y que quiera ganar " + salarioDeseado);
		sc.close();  // cerrar el Scanner
	}
	
	public static void ejercicio15() {
		Scanner cs = new Scanner (System.in);
		final double IVA = 0.21;
		// Obtención de datos
		System.out.println("Enter the name of the product: ");
		String product1 = cs.nextLine();
		System.out.println("enter the value of the product: ");
		double value1 = Double.parseDouble(cs.next().replace(',', '.'));
		cs.nextLine();
		System.out.println("Enter the name of the product: ");
		String product2 = cs.nextLine();
		System.out.println("enter the value of the product: ");
		double value2 = Double.parseDouble(cs.next().replace(',', '.'));
		cs.nextLine();
		System.out.println("Enter the name of the product: ");
		String product3 = cs.nextLine();
		System.out.println("enter the value of the product: ");
		double value3 = Double.parseDouble(cs.next().replace(',', '.'));
		cs.nextLine();
		// Impresión de datos
		System.out.printf("-----------------------------\n");
		System.out.printf("%-15s%12s%12s\n","Name_Product", "Value", "IVA");
		System.out.printf("%-15s%11.2f$%11.2f$\n",product1,value1,value1*(1+IVA));
		System.out.printf("%-15s%11.2f$%11.2f$\n",product2,value2,value2*(1+IVA));
		System.out.printf("%-15s%11.2f$%11.2f$\n",product3,value3,value3*(1+IVA));
		cs.close();  // cerrar el Scanner
	}
	
	public static void ejercicio7() {
		char letra1 = 'b';
		char letra2 = 'k';
		System.out.println("'b' tiene la posición " + (int)letra1);
		System.out.println("'k' tiene la posición " + (int)letra2);
		System.out.println("La diferencia entre 'b' y 'k' es: "+ ((int)letra2-(int)letra1));		
		System.out.println("La diferencia entre 'b' y 'k' es: "+ ((int)(letra2-letra1)));		
	}
	
	public static void ejercicio4() {
		double v1=1;
		double v2=2;
		double v3=3;
		double v4=4;
		System.out.printf("%.0f ",v1);
		System.out.print(v2 + " ");
		System.out.print(v3 + " ");
		System.out.print(v4 + " ");
		System.out.println();
		System.out.println((v1+v2)*v3/v4);		
	}
	
	public static void main(String[] args) {
		//ejemplosComentarios();
		//ejemplosTipos1();
		//ejemplosString();
		//ejemplosBoolean();
		//ejercicio3();
		//tablasVerdad();
		//ejercicio5();
		//ejemplosIncrementosDecrementos();
		//ejemplosConstantes();
		//conversionesNumerosCadenas();
		//ejercicio6();
		//ejemplosSaltos();
		//ejemplosFormateos();
		//ejemplosScanner();
		//ejemplosScanner2();
		//ejercicio15();
		//ejercicio7();
		ejercicio4();
	}

}
