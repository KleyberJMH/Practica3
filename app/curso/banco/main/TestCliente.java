package app.curso.banco.main;
import app.curso.banco.entidad.Cliente;

public class TestCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(1, "Pedro", "111111111");
		
		cliente.abrirCuenta("ES123", 100.0f);
		cliente.mostrarInfo();
		cliente.ingresarDinero("ES123", 50.0f);
		cliente.mostrarInfo();
		cliente.retirarDinero("ES123", 150.0f);
		cliente.mostrarInfo();
		
		cliente.abrirCuenta("ES456", 100.0f);
		cliente.mostrarInfo();
		
		
		

	}

}
