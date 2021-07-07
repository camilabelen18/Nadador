package ar.edu.unlam.pb2.parcial;

public class Socio {
	
	private Integer numeroSocio;
	private String disciplina;
	
	public Socio(Integer numeroSocio, String disciplina) {
		this.numeroSocio = numeroSocio;
		this.disciplina = disciplina;
	}

	public Integer getNumeroSocio() {
		return numeroSocio;
	}

	public void setNumeroSocio(Integer numeroSocio) {
		this.numeroSocio = numeroSocio;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroSocio == null) ? 0 : numeroSocio.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Socio other = (Socio) obj;
		if (numeroSocio == null) {
			if (other.numeroSocio != null)
				return false;
		} else if (!numeroSocio.equals(other.numeroSocio))
			return false;
		return true;
	}
	
	
}
