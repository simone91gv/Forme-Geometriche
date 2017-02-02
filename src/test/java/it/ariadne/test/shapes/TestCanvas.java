package it.ariadne.test.shapes;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import it.ariadne.shapes.Canvas;
import it.ariadne.shapes.Cerchio;
import it.ariadne.shapes.Punto;
import it.ariadne.shapes.Quadrato;

public class TestCanvas {
	
	private Canvas canvas;
	private Quadrato q;
	private Cerchio c;
	
	@Before
	public void setup(){
		
		canvas = new Canvas();
		
		//creazione di un quadrato
		Punto p = new Punto(12,31);
		int lato = 2;
		q = new Quadrato(p,lato);
		
		//creazione di un cerchio
		Punto p2 = new Punto(10,10);
		int raggio = 2;
		c = new Cerchio(p2, raggio);
		
		canvas.add(q);
		canvas.add(c);
		
	}

	@Test
	public void dimensioneCanvas() {
		
		int canvasSize = canvas.size();
		//Assert.assertTrue("Il canvas contiene due forme", canvasSize == 2); 
		Assert.assertEquals("Il canvas contiene due forme",2, canvasSize);  
		
	}
	 
	@Test
	public void controlloAreePerimetri(){
		
		double perimetroQuadrato = q.calcolaPerimetro();
		double perimetroCerchio = c.calcolaPerimetro();
		
		double perimetroTotale = canvas.calcolaPerimetro();
		
		Assert.assertEquals("Il canvas contiene due forme",perimetroTotale, perimetroCerchio + perimetroQuadrato,0);
		
	}
	
	@Test
	public void bastard() {
		
		// test per verificare i bug della funzionalità
		Quadrato q = new Quadrato(null, -3);
		Assert.assertEquals("il perimetro è 12", 12, q.calcolaPerimetro(),0);
	}
}
