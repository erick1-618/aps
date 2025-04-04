package aps.decorator.main;

import aps.decorator.component.HamburguerComBacon;
import aps.decorator.component.HamburguerComCheddar;
import aps.decorator.component.HamburguerComSalada;
import aps.decorator.component.HamburguerSimples;
import aps.decorator.component.interfaces.Hamburguer;

public class Application {
	public static void main(String[] args) {
		
		Hamburguer h = new HamburguerSimples();
		
		System.out.println(h.hamburguerString()); 
		
		h = new HamburguerComSalada(h); // Envolve um hamburguer simples, adicionando salada
		
		System.out.println(h.hamburguerString());
		
		h = new HamburguerComBacon(h); // Envolve um hambúrguer com salada, adicionando bacon
		
		System.out.println(h.hamburguerString());
		
		h = new HamburguerComCheddar(h); //Envolve um hamburguer com salada e bacon, adicionando cheddar
		
		System.out.println(h.hamburguerString());
	}
}
