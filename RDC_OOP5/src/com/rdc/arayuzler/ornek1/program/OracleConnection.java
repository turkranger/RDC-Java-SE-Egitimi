package com.rdc.arayuzler.ornek1.program;
/**
 * @author Alper
 * 
 */
public class OracleConnection implements Connectable
{

	@Override
	public boolean openConnection() {
		boolean sonuc = false;
		
		try
		{
			// Oracle baglanti acma islemleri deneniyor.
			
			sonuc = true; // buranin son satiri
		}
		catch(Exception exception)
		{
			System.out.println("Baglanti acilamadi.");
			exception.printStackTrace();
			exception.getMessage();
		}
		
		return sonuc;
	}

	@Override
	public boolean closeConnection() {
boolean sonuc = false;
		
		try
		{
			// Oracle baglanti kapama islemleri deneniyor.
			
			sonuc = true; // buranin son satiri
		}
		catch(Exception exception)
		{
			System.out.println("Baglanti kapatilamadi.");
			exception.printStackTrace();
			exception.getMessage();
		}
		
		return sonuc;
	}

}
