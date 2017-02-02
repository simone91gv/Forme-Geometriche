package it.ariadne.shapes;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
	
	List<Forma> forme = new ArrayList<>();
	

	public void add(Forma f) {
		forme.add(f);
	}

	public int size() {
		
		int totalNumberOfShapes = 0;
		totalNumberOfShapes+= forme.size();
		
		return totalNumberOfShapes;
	}
	
	public double calcolaPerimetro() {
		
		double perimetroTotale = 0d;
		
		for (Forma f : forme) {
			perimetroTotale+= f.calcolaPerimetro();
		}
		return perimetroTotale;
	}

}
