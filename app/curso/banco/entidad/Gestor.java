package app.curso.banco.entidad;

public class Gestor extends Persona {
	private int oficina;
	
	public Gestor() {
		
	}
	
	public Gestor(int id, String nombre, String telefono, int oficina) {
		super(id, nombre, telefono);
		this.oficina = oficina;
	}

	public int getOficina() {
		return oficina;
	}

	public void setOficina(int oficina) {
		this.oficina = oficina;
	}
	
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Oficina id: " + this.oficina);
	}
}
