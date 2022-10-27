package app.curso.banco.main;

import java.util.HashMap;
import app.curso.banco.entidad.*;

public class ConsolaBanco {

	public static void main(String[] args) {
		//Lista de Gestores
		HashMap<Integer, Gestor> gestores = new HashMap<>();
		//Lista de Clientes
		HashMap<Integer, Cliente> clientes = new HashMap<>();
		
		Cliente cliente = new Cliente(1, "Paco", "111111111");
		Cliente cliente2 = new Cliente(2, "Ana", "222222222");
		
		Gestor gestor = new Gestor(1, "Pedro", "111111111",1);
		Gestor gestor2 = new Gestor(2, "Juan", "222222222",2);
		
		cliente.abrirCuenta("ES123", 10.0f);
		
		
		gestores.put(1, gestor);
		gestores.put(2, gestor2);
		
		clientes.put(1, cliente);
		clientes.put(2, cliente2);
		
		cliente2.abrirCuenta("ES456", 20.0f);
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("Gestores");
		System.out.println("---------------------------------------------------------------");
		gestores.forEach((clave, valor)->{
			valor.mostrarInfo();
			System.out.println("---------------------------------------------------------------");
		});
		
		System.out.println("Clientes");
		System.out.println("---------------------------------------------------------------");
		clientes.forEach((clave, valor)->{
			valor.mostrarInfo();
			System.out.println("---------------------------------------------------------------");
		});
		
		

	}

}
