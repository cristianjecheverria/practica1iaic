package practica.modelo.minijuegos.Garrafas;

import aima.search.framework.*;

public class Heurística implements HeuristicFunction {

	public double getHeuristicValue(Object state) {
		
		Garrafas g = (Garrafas)state;
		return g.Heuristica();
	}

}
