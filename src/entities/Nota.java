package entities;

public class Nota {
	private Float valor; 
	private Integer peso; 
	
	// constructor
	public Nota() {
	}

	public Nota(Float valor) {
		this.valor = valor;
	}

	public Nota(Float valor, Integer peso) {
		this.valor = valor;
		this.peso = peso;
	}
	// get and set
	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

}
