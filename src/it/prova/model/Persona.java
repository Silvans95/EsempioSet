package it.prova.model;

public class Persona {

	String nome;
	String cognome;
	
//	============================================================================
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	public Persona(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
	}
	
//	============================================================================

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

//	============================================================================
	
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + "]";
	}
}
