package app.curso.banco.main;
import app.curso.banco.entidad.Cliente;

public class Main {

	public static void main(String[] args) {
		Cliente c1 = new Cliente(1, "Pedro", "111111111");
		
		c1.mostrarInfo();

	}

}
