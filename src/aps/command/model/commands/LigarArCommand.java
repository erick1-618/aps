package aps.command.model.commands;

import aps.command.model.receivers.ArCondicionado;

public class LigarArCommand implements Command{

	private String description;
	
	private ArCondicionado ar;
	
	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public void execute() {
		ar.setLigado(true);
		ar.setTemperatura(21);
	}

	@Override
	public void undo() {
		ar.setLigado(false);
	}

	public LigarArCommand(ArCondicionado ar) {
		this.ar = ar;
		this.description = "Liga o ar-condicionado na temperatura 21 C";
	}

}
