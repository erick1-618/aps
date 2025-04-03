package aps.command.model.receivers;

public class Televisao {
	
	private boolean ligada;
	
	private float canalAtual;

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public float getCanalAtual() {
		return canalAtual;
	}

	public void setCanalAtual(float canalAtual) {
		this.canalAtual = canalAtual;
	}
}
