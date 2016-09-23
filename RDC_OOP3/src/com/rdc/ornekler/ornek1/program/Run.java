package com.rdc.ornekler.ornek1.program;
/**
 * @author Alper
 * 
 */
import com.rdc.ornekler.ornek1.hesaplama.HesapMakinesi;

public class Run 
{

	public static void main(String[] args) 
	{
		Sinif sinif10A = new Sinif("Cumhuriyet Lisesi", 3);
		
		sinif10A.ogrenciEkle(new Ogrenci(245, "Ali", "Gider"));
		
		Ogrenci ogrenci2 = new Ogrenci(246, "Veli", "Bilen");
		sinif10A.ogrenciEkle(ogrenci2);
		
		sinif10A.ogrenciEkle(new Ogrenci(247, "Ayse", "Caliskan"));
		
		sinif10A.ogrenciEkle(new Ogrenci(248, "Mine", "Ucar"));
		
		
		System.out.println(sinif10A);
		
		System.out.println( HesapMakinesi.carp(5, 7) );
		
		System.out.println( HesapMakinesi.bol(10, 4) );
	}

}
