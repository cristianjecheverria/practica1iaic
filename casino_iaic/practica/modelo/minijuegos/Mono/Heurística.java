package practica.modelo.minijuegos.Mono;
import aima.search.framework.*;

public class Heurística implements HeuristicFunction {

	public double getHeuristicValue(Object state) {
		Mono m = (Mono)state;
		return m.hueristica() ;
	}

}
