package com.rdc.ornekler.ornek4.program;

public class Calisan
{
	private static final int VARSAYILAN_ID = -1;
	private static final String VARSAYILAN_STR = "bilinmiyor";
	
	private int id;
	private String ad;
	private String soyad;
	
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
	
	public int getID()
	{
		return id;
	}

	public void setID(int id) {
		this.id = id;
		
	}
	
	public String getAd()
	{
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
		
	}
	
	public String getSoyad()
	{
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
		
	}
}
