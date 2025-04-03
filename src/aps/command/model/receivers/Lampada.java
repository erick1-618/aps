package aps.command.model.receivers;

public class Lampada {
	
	private boolean ligada;
	
	private float luminosidade;

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public float getLuminosidade() {
		return luminosidade;
	}

	public void setLuminosidade(float luminosidade) {
		this.luminosidade = luminosidade;
	}

}
