package app.curso.banco.main;
import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
//ArrayList -> Listas

// Declarar una lista	
// ArrayList<String> lista = new ArrayList<>();
	
// Añadir elemento = .push
// lista.add("Objeto 1");
//		
// Añadir en el indice
// lista.add(3, "Objeto4");
//		
// Tamaño de lista = .lenght
// lista.size();
//		
// Elimina el objeto en el indice 3 (Objeto4)
// lista.remove(3);
//		
// Buscar indice de elemento = indexOf (0)
// lista.indexOf("Objeto 1");
//		
//		
// Obtener un objeto del aray ("Objeto 1")
// lista.get(0);
		
		
		//Crear un arraylist de numeros enteros del 0 al 20
		//Añadiendo cada numero en su posicion
		
		ArrayList<Integer> listaEnteros = new ArrayList<>();
		
		//Insertar datos en el ArrayList
		for(int i = 0; i<=20;i++)
		{
			listaEnteros.add(i);
		}
		
		//Recorrer el ArrayList para mostrar cada uno
		for(Integer numero:listaEnteros) {
			System.out.println("El numero en el indice " + numero);
		}
		
		for(int i = 0 ; i<listaEnteros.size(); i++)
		{
			System.out.println("El numero en el indice " + i + " es: "+ listaEnteros.get(i));
		}
		
		System.out.println(listaEnteros);
		
		//Eliminar toda la lista = listaEnteros.clear();
		int listaSize = listaEnteros.size();
		
		for(int i = 0; i<listaSize; i++)
		{
			listaEnteros.remove(0);
		}
		
		System.out.println(listaEnteros);
		
		
	}

}
