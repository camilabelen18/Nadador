package ar.edu.unlam.pb2.parcial;

public class NoEstaPreparado extends Exception {

	public NoEstaPreparado() {
		super("El deportista no esta preparado para la competencia");
	}
}
