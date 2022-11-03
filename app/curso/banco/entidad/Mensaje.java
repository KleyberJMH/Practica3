package app.curso.banco.entidad;

public class Mensaje {
	protected int id;
	
	protected int idEmisor;
	protected char tipoEmisor;
	
	protected int idReceptor;
	protected char tipoReceptor;
	
	protected String textoMensaje;
	
	public static final char TIPO_CLIENTE = 'c';
	public static final char TIPO_GESTOR = 'g';	
	
	public Mensaje () {
		
	}
	
	public Mensaje (int id, char tipoEmisor, int idEmisor, char tipoReceptor, int idReceptor, String textoMensaje){
		this.id = id;
		this.tipoEmisor = tipoEmisor;
		this.idEmisor = idEmisor;
		this.tipoReceptor = tipoReceptor;
		this.idReceptor = idReceptor;
		this.textoMensaje = textoMensaje;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdEmisor() {
		return idEmisor;
	}

	public void setIdEmisor(int idEmisor) {
		this.idEmisor = idEmisor;
	}

	public char getTipoEmisor() {
		return tipoEmisor;
	}

	public void setTipoEmisor(char tipoEmisor) {
		this.tipoEmisor = tipoEmisor;
	}

	public int getIdReceptor() {
		return idReceptor;
	}

	public void setIdReceptor(int idReceptor) {
		this.idReceptor = idReceptor;
	}

	public char getTipoReceptor() {
		return tipoReceptor;
	}

	public void setTipoReceptor(char tipoReceptor) {
		this.tipoReceptor = tipoReceptor;
	}

	public String getTextoMensaje() {
		return textoMensaje;
	}

	public void setTextoMensaje(String textoMensaje) {
		this.textoMensaje = textoMensaje;
	}
	
	public String toString() {
		return this.idEmisor + ": "+this.textoMensaje;
	}
	
	
	
	
}
