package ejerciciosEstructuras;

public class Ejercicios {
	
	public static void ejercicio1() {
		int numero = 123456;
		if(numero%2==0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
		}
	}
	public static void ejercicio1b() {
		int numero = 123456;
		System.out.println((numero%2==0)?"El número es par":"El número es impar");
	}

	public static void main(String[] args) {
		
		ejercicio1();
		ejercicio1b();
	}

}
