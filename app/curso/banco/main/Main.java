package app.curso.banco.main;
import app.curso.banco.entidad.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("Clientes---------------------------------------------");
		Cliente c1 = new Cliente(1, "Pedro", "111111111", 0.0f);
		
		c1.mostrarInfo();
		c1.ingresarDinero(100.0f);
		c1.mostrarInfo();
		c1.retirarDinero(150.0f);
		c1.mostrarInfo();
		System.out.println("Gestores---------------------------------------------");
		Gestor g1 = new Gestor(2, "Juan", "222222222", 2);
		
		g1.mostrarInfo();
		g1.setOficina(5);
		g1.mostrarInfo();
		g1.setTelefono("333333333");
		g1.mostrarInfo();
	}

}
