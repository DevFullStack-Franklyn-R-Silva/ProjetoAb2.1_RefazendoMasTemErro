package entities;

import java.util.ArrayList;
import java.util.List;

public class Discente {
	protected String nome;
	protected String matricula;
	List<Nota> notas = new ArrayList<>();
	
	
	public Discente(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public List<Nota> getNotas() {
		return notas;
	}


	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}
	
	
	
}
