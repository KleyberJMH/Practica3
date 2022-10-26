package app.curso.banco.entidad;

public class Cliente extends Persona {
	// atributos
	private float totalDinero;

	// constructores
	public Cliente() {

	}

	public Cliente(int id, String nombre, String telefono, float totalDinero) {
		super(id, nombre, telefono);
		this.totalDinero = totalDinero;
	}

	// metodos
	public float getTotalDinero() {
		return totalDinero;
	}

	public void setTotalDinero(float totalDinero) {
		this.totalDinero = totalDinero;
	}

	public void mostrarInfo() {
		super.mostrarInfo();
//		super.mostrarInfo(); = 
//		System.out.println("Id: " + this.id);
//		System.out.println("Nombre: " + this.nombre);
//		System.out.println("Telefono: " + this.telefono);
		System.out.println("Total dinero: " + this.totalDinero + "€");
	}
	
	public float ingresarDinero(float monto) {
		return this.totalDinero += monto;
	}
	
	public float retirarDinero(float monto) {
		if((this.totalDinero-monto) >= 0) {
			this.totalDinero -= monto;
		}else {
			System.out.println("No dispones del dinero suficiente para realizar el retiro");
		}
		return this.totalDinero;
	}
}
