package ar.edu.unlam.pb2.parcial;

public class Triatleta extends Deportista {

	private TipoDeBicicleta tipoDeBicicleta;
	
	public Triatleta(Integer numeroDeSocio, String nombre,TipoDeBicicleta tipoDeBicicleta) {
		super(numeroDeSocio, nombre);
		this.tipoDeBicicleta = tipoDeBicicleta;
	}
	
	public TipoDeBicicleta getTipoDeBicicleta(){
		return this.tipoDeBicicleta;
	}



	

}
