package practica.modelo.minijuegos.Mochila;

import aima.search.framework.HeuristicFunction;


public class Heurística implements HeuristicFunction {
	
	
	

	public double getHeuristicValue(Object state) {
		Mochila m = (Mochila)state;
		return m.h();
	}
	
}
