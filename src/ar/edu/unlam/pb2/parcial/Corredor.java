package ar.edu.unlam.pb2.parcial;

public class Corredor extends Deportista implements ICorredor{

	private Integer distanciaPreferida;
	private Integer cantidadKilometros;

	public Corredor(Integer numeroDeSocio, String nombre,Integer distanciaPreferida) {
		super(numeroDeSocio, nombre);
		this.distanciaPreferida = distanciaPreferida;
		this.cantidadKilometros = 0;
	}

	public Integer getDistanciaPreferida() {
		return this.distanciaPreferida;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer cantidadKilometros) {
		this.cantidadKilometros = cantidadKilometros;
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		return this.cantidadKilometros;
	}
	
	
	
	



}
