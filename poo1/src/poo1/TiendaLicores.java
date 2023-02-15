package poo1;


// Si pones el modificador final a una clase, no se podrá heredar de ella
public final class TiendaLicores extends Tienda {

	@Override
	public void bienvenida() {
		super.bienvenida();
		System.out.println("Si eres menor de 18 fuera de aquí!");
	}

	
	
	

}
