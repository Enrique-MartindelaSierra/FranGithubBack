package funciones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicios {

	//6. Crea una función que reciba un array de números y devuelva su media
	public static double media(double... numeros) {
		double resultado = 0;
		for(double numero : numeros) {
			resultado += numero;
		}
		return resultado/numeros.length;		
	}
	
	public static double ejercicio6(double...numeros) {
		return Arrays.stream(numeros).average().getAsDouble();
	}
	
	/**
	 * Te devuelve un elemento aleatoriamente dentro de un conjunto de elementos
	 * En este caso trabajamos con cadenas
	 * @param cadenas
	 * @return
	 */
	public static String devolverAzar(String[] cadenas) {
		return cadenas[new Random().nextInt(cadenas.length)];
	}
	
	/**
	 * Mostrar por pantalla todos los elementos dentro de un conjunto
	 * @param cadenas
	 */
	public static void mostrarElementos(String[] cadenas) {
		/*for(String cadena : cadenas) {  // Programación estructurada
			System.out.println(cadena);
		}*/
		Arrays.stream(cadenas).forEach(e->System.out.println(e));  // Programación funcional
	}
	
	/**
	 * Crea una función que reciba un array de cadenas por parámetro y devuelva una de las
	 * cadenas al azar. Pista: puedes generar un número aleatorio entre 0 y la última
	 * posición del array usando new Random().nextInt(array.length).
	 * A continuación pide al usuario que adivine la palabra seleccionada (tiene 3 intentos,
	 * usa un bucle). Si la acierta felicítale, y si no, dile cual era la correcta.
	 */
	public static void ejercicio7() {
		Scanner sc = new Scanner(System.in);
		final int MAXIMO_INTENTOS = 3;
		boolean acierto = false;
		String[] palabras = {"hola", "adiós", "mundo", "cruel", "fran", "eoi", "java", "javascript","html", "css"};
		String palabraAleatoria = devolverAzar(palabras);
		int intentos = 0;
		do {
			System.out.println("Introduzca una palabra (le quedan " + (MAXIMO_INTENTOS-intentos) + " intento" + ((MAXIMO_INTENTOS-intentos)==1?"): ":"s): "));
			mostrarElementos(palabras);
			String palabra = sc.nextLine();
			if(palabra.equals(palabraAleatoria)) {
				acierto = true;
			}
			intentos++;
		}while(intentos<MAXIMO_INTENTOS && !acierto);
		if(acierto) {  // He salido del bucle acertando
			System.out.println("Enhorabuena!. Acertaste.");
		} else {
			System.out.println("Gastaste tus intentos. La palabra era " + palabraAleatoria);
		}
		sc.close();
	}
	
	/**
	 * Crea una función que reciba un número indeterminado de parámetros enteros y
	 * devuelva el máximo. Ten en cuenta que si recibes cero números, debes devolver cero
	 * también.
	 */
	public static int ejercicio8(int...numeros) {
		int maximo = Integer.MIN_VALUE;
		if(numeros.length==0) {
			return 0;
		}
		for(int numero : numeros) {
			if(numero>maximo) {
				maximo = numero;
			}
		}
		return maximo;
	}
	
	public static int ejercicio8funcional(int...numeros) {
		return Arrays.stream(numeros).max().orElse(0);
	}
	
	/**
	 * Crea una función que reciba una cadena y una subcadena por parámetro y devuelva
	 * cuantas veces aparece la subcadena dentro de la cadena. Para ello debes saber que
	 * como segundo parámetro a indexOf le puedes pasar la posición a partir de la cual
	 * buscar (empezaríamos en cero). Cuando te devuelva -1 es que ya no la ha encontrado
	 * (utiliza un bucle).
	 * Por ejemplo, si recibimos “cocinando cocos con chocolate” y “co” devolveremos el
	 * número 5.
	 * @param cadena
	 * @param subcadena
	 * @return
	 */
	public static int ejercicio9(String cadena, String subcadena) {
		int posicionBuscar = 0;  // variable que almacena a partir de que posición buscar la subcadena
		int resultado = 0;  // veces que encuentra la subcadena
		while((posicionBuscar=cadena.indexOf(subcadena, posicionBuscar))!=-1) {  // Lo encuentra
			resultado++;
			posicionBuscar++;
		}
		return resultado;
	}
	
	public static int ejercicio9b(String cadena, String subcadena) {
		int numero=-1;
		int veces = 0;
		numero=cadena.indexOf(subcadena);		
		while(numero!=-1) {
			veces++;
			numero=cadena.indexOf(subcadena,numero+1);
		}
		return veces;
	}
	
	public static int ejercicio9c(String cadena, String subcadena) {
		// Busca a partir de que acabe la cadena que estoy buscando
		int veces = 0;
		Pattern patron = Pattern.compile(subcadena);
		Matcher coincidencia = patron.matcher(cadena);
		while(coincidencia.find()) {
			veces++;
		}
		return veces;
	}
	
	/**
	 * Crea una función que reciba un array de cadenas y te lo devuelva ordenado
	 * alfabéticamente de la ‘z’ a la ‘a’
	 */
	public static void ejercicio12(String[] cadenas) {
		//Arrays.sort(cadenas);  // Orden ascendente y se modifica fuera del método
		Arrays.sort(cadenas, Comparator.reverseOrder());  // orden descendente
	}
	
	/**
	 * Dada una fecha en formato "dd-mm-aaaa" la devuelve en LocalDate usando subString
	 * @param fechaCadena
	 * @return
	 */
	public static LocalDate convertirFechaSubstring(String fechaCadena) {
		// "27-07-1976"
		/*String dia = fechaCadena.substring(0, 2);   // "27"
		String mes = fechaCadena.substring(3, 5);   // "07"
		String anyo = fechaCadena.substring(6, 10); // "1976"
		LocalDate resultado = LocalDate.of(Integer.parseInt(anyo), Integer.parseInt(mes), Integer.parseInt(dia));
		return resultado;*/
		return LocalDate.of(Integer.parseInt(fechaCadena.substring(6, 10)),
				Integer.parseInt(fechaCadena.substring(3, 5)), 
				Integer.parseInt(fechaCadena.substring(0, 2)));
		
	}
	
	/**
	 * Dada una fecha en formato "dd-mm-aaaa" y un separador la devuelve en LocalDate usando split
	 * @param fechaCadena
	 * @return
	 */
	public static LocalDate convertirFechaSplit(String fechaCadena,String separador) {
		String[] partes = fechaCadena.split(separador);
		return LocalDate.of(Integer.parseInt(partes[2]),
				Integer.parseInt(partes[1]), 
				Integer.parseInt(partes[0]));
	}
	
	/**
	 * Dada una fecha en formato "dd-mm-aaaa" la devuelve en LocalDate usando DateTimeFormatter
	 * @param fechaCadena
	 * @return
	 */
	public static LocalDate convertirFechaDateTimeFormatter(String fechaCadena) {
		return LocalDate.parse(fechaCadena.replace("-","/"), DateTimeFormatter.ofPattern("d/M/y"));
	}
	
	/**
	 * Recibe una fecha y devuelve otra fecha con los dias, meses y años que le pasamos sumados
	 * @param fechaInicio fecha a la que queremos sumarle días, meses y años
	 * @param dias
	 * @param meses
	 * @param anyos
	 * @return
	 */
	public static LocalDate sumarTiempos(LocalDate fechaInicio, int dias, int meses, int anyos) {
		return fechaInicio.plusYears(anyos).plusMonths(meses).plusDays(dias);
	}
	
	/**
	 * Crea una función que reciba una fecha en formato dd-mm-yyyy, conviértela a fecha
	 * (LocalDate) utilizando la función subString o split para extraer el día, mes y año, o usa
	 * el DateTimeFormatter, súmale 2 años, 3 meses y 5 días, y muestra la fecha resultante.
	 * @param fechaCadena  Ej: "27-07-1976"
	 * @return
	 */
	public static LocalDate ejercicio15(String fechaCadena) {
		// Convertir el String en LocalDate de 3 formas posibles
		//LocalDate fecha = convertirFechaSubstring(fechaCadena);
		//LocalDate fecha = convertirFechaSplit(fechaCadena, "-");
		LocalDate fecha = convertirFechaDateTimeFormatter(fechaCadena);
		
		// Sumar tiempos a un LocalDate
		//fecha = fecha.plusYears(2).plusMonths(3).plusDays(5);
		fecha = sumarTiempos(fecha, 5, 3, 2);
		// Devolver el resultado
		return fecha;		
	}
	
	/**
	 * Dada una fecha inicial en formato cadena la convierte en LocalDate y le suma los días, meses y años
	 * pasados por parámetros. Ejemplos fechas de entrada: "27-07-1976", "27/07/1976"
	 * @param fechaCadena Fecha inicial de la cúal partimos
	 * @param dias Días que queremos sumar. Si no quieres sumar días pon 0.
	 * @param meses Meses que queremos sumar. Si no quieres sumar meses pon 0.
	 * @param anyos Años que queremos sumar. Si no quieres sumar años pon 0.
	 * @return
	 */
	public static LocalDate sumarTiemposCadenaFecha(String fechaCadena, int dias, int meses, int anyos) {
		LocalDate fecha = convertirFechaDateTimeFormatter(fechaCadena);
		fecha = sumarTiempos(fecha, dias, meses, anyos);
		return fecha;		
		//return sumarTiempos(convertirFechaDateTimeFormatter(fechaCadena), anyos, meses, dias);
	}
	
	public static void main(String[] args) {
		// Ejercicio 6
		/*double[] numeros = {12.45,14.18,25.94};
		System.out.println(Arrays.stream(numeros).sum());
		double media = media(12.45,14.18,25.94);
		System.out.println(media);
		double media2 = Arrays.stream(numeros).average().getAsDouble();
		System.out.println(Arrays.stream(numeros).average().getAsDouble());
		double otraMedia = media(numeros);
		System.out.println(otraMedia);*/
		
		//ejercicio7();
		
		// Ejercicio 8
		/*int maximo = ejercicio8(2,8,99,4,1000,9,8);
		System.out.println(maximo);  // 1000
		System.out.println(ejercicio8());  // 0
		System.out.println(ejercicio8(-2,-3,-10));  // -2
		System.out.println(ejercicio8funcional(2,8,99,4,1000,9,8));  // 1000
		System.out.println(ejercicio8funcional());  // 0
		System.out.println(ejercicio8funcional(-2,-3,-10));  // -2
		*/
		
		// ejercicio 9
		
		/*int veces = ejercicio9("cocinando cocos con chocolate","co");  // debe devolver 5
		System.out.println(veces);  // debe imprimir 5
		System.out.println(ejercicio9b("cocinando cocos con chocolate","co"));  // 5
		System.out.println(ejercicio9c("cocinando cocos con chocolate","co"));  // 5
		System.out.println(ejercicio9("cocinando cococos con chococolate","coco"));  // 3
		System.out.println(ejercicio9b("cocinando cococos con chococolate","coco"));  // 3
		System.out.println(ejercicio9c("cocinando cococos con chococolate","coco"));  // 2
		*/
		
		// ejercicio 12
		/*
		String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		ejercicio12(meses);  // meses se modifica el orden dentro del método
		for(String mes: meses) {
			System.out.println(mes);
		}
		System.out.println(Arrays.toString(meses));
		*/
		
		// ejercicio 15
		System.out.println(ejercicio15("27-07-1976"));
		System.out.println(sumarTiemposCadenaFecha("27-07-1976", 5, 3, 2));
	}

}
