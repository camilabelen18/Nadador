package ar.edu.unlam.pb2.parcial;

public class Ciclista extends Deportista implements ICiclista{

	private String tipoDeBicicleta;
	public Ciclista(Integer numeroDeSocio, String nombre, String tipoDeBicicleta) {
		super(numeroDeSocio, nombre);
		this.tipoDeBicicleta = tipoDeBicicleta;
	}

	@Override
	public String getTipoDeBicicleta() {
		return this.tipoDeBicicleta;
	}

}
