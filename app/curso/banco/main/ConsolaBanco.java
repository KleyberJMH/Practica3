package app.curso.banco.main;

import java.util.HashMap;
import java.util.Scanner;
import app.curso.banco.entidad.Cliente;
import app.curso.banco.entidad.Gestor;
import app.curso.banco.util.Utiles;

//Realizado hasta el ejercicio 11
//Falta aun
//12. Obtención de un mensaje.
//13. Obtención de todos los mensajes.
//14. Envío de un mensaje.
//15. Obtención de una transferencia.
//16. Obtención de todas las trasferencias
//17. Envío de una transferencia.
//18. Login y registro.

public class ConsolaBanco {

	public static void main(String[] args) {
		//Lista de Gestores
		HashMap<Integer, Gestor> gestores = new HashMap<>();
		//Lista de Clientes
		HashMap<Integer, Cliente> clientes = new HashMap<>();
		
		int ultimoIdGestor = 0;
		int ultimoIdCliente = 0;
		
		Scanner keyboard = new Scanner(System.in);
		int opcion;
		
		do
		{
			
			System.out.println("-------------------------------------------------------------------");
			System.out.println("Menu");
			System.out.println("-------------------------------------------------------------------");
			
			System.out.println("1. Crear Gestor");
			System.out.println("2. Crear Cliente");
			System.out.println("3. Mostrar todos los Gestores");
			System.out.println("4. Mostrar todos Clientes");
			System.out.println("5. Mostrar un Gestor");
			System.out.println("6. Mostrar un Cliente");
			System.out.println("7. Actualizar un Gestor"); 
			System.out.println("8. Actualizar un Cliente");
			System.out.println("9. Eliminar un Gestor");
			System.out.println("10. Eliminar un Cliente");
			System.out.println("11. Crear X cantidad de gestores aleatorios");
			System.out.println("0. Salir");
			System.out.print("Ingrese el numero de la opcion: ");
			opcion = keyboard.nextInt();
			
			switch(opcion) {
			case 0: 
				System.out.println("Saliendo...");
				break;
			
			case 1: 
				//Crear un gestor
				ultimoIdGestor++;
				System.out.print("Ingrese el nombre del gestor: ");
				String nombre = keyboard.next();
				System.out.print("Ingrese el telefono del gestor: ");
				String telefono = keyboard.next();
				System.out.print("Ingrese el id de la oficina del gestor: ");
				int oficina = keyboard.nextInt();
				
				Gestor gestor = new Gestor(ultimoIdGestor, nombre, telefono,oficina);
				gestores.put(ultimoIdGestor, gestor);
				break;
				
			case 2:
				//Crear un cliente
				ultimoIdCliente++;
				System.out.print("Ingrese el nombre del gestor: ");
				String nombreCliente = keyboard.next();
				System.out.print("Ingrese el telefono del gestor: ");
				String telefonoCliente = keyboard.next();
				
				Cliente cliente = new Cliente(ultimoIdCliente, nombreCliente, telefonoCliente);
				clientes.put(ultimoIdCliente, cliente);
				break;
				
			case 3: 
				//Mostrar todos los gestores
				System.out.println("\n---------------------------------------------------------------");
				System.out.println("Gestores");
				System.out.println("---------------------------------------------------------------");
				gestores.forEach((clave, dato)->{
					System.out.println(clave);
					dato.mostrarInfo();
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
				
			case 7:
				//Actualizar un gestor
				System.out.print("Ingrese el id del gestor a actualizar: ");
				int idGUpdate = keyboard.nextInt();
				Gestor gestorUpdated = gestores.get(idGUpdate);
				if(gestorUpdated != null) {
					System.out.println("NOTA: Si no desea cambiar el dato ingrese 0");
					System.out.print("Ingrese el nombre del gestor: ");
					String nombreGUpdate = keyboard.next();
					System.out.print("Ingrese el telefono del gestor: ");
					String telefonoGUpdate = keyboard.next();
					System.out.print("Ingrese el id de la oficina del gestor: ");
					int oficinaGUpdate = keyboard.nextInt();

					if(!nombreGUpdate.equals("0")) {
						gestorUpdated.setNombre(nombreGUpdate);
					}
					
					if(!telefonoGUpdate.equals("0"))
					{
						gestorUpdated.setTelefono(telefonoGUpdate);
					}
					
					if (oficinaGUpdate != 0) {
						gestorUpdated.setOficina(oficinaGUpdate);
					}
					
					System.out.println("Se ha actualizado el gestor");
				}else
				{
					System.out.println("El Gestor solicitado no existe");
				}
				break;
				
			case 8:
				//Actualizar un cliente
				System.out.print("Ingrese el id del gestor a actualizar: ");
				int idCUpdate = keyboard.nextInt();
				Cliente clienteUpdated = clientes.get(idCUpdate);
				if(clienteUpdated != null) {
					System.out.println("NOTA: Si no desea cambiar el dato ingrese 0");
					System.out.print("Ingrese el nombre del cliente: ");
					String nombreCUpdate = keyboard.next();
					System.out.print("Ingrese el telefono del cliente: ");
					String telefonoCUpdate = keyboard.next();

					if(!nombreCUpdate.equals("0")) {
						clienteUpdated.setNombre(nombreCUpdate);
					}
					
					if(!telefonoCUpdate.equals("0"))
					{
						clienteUpdated.setTelefono(telefonoCUpdate);
					}
					
					System.out.println("Se ha actualizado el gestor");
				}else
				{
					System.out.println("El Gestor solicitado no existe");
				}
				break;
				
			case 9:
				//Eliminar un gestor
				System.out.print("Ingrese el id del gestor a eliminar: ");
				int idGDelete = keyboard.nextInt();
				Gestor gestorDeleted = gestores.get(idGDelete);
				if(gestorDeleted != null) {
					gestores.remove(idGDelete);
					System.out.println("Se ha eliminado el gestor");
				}else
				{
					System.out.println("El gestor solicitado no existe");
				}
				break;
				
			case 10:
				//Eliminar un cliente
				System.out.print("Ingrese el id del cliente a eliminar: ");
				int idCDelete = keyboard.nextInt();
				Cliente clienteDeleted = clientes.get(idCDelete);
				if(clienteDeleted != null) {
					clientes.remove(idCDelete);
					System.out.println("Se ha eliminado el cliente");
				}else
				{
					System.out.println("El cliente solicitado no existe");
				}
				break;
				
			case 11:
				//Crear Gestor Aleatorios
				System.out.print("Cuantos gestores desea crear: ");
				
				int cantGestores = keyboard.nextInt();
				
				for (int i = 0; i<cantGestores; i++) {
					ultimoIdGestor++;
					String nombreRandom = Utiles.generarNombreRandom();
					int oficinaRandom = Utiles.generarOficinaRandom();
					String telefonoRandom = Utiles.generarTelefonoRandom();
					
					Gestor gestorAleatorio = new Gestor(ultimoIdGestor, nombreRandom, telefonoRandom,oficinaRandom);
					gestores.put(ultimoIdGestor, gestorAleatorio);
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
