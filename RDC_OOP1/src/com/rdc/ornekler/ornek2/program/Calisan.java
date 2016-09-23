package com.rdc.ornekler.ornek2.program;

public class Calisan
{
	public int id;
	public String ad;
	public String soyad;
	
	public Calisan()
	{
		System.out.println("Parametresiz yapilandirici cagirildi.");
	}
	
	public Calisan(int id, String ad, String soyad)
	{
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
	}
}
