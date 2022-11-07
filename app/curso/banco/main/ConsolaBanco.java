package app.curso.banco.main;

import java.util.HashMap;
import java.util.Scanner;
import app.curso.banco.entidad.*;
import app.curso.banco.util.Utiles;

public class ConsolaBanco {

	public static void main(String[] args) {
		//Lista de Gestores
		HashMap<Integer, Gestor> gestores = new HashMap<>();
		//Lista de Clientes
		HashMap<Integer, Cliente> clientes = new HashMap<>();
		//Lista de Mensajes
		HashMap<Integer, Mensaje> mensajes = new HashMap<>();
		//Lista de Transferencias
		HashMap<Integer, Transferencia> transferencias = new HashMap<>();
		int ultimoIdGestor = 0;
		int ultimoIdCliente = 0;
		int ultimoIdMensaje = 0;
		int ultimoIdTransferencia = 0;
		
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
			System.out.println("12. Enviar un mensaje");
			System.out.println("13. Ver un mensaje por id");
			System.out.println("14. Ver todos los mensajes");
			System.out.println("15. Hacer una transferencia");//Crea la transferencia pero no edita el saldo de los clientes
			System.out.println("16. Ver una transferencia por id");
			System.out.println("17. Ver todas las transferencias");
			System.out.println("18. Login");
			System.out.println("19. Registro");
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
				System.out.print("Ingrese el nombre del cliente: ");
				String nombreCliente = keyboard.next();
				System.out.print("Ingrese el telefono del cliente: ");
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
				System.out.print("Ingrese el id del cliente a actualizar: ");
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
					
					System.out.println("Se ha actualizado el cliente");
				}else
				{
					System.out.println("El Cliente solicitado no existe");
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
				
			case 12:
				//Enviar Mensaje
				Character emisor = null;
				Character receptor = null;
				System.out.println("Tipo del emisor");
				System.out.println("1. Cliente");
				System.out.println("2. Gestor");
				System.out.print("Escriba el numero del tipo: ");					
				int tipoEmisor = keyboard.nextInt();
				System.out.print("Id del emisor: ");							
				int idEmisor = keyboard.nextInt();
				
				System.out.print("1. Cliente");
				System.out.print("2. Gestor");
				System.out.print("Tipo del receptor: ");							
				int tipoReceptor = keyboard.nextInt();
				System.out.print("Id del receptor: ");							
				int idReceptor = keyboard.nextInt();
				
				System.out.print("Mensaje: ");							
				String textoMensaje = keyboard.next();
				
				if (tipoEmisor == 1) {
					emisor = Mensaje.TIPO_CLIENTE;
				}else if (tipoEmisor == 2) {
					emisor = Mensaje.TIPO_GESTOR;
				}else {
					System.out.println("El tipo de emisor es invalido");
				}
				
				if (tipoReceptor == 1) {
					receptor = Mensaje.TIPO_CLIENTE;
				}else if (tipoReceptor == 2) {
					receptor = Mensaje.TIPO_GESTOR;
				}else {
					System.out.println("El tipo de receptor es invalido");
				}
				
				ultimoIdMensaje++;
				Mensaje nuevoMensaje = new Mensaje (ultimoIdMensaje, emisor, idEmisor, receptor, idReceptor, textoMensaje);
				mensajes.put(ultimoIdMensaje, nuevoMensaje);
				break;
				
			case 13:
				//Leer un mensaje
				System.out.print("Ingrese el id del mensaje solicitado: ");
				int idMensaje = keyboard.nextInt();
				Mensaje selectedMensaje = mensajes.get(idMensaje);
				if(selectedMensaje != null)
				{
					System.out.println("\n---------------------------------------------------------------");
					System.out.println("Mensaje id: " + selectedMensaje.getId());
					System.out.println("---------------------------------------------------------------");
					System.out.println("Emisor: " + selectedMensaje.getTipoEmisor() + selectedMensaje.getIdEmisor());
					System.out.println("Receptor: " + selectedMensaje.getTipoReceptor() + selectedMensaje.getIdReceptor());
					System.out.println("Mensaje: " + selectedMensaje.getTextoMensaje());
				}else
				{
					System.out.println("El mensaje solicitado no existe");
				}
				break;
				
			case 14:
				//Mostrar todos los mensajes
				System.out.println("\n---------------------------------------------------------------");
				System.out.println("Mensajes");
				System.out.println("---------------------------------------------------------------");
				mensajes.forEach((clave, dato)->{
					System.out.println("Mensaje Id: " + dato.getId());
					System.out.println("Emisor: " + dato.getTipoEmisor() + dato.getIdEmisor());
					System.out.println("Receptor: " + dato.getTipoReceptor() + dato.getIdReceptor());
					System.out.println("Mensaje: " + dato.getTextoMensaje());
					System.out.println("---------------------------------------------------------------");
				});
				break;
				
			case 15:
				//Realizar transferencia
				System.out.print("Id del emisor: ");							
				int idEmisorT = keyboard.nextInt();

				System.out.print("Id del receptor: ");							
				int idReceptorT = keyboard.nextInt();
				
				System.out.print("Monto a transferir: ");							
				float monto = keyboard.nextFloat();
				
				System.out.print("Mensaje: ");							
				String concepto = keyboard.next();
				
				Cliente emisorT = clientes.get(idEmisorT);
				Cliente receptorT = clientes.get(idReceptorT);
				if (emisorT != null && receptorT != null)
				{
					ultimoIdTransferencia++;
					Transferencia transferencia = new Transferencia (ultimoIdTransferencia, Mensaje.TIPO_CLIENTE , idEmisorT, Mensaje.TIPO_CLIENTE, idReceptorT, concepto, monto);
					transferencias.put(ultimoIdTransferencia, transferencia);
					
				}else
				{
					System.out.println("El emisor o receptor no existe");
				}
				break;
				
			case 16:
				//Mostrar una transferencia
				System.out.print("Ingrese el id del transferencia solicitado: ");
				int idTransferencia = keyboard.nextInt();
				Transferencia selectedTransferencia = transferencias.get(idTransferencia);
				if(selectedTransferencia != null)
				{
					System.out.println("\n---------------------------------------------------------------");
					System.out.println("Mensaje id: " + selectedTransferencia.getId());
					System.out.println("---------------------------------------------------------------");
					System.out.println("Emisor: " + selectedTransferencia.getTipoEmisor() + selectedTransferencia.getIdEmisor());
					System.out.println("Receptor: " + selectedTransferencia.getTipoReceptor() + selectedTransferencia.getIdReceptor());
					System.out.println("Mensaje: " + selectedTransferencia.getTextoMensaje());
					System.out.println("Monto: " + selectedTransferencia.getMonto());
				}else
				{
					System.out.println("El mensaje solicitado no existe");
				}
				break;
				
			case 17:
				//Mostrar todas las transferencias
				System.out.println("\n---------------------------------------------------------------");
				System.out.println("Transferencias");
				System.out.println("---------------------------------------------------------------");
				transferencias.forEach((clave, dato)->{
					System.out.println("Transferencia Id: " + dato.getId());
					System.out.println("Emisor: " + dato.getIdEmisor());
					System.out.println("Receptor: " + dato.getIdReceptor());
					System.out.println("Mensaje: " + dato.getTextoMensaje());
					System.out.println("Monto: " + dato.getMonto());
					System.out.println("---------------------------------------------------------------");
				});
				break;
				
			case 18:
				//Login
					System.out.print("Ingrese su id: ");
					int idLogin = keyboard.nextInt();
					
					System.out.print("Ingrese su contraseña: ");
					String passLogin = keyboard.next();
					Cliente clienteLogin = clientes.get(idLogin);
					String passCliente = clienteLogin.getPassword();
					boolean tienePass = passCliente != null;
					boolean loginCorrecto = tienePass && clienteLogin.getPassword().equals(passLogin);				
				
				if(loginCorrecto) {
					System.out.println("Iniciado sesion correctamente");
				}else {
					System.out.println("Hubo un error al iniciar sesion, intentelo de nuevo");
				}
				
				break;
				
			case 19:
					System.out.print("Ingrese id del cliente a registrar: ");
					int idRegistro = keyboard.nextInt();
					Cliente clienteRegistro = clientes.get(idRegistro);
					
					String passwordCliente = clienteRegistro.getPassword();
					boolean hasPass = passwordCliente != null;
					
					if(!hasPass) {
						System.out.print("Contraseña nueva: ");
						String newPassword = keyboard.next();
						clienteRegistro.setPassword(newPassword);
					}else
					{
						System.out.println("Ya esta registrado");
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
