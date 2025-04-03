package aps.command.model.commands;

import aps.command.model.receivers.Televisao;

public class LigarTVCommand implements Command{
	
	private Televisao tv;
	
	private String description;
	
	public LigarTVCommand(Televisao tv) {
		this.tv = tv;
		this.description = "Liga a televisão no canal 0.0";
	}

	@Override
	public void execute() {
		
		//Aqui seriam introduzidas lógicas complexas e algoritmos para executar este comando
		//Essas lógicas estão sendo escondidas dentro desta classe
		
		this.tv.setLigada(true);
	}

	@Override
	public void undo() {
		
		this.tv.setLigada(false);
		
	}

	@Override
	public String getDescription() {
		return this.description;
	}

}
