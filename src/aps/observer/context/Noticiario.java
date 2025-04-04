package aps.observer.context;

import java.util.ArrayList;
import java.util.List;

import aps.observer.listeners.abs.NoticiarioListener;

/**
 * Objeto que será observado, e que notificará alterações de estado e eventoss
 */

public class Noticiario {
	
	/**
	 * Lista de observadores a serem notificados
	 */
	
	private List<NoticiarioListener> observadores = new ArrayList<>();
	
	public void addListener(NoticiarioListener l) {
		this.observadores.add(l);
	}
	
	public void removeListener(NoticiarioListener l) {
		this.observadores.remove(l);
	}
	
	/**
	 * Notifica todos os seus observadores, com cada um reagindo conforme sua implementação
	 * @param msg Conteúdo da notificação
	 */
	 
	public void notifyListeners(String msg) {
		this.observadores.forEach(o -> o.doSomething(msg));
	}
}
