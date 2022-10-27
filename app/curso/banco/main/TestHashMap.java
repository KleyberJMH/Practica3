package app.curso.banco.main;
import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
//HashMap -> Clave - Valor {key: value}
		
		
		HashMap<Integer, String> mapa = new HashMap<>();
		
		//Agrega datos al HashMap
		mapa.put(1, "User1");
		mapa.put(2, "User2");
		
		System.out.println(mapa);
		
		//Recorrer HashMap
		mapa.forEach((clave, valor)->{
			System.out.println("En la clave: " + clave + " y el valor es: " + valor);
		});
		
		//Vacia el HashMap
		mapa.clear();
		
		System.out.println(mapa);

	}

}
