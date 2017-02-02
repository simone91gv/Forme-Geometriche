package it.ariadne.helloworld;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("Hello World\n");
		
		
		try {
			auguratore("02/14/2017", new SimpleDateFormat("dd/MM/yyyy"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}

		
	}

	private static void auguratore(String dataCompleanno, SimpleDateFormat df) throws ParseException {
		dataCompleanno = "02/14/2017";
		
	   df = new SimpleDateFormat("dd/MM/yyyy");
		
		
			Date dataCompleannoAlessandro = df.parse(dataCompleanno);
			System.out.println("buon compleanno "+df.format(dataCompleannoAlessandro));
			
	}
	
	

}
