package aps.mediator.med;

import aps.mediator.components.Colega;

/**
 * Define a interface do mediator
 *
 */

public interface Mediador {
	void enviar(String message, Colega remetente);
}
