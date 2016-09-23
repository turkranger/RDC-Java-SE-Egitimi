package com.rdc.ornekler.ornek7.program;

public class Calisan 
{
	private static final int VARSAYILAN_ID = -1;
	private static final String VARSAYILAN_STRING = "bilinmiyor";
	
	private int id;
	private String ad;
	private String soyad;
	
	public Calisan(int id, String ad, String soyad) 
	{
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
	}

	public Calisan(String ad, String soyad) {
		this(VARSAYILAN_ID, ad, soyad);
	}

	public Calisan(int id) {
		this(id, VARSAYILAN_STRING, VARSAYILAN_STRING);
	}
	
	public Calisan()
	{
		this(VARSAYILAN_ID, VARSAYILAN_STRING, VARSAYILAN_STRING);
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

	@Override
	public String toString() {
		return "Calisan [id=" + id + ", ad=" + ad + ", soyad=" + soyad + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calisan other = (Calisan) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
	
	
}
