package aps.command.main;

import aps.command.model.commands.LigarArCommand;
import aps.command.model.invokers.ControleRemoto;
import aps.command.model.receivers.ArCondicionado;

public class Application {
	public static void main(String[] args) {
		
		ControleRemoto cr = new ControleRemoto();
		
		//Exemplo de adição de novo dispositivo
		ArCondicionado ar = new ArCondicionado();
		LigarArCommand c = new LigarArCommand(ar);
		cr.addCommand(c, "Ligar Ar");
		
		//Visualização de comandos possíveis
		System.out.println(cr.getComandos());
		
		//Execução dos comandos
		cr.invoke("Ligar Ar"); //
		cr.invoke("Ligar TV"); // << Parametrização de comandos
		cr.invoke("Ligar Lâmpada"); // 
		
		//Undo de todos os comandos
		cr.undoAll();
	}
}
