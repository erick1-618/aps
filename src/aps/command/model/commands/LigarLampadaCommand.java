package aps.command.model.commands;

import aps.command.model.receivers.Lampada;

public class LigarLampadaCommand implements Command{
	
	private Lampada lampada;
	
	private String descricao;
	
	private static final float LUMINOSIDADE_PADRAO = 50;
	
	public LigarLampadaCommand(Lampada l) {
		this.lampada = l;
		this.descricao = "Acende a lâmpada na luminosidade " + LUMINOSIDADE_PADRAO;
	}

	@Override
	public void execute() {
		
		//Inserção de lógicas complexas para execução do comando
		this.lampada.setLigada(true);
		this.lampada.setLuminosidade(LUMINOSIDADE_PADRAO);
	}

	@Override
	public void undo() {
		
		this.lampada.setLuminosidade(0);
		this.lampada.setLigada(false);
	}

	@Override
	public String getDescription() {
		return this.descricao;
	}

}
