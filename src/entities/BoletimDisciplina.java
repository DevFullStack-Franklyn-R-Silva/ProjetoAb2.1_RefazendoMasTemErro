package entities;

import java.util.ArrayList;

public class BoletimDisciplina {
	private ArrayList<Discente> discentesB;

	private Media medias = new Media();

	// Constructor
	public BoletimDisciplina() {
		discentesB = new ArrayList<Discente>();

	}

	// get and set
	public ArrayList<Discente> getDiscentesB() {
		return discentesB;
	}

	public void setDiscentesB(ArrayList<Discente> discentes) {
		this.discentesB = discentes;
	}

	public Media getMedia() {
		return medias;
	}

	public void setMedia(Media medias) {
		this.medias = medias;
	}

	// Methods
	public String determinarStatuseListar() {
		String s = "";
		for (Discente discente : this.discentesB) {

			double media = medias.calculaMedia(discente);// calculaMedia(discente);
			s += discente.nome + " " + discente.matricula + " " + media;
			if (media >= 7) { // determinando status Aprovado
				s += " Aprovado";
			} else if (media < 7) { // determinando status Reprovado
				s += " Reprovado";
			}
			s += "\n";
		}
		return s; // retornado string que representa todos discentes
	}

	@Override
	public String toString() {
		String msg = "=== Boletim === \n";
		msg += "| Nome | Matricula | Média | Status | \n";
		msg += determinarStatuseListar();
		return msg;
	}

}
