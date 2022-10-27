package app.curso.banco.entidad;
import java.util.HashMap;

public class Cliente extends Persona {
	// atributos
	private float totalDinero;
	// cada cuenta tiene una clave o id de tipo String
	// y una cantidad de dinero Float
	private HashMap<String, Float> cuentas;

	// constructores
	public Cliente() {

	}

	public Cliente(int id, String nombre, String telefono) {
		super(id, nombre, telefono);
		this.totalDinero = 0;
		this.cuentas = new HashMap<>();

	}

	// metodos
	public float getTotalDinero() {
		return totalDinero;
	}

	public HashMap<String, Float> getCuentas() {
		return this.cuentas ;
	}

	public void setCuentas(HashMap<String, Float> cuentas) {
		this.cuentas = cuentas;
	}

	public void setTotalDinero(float totalDinero) {
		this.totalDinero = totalDinero;
	}
	
	public void abrirCuenta(String numeroCuenta, Float montoInicial) {
		this.cuentas.put(numeroCuenta, montoInicial);
		ingresarDinero(montoInicial);
	}

	public void mostrarInfo() {
		super.mostrarInfo();
//		super.mostrarInfo(); = 
//		System.out.println("Id: " + this.id);
//		System.out.println("Nombre: " + this.nombre);
//		System.out.println("Telefono: " + this.telefono);
		if(this.cuentas.size()!=0) {
			System.out.println("Cuentas");
			mostrarCuentas();
		}else
		{
			System.out.println("El cliente no tiene cuentas");
		}
		
		System.out.println("Total dinero: " + this.totalDinero + "€");
	}
	
	public void mostrarCuentas() {
		this.cuentas.forEach((cuenta, total)->{
			System.out.println("Numero de cuenta: " + cuenta + " - Saldo: " + total + "€");
		});
	}
	
	private float ingresarDinero(float monto) {
		return this.totalDinero += monto;
	}
	
	public float ingresarDinero(String numeroCuenta, float monto) {
		Float dineroCuenta = this.cuentas.get(numeroCuenta);
		if(dineroCuenta!= null) {
			this.cuentas.put(numeroCuenta, dineroCuenta + monto);
			ingresarDinero(monto);
		} else {
			System.out.println("La cuenta no existe");
		}
		return this.totalDinero;
	}
	
	public void cerrarCuenta(String numeroCuenta) {
		if(this.cuentas.get(numeroCuenta)==0)
		{
			this.totalDinero -= this.cuentas.get(numeroCuenta);
			this.cuentas.remove(numeroCuenta);
		}else
		{
			System.out.println("Tienes dinero en la cuenta, retiralo antes");
		}
		
		
	}
	
	private float retirarDinero(float monto) {
		if((this.totalDinero-monto) >= 0) {
			this.totalDinero -= monto;
		}else {
			System.out.println("No dispones del dinero suficiente para realizar el retiro");
		}
		return this.totalDinero;
	}
	
	public float retirarDinero(String numeroCuenta, float monto) {
		Float dineroCuenta = this.cuentas.get(numeroCuenta);
		if(dineroCuenta != null)
		{
			this.cuentas.put(numeroCuenta, dineroCuenta - monto);
			retirarDinero(monto);
			System.out.println("Se ha retirado "+ monto + "€ de la cuenta " + numeroCuenta);
		}
		
		return this.totalDinero;
	}
}
