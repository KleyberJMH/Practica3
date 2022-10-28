package app.curso.banco.util;
import java.util.Random;

public class Utiles {
	public static final String[] NOMBRES = {"Juan", "Pedro", "Paco", "Maria", "Jesus", "Irene", "Jose", "Borja", "Yoely", "Kleyber", "Eduardo", "Alejandro", "Leonardo", "Luis", "Carlos", "Carla", "Juana", "Ana", "Andres", "Andrea"};
	public static final String[] APELLIDOS = {"Mantilla", "Aguilera", "Garcia", "Perez", "Hernandez", "Aguilar", "Campanario", "Martinez", "Escalona", "Marquina", "Estrada", "Cabrera"};

	public static String generarNombreRandom() {
		Random random = new Random();
		
		int nombresSize = NOMBRES.length;
		int apellidosSize = APELLIDOS.length;
		
		int indexNombre = random.nextInt(nombresSize);
		int indexApellido = random.nextInt(apellidosSize);
		
		String nombreCompleto = NOMBRES[indexNombre] + " " + APELLIDOS[indexApellido];		
		
		return nombreCompleto;
		
	}
	
	public static int generarOficinaRandom() {
		Random random = new Random();
		
		
		int oficinaRandom = random.nextInt(101);	
		
		return oficinaRandom;
		
	}
	
	public static String generarTelefonoRandom() {
		Random random = new Random();
		String telefonoAleatorio = "";
		
		for(int i = 0; i < 9; i++) {
			telefonoAleatorio += ""+random.nextInt(10);	
		}
		
		return telefonoAleatorio;
		
	}
}
