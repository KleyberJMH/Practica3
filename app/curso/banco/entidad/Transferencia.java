package app.curso.banco.entidad;

public class Transferencia extends Mensaje {
	private float monto;
	
	public Transferencia () {
		
	}
	
	public Transferencia (int id, char tipoEmisor, int idEmisor, char tipoReceptor, int idReceptor, String textoMensaje, float monto) {
		super(id, tipoEmisor, idEmisor, tipoReceptor, idReceptor, textoMensaje);
		this.monto = monto;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}
	
	
}
