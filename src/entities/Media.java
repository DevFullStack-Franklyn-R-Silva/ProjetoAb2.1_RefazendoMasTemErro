package entities;

public  class Media {
	private Integer tipoDaMedia;

	// constructor
	public Media() {
		this.tipoDaMedia = 0;
	}

	// get and set
	public Integer getTipoDaMedia() {
		return tipoDaMedia;
	}

	public void setTipoDaMedia(Integer tipoDaMedia) {
		this.tipoDaMedia = tipoDaMedia;
	}

	// methods
	public float calculaMedia(Discente discente) {
		float media = 0;
		int peso = 0;
		if (tipoDaMedia == 0) { // media aritimetrica
			for (Nota nota : discente.getNotas()) {
				media = media + nota.getValor();
			}
			peso = discente.getNotas().size();
			media = media / peso;
		} else if (tipoDaMedia == 1) { // media ponderada
			for (Nota nota : discente.getNotas()) {
				media = media + nota.getValor() * nota.getPeso();
				peso = peso + nota.getPeso();
			}
			media = media / peso;
		}
		return media;

	}

}
