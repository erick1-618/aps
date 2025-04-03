package aps.command.model.commands;

public interface Command {
	
	/** Função extra
	 * 
	 * @return Uma breve descrição do que o comando faz
	 */
	
	public String getDescription();
	
	public void execute();
	
	//Para desfazer os comandos
	public void undo();
}
