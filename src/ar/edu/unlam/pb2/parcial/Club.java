package ar.edu.unlam.pb2.parcial;



import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Club {

	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;
	private Evento evento;
	private Integer numeroInscripcion;
	
	public Club(String nombre) {
		this.nombre = nombre;
		this.socios = new HashSet<Deportista>();
		this.competencias = new HashMap<String,Evento>();
		this.numeroInscripcion = 0;
	}

	public Boolean agregarDeportista(Deportista deportista) {
		return this.socios.add(deportista);
	}
	
	public Integer getCantidadSocios() {
		return this.socios.size();
	}
	
	public void crearEvento(TipoDeEvento carreraNatacionEnAguasAbiertas, String descripcion) throws NoEstaPreparado {
		Integer numeroDeInscripcion = 0;
		
		for (Deportista deportista : socios) {
			if(deportista instanceof INadador) {
				throw new NoEstaPreparado();
			}
			else {
				numeroDeInscripcion++;
			}

		}
		Evento evento = new Evento(carreraNatacionEnAguasAbiertas, numeroDeInscripcion);
		this.competencias.put(descripcion, evento);
	}
	
	public Integer inscribirEnEvento(String nombreEvento, Deportista celeste) {
		if(this.competencias.get(nombreEvento)!=null) {
			numeroInscripcion++;
			evento.agregarDeportistaAlEvento(numeroInscripcion, celeste);
		}
		return numeroInscripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Deportista> getSocios() {
		return socios;
	}

	public void setSocios(Set<Deportista> socios) {
		this.socios = socios;
	}

	public Map<String, Evento> getCompetencias() {
		return competencias;
	}

	public void setCompetencias(Map<String, Evento> competencias) {
		this.competencias = competencias;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public Integer getNumeroInscripcion() {
		return numeroInscripcion;
	}

	public void setNumeroInscripcion(Integer numeroInscripcion) {
		this.numeroInscripcion = numeroInscripcion;
	}

	



}
