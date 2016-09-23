package com.rdc.ornekler.ornek1.program;
/**
 * @author Alper
 * 
 */
public class Calisan
{
	public int id;
	public String ad;
	public String soyad;
	
	public Calisan()
	{
		System.out.println("Parametresiz yapilandirici cagirildi.");
	}
	
	public void ozellikleriYaz()
	{
		System.out.println("ID:" + id + " ad: " + ad + " soyad: " + soyad);
	}
}
