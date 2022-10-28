package app.curso.banco.main;
import app.curso.banco.util.Utiles;

public class TestRandom {

	public static void main(String[] args) {
		
		
		for (int i = 0; i<10; i++) {
			String nombreCompleto = Utiles.generarNombreRandom();
			System.out.println(nombreCompleto);
		}
		

		
		
		
	}

}
