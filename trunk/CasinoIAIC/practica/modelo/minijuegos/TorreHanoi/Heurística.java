package practica.modelo.minijuegos.TorreHanoi;


import aima.search.framework.HeuristicFunction;

public class Heurística implements HeuristicFunction{

	public double getHeuristicValue(Object state) {
		TorreHannoi t = (TorreHannoi)state;
		return t.hueristica() ;
	}
	
	

}
