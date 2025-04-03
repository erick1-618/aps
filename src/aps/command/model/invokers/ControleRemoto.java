package aps.command.model.invokers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

import aps.command.model.commands.Command;
import aps.command.model.commands.LigarLampadaCommand;
import aps.command.model.commands.LigarTVCommand;
import aps.command.model.receivers.Lampada;
import aps.command.model.receivers.Televisao;

public class ControleRemoto {

	
	/**
	 * Com as estruturas de Map, pode-se ter um controle dos comandos suportados
	 * pelo invoker. E com a pilha, pode-se ter um suporte à reversão de últimos comandos executados,
	 * bem como um histórico de comandos.
	 */
	
	private Map<String, Command> comandosPossiveis = new HashMap<>();
	private Stack<Command> pilhaComandos = new Stack<>();
	
	public ControleRemoto() {					//Para se adicionar atalhos ao mesmo receiver,
												//o usuário deve possuir a referência do obj 
		this.comandosPossiveis.put("Ligar TV", new LigarTVCommand(new Televisao()));
		this.comandosPossiveis.put("Ligar Lâmpada", new LigarLampadaCommand(new Lampada()));
	}
	
	/** Recebe um comando, verifica se está na lista dos possíveis, executa-o e adiciona na pilha. Aqui está o exemplo
	 * de parametrização de ações, onde está é passada como uma string na chamada do método
	 * 
	 * @param comando O comando a ser passado
	 */
	
	public void invoke(String comando) {
		
		if(!comandosPossiveis.keySet().contains(comando)) {
			System.err.println("Comando não reconhecido");
			return;
		}
		
		Command c = comandosPossiveis.get(comando);
		c.execute();
		pilhaComandos.add(c);
	}
	
	/**Vantagem de se usar o command. Permite desfazer comandos de uma pilha
	 * 
	 */
	
	public void undo() {
		if(pilhaComandos.isEmpty()) {
			System.err.println("Não há comandos para desfazer");
			return;
		}
		
		Command c = pilhaComandos.pop();
		c.undo();
	}
	
	/**
	 * Desfaz todos os comandos da pilha
	 */
	
	public void undoAll() {
		
		while(!pilhaComandos.isEmpty()) {
			Command c = pilhaComandos.pop();			
			c.undo();
		}
	}
	
	/**
	 * Este método permite o invoker oferecer suporte à novos dispositivos,
	 * uma vez que a implementação fica à cargo da classe intermediária Command
	 * e tudo que o invoker precisa saber, é se o objeto passado implementa a classe command, 
	 * ficando a cargo do usuário a instanciação do comando e do receiver correspondente.
	 * Para se adicionar um atalho a um comando existente, o usuário precisara da referência do
	 * receiver que ele quer alterar
	 * 
	 *  @param c Comando a ser adicionado no mapa
	 *  @param chave Chave para se chamar esse comando
	 */
	
	public void addCommand(Command c, String chave) {
		
		if(c == null) {
			System.err.println("Comando inválido");
			return;
		}
		
		this.comandosPossiveis.put(chave, c);
	}
	
	public String getComandos() {
		
		String msg = "";
		
		Iterator<String> it = comandosPossiveis.keySet().iterator();
		
		String key;
		
		Command c;
		
		while(it.hasNext()) {
			key = it.next();
			c = comandosPossiveis.get(key);
			msg += key + " -> " + c.getDescription() + "\n";
		}
		
		return msg;
	}
}