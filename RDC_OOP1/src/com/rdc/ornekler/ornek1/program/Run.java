package com.rdc.ornekler.ornek1.program;
/**
 * @author Alper
 * 
 */
public class Run 
{

	public static void main(String[] args) 
	{
		Calisan calisan1 = new Calisan();
		
		calisan1.id = 243;
		calisan1.ad = "Ali";
		calisan1.soyad = "Gider";
		
		calisan1.ozellikleriYaz();
	}

}
