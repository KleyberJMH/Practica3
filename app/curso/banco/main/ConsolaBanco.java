package app.curso.banco.main;

import java.util.HashMap;
import java.util.Scanner;
import app.curso.banco.entidad.Cliente;
import app.curso.banco.entidad.Gestor;


public class ConsolaBanco {

	public static void main(String[] args) {
		//Lista de Gestores
		HashMap<Integer, Gestor> gestores = new HashMap<>();
		//Lista de Clientes
		HashMap<Integer, Cliente> clientes = new HashMap<>();
		
		Scanner keyboard = new Scanner(System.in);
		int opcion;
		
		do
		{
			
			System.out.println("-------------------------------------------------------------------");
			System.out.println("Menu");
			System.out.println("-------------------------------------------------------------------");
			
			System.out.println("1. Crear Gestor");
			System.out.println("2. Crear Cliente");
			System.out.println("3. Mostrar Gestores");
			System.out.println("4. Mostrar Clientes");
			System.out.println("0. Salir");
			System.out.print("Ingrese el numero de la opcion: ");
			opcion = keyboard.nextInt();
			
			switch(opcion) {
			case 0: 
				System.out.println("Saliendo...");
				break;
			
			case 1: 
				System.out.println("Crear Gestor");
				System.out.print("Ingrese el id del gestor: ");
				int id = keyboard.nextInt();
				System.out.print("Ingrese el nombre del gestor: ");
				String name = keyboard.next();
				System.out.print("Ingrese el telefono del gestor: ");
				String telefono = keyboard.next();
				System.out.print("Ingrese el id de la oficina del gestor: ");
				int oficina = keyboard.nextInt();
				
				Gestor gestor = new Gestor(id, name, telefono,oficina);
				gestores.put(id, gestor);
				break;
				
			case 2:
				System.out.println("Crear Cliente");
				break;
				
			case 3: 
				System.out.println("---------------------------------------------------------------");
				System.out.println("Gestores");
				System.out.println("---------------------------------------------------------------");
				gestores.forEach((clave, valor)->{
					valor.mostrarInfo();
					System.out.println("---------------------------------------------------------------");
				});
				break;
				
			case 4:
				System.out.println("Mostrar Clientes");
				break;
				
			default: System.out.println("La opcion seleccionada no es valida... Ingrese una nuevamente");
			}
			
		}while(opcion != 0);
		keyboard.close();
		
			
		
		
		
		
		
//		
//		Cliente cliente = new Cliente(1, "Paco", "111111111");
//		Cliente cliente2 = new Cliente(2, "Ana", "222222222");
//		
//		Gestor gestor = new Gestor(1, "Pedro", "111111111",1);
//		Gestor gestor2 = new Gestor(2, "Juan", "222222222",2);
//		
//		cliente.abrirCuenta("ES123", 10.0f);
//		
//		
//		gestores.put(1, gestor);
//		gestores.put(2, gestor2);
//		
//		clientes.put(1, cliente);
//		clientes.put(2, cliente2);
//		
//		cliente2.abrirCuenta("ES456", 20.0f);
//		
//		System.out.println("---------------------------------------------------------------");
//		System.out.println("Gestores");
//		System.out.println("---------------------------------------------------------------");
//		gestores.forEach((clave, valor)->{
//			valor.mostrarInfo();
//			System.out.println("---------------------------------------------------------------");
//		});
//		
//		System.out.println("Clientes");
//		System.out.println("---------------------------------------------------------------");
//		clientes.forEach((clave, valor)->{
//			valor.mostrarInfo();
//			System.out.println("---------------------------------------------------------------");
//		});
//		
		

	}

}
