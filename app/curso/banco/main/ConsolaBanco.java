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
			System.out.println("5. Mostrar Gestor Especifico");
			System.out.println("6. Mostrar Cliente Especifico");
			System.out.println("0. Salir");
			System.out.print("Ingrese el numero de la opcion: ");
			opcion = keyboard.nextInt();
			
			switch(opcion) {
			case 0: 
				System.out.println("Saliendo...");
				break;
			
			case 1: 
				//Crear un gestor
				System.out.print("Ingrese el id del gestor: ");
				int id = keyboard.nextInt();
				System.out.print("Ingrese el nombre del gestor: ");
				String nombre = keyboard.next();
				System.out.print("Ingrese el telefono del gestor: ");
				String telefono = keyboard.next();
				System.out.print("Ingrese el id de la oficina del gestor: ");
				int oficina = keyboard.nextInt();
				
				Gestor gestor = new Gestor(id, nombre, telefono,oficina);
				gestores.put(id, gestor);
				break;
				
			case 2:
				//Crear un cliente
				System.out.print("Ingrese el id del cliente: ");
				int idCliente = keyboard.nextInt();
				System.out.print("Ingrese el nombre del gestor: ");
				String nombreCliente = keyboard.next();
				System.out.print("Ingrese el telefono del gestor: ");
				String telefonoCliente = keyboard.next();
				
				Cliente cliente = new Cliente(idCliente, nombreCliente, telefonoCliente);
				clientes.put(idCliente, cliente);
				break;
				
			case 3: 
				//Mostrar todos los gestores
				System.out.println("\n---------------------------------------------------------------");
				System.out.println("Gestores");
				System.out.println("---------------------------------------------------------------");
				gestores.forEach((clave, valor)->{
					valor.mostrarInfo();
					System.out.println("---------------------------------------------------------------");
				});
				break;
				
			case 4:
				//Mostrar todos los clientes
				System.out.println("\n---------------------------------------------------------------");
				System.out.println("Clientes");
				System.out.println("---------------------------------------------------------------");
				clientes.forEach((clave, valor)->{
					valor.mostrarInfo();
					System.out.println("---------------------------------------------------------------");
				});
				break;
				
			case 5:
				//Mostrar un gestor por id (si existe)
				System.out.print("Ingrese el id del gestor solicitado: ");
				int idGestor = keyboard.nextInt();
				Gestor selectedGestor = gestores.get(idGestor);
				if(selectedGestor != null)
				{
					System.out.println("\n---------------------------------------------------------------");
					System.out.println("Gestor: " + selectedGestor.getId());
					System.out.println("---------------------------------------------------------------");
						selectedGestor.mostrarInfo();
				}else
				{
					System.out.println("El Gestor solicitado no existe");
				}
				break;
				
			case 6:
				//Mostrar un cliente por id (si existe)
				System.out.print("Ingrese el id del cliente solicitado: ");
				int idClient = keyboard.nextInt();
				Cliente selectedCliente = clientes.get(idClient);
				if(selectedCliente != null)
				{
					System.out.println("\n---------------------------------------------------------------");
					System.out.println("Cliente: " + selectedCliente.getId());
					System.out.println("---------------------------------------------------------------");
						selectedCliente.mostrarInfo();
				}else
				{
					System.out.println("El Cliente solicitado no existe");
				}
				
				break;
				
			default: 
				//Opcion por defecto
				System.out.println("La opcion seleccionada no es valida... Ingrese una nuevamente");
			}
			
		}while(opcion != 0);
		keyboard.close();
	}

}
