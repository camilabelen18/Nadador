package ar.edu.unlam.pb2.parcial;

public class Nadador extends Deportista implements INadador{

	private String estilo;
	
	public Nadador(Integer numeroDeSocio, String nombre, String estilo) {
		super(numeroDeSocio, nombre);
		this.estilo = estilo;
	}

	

	public String getEstiloPreferido() {
		return this.estilo;
	}
	
	



}
