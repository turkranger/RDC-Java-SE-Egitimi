package com.rdc.ornekler.ornek3.program;

public class Calisan
{
	private static final int VARSAYILAN_ID = -1;
	private static final String VARSAYILAN_STR = "bilinmiyor";
	public int id;
	public String ad;
	public String soyad;
	
	public Calisan(int id, String ad, String soyad)
	{
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
	}
	
	public Calisan(String ad, String soyad)
	{
		id = VARSAYILAN_ID;
		this.ad = ad;
		this.soyad = soyad;
	}
	
	public Calisan(int id)
	{
		this.id = id;
		ad = VARSAYILAN_STR;
		soyad = VARSAYILAN_STR;
	}
	
	public Calisan()
	{
		id = VARSAYILAN_ID;
		ad = VARSAYILAN_STR;
		soyad = VARSAYILAN_STR;
	}
}
