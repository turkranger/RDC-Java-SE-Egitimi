package com.rdc.ornekler.ornek5.program;

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
		this(VARSAYILAN_ID, ad, soyad);
	}
	
	public Calisan(int id)
	{
		this(id, VARSAYILAN_STR, VARSAYILAN_STR);
	}
	
	public Calisan()
	{
		this(VARSAYILAN_ID, VARSAYILAN_STR, VARSAYILAN_STR);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
	
}
