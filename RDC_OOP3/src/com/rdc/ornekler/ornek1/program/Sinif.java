package com.rdc.ornekler.ornek1.program;
/**
 * @author Alper
 * 
 */
import java.util.Arrays;

public class Sinif 
{
	private String okulAdi;
	private Ogrenci ogrenciler[];
	private int mevcutOgrenci = 0;
	
	public Sinif(String okulAdi, int sinifMevcudu)
	{
		this.okulAdi = okulAdi;
		ogrenciler = new Ogrenci[sinifMevcudu];
	}
	
	public void ogrenciEkle(Ogrenci ogrenci)
	{
		
		if(mevcutOgrenci >= ogrenciler.length)
		{
			System.out.println("Sinif dolu.");
		}
		
		else
		{
			ogrenciler[mevcutOgrenci] = ogrenci;
			mevcutOgrenci++;  
		}
	}

	public String getOkulAdi() {
		return okulAdi;
	}

	public void setOkulAdi(String okulAdi) {
		this.okulAdi = okulAdi;
	}

	public Ogrenci[] getOgrenciler() {
		return ogrenciler;
	}

	public void setOgrenciler(Ogrenci[] ogrenciler) {
		this.ogrenciler = ogrenciler;
	}

	@Override
	public String toString() {
		return "Sinif [okulAdi=" + okulAdi + ", ogrenciler=" + Arrays.toString(ogrenciler) + ", mevcutOgrenci="
				+ mevcutOgrenci + "]";
	}
	
	
}
