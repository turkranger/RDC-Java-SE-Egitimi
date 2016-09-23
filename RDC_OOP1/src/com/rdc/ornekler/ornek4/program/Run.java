package com.rdc.ornekler.ornek4.program;

public class Run 
{

	public static void main(String[] args) 
	{
		Calisan calisan1 = new Calisan(245, "Ayse", "Bilen");
		System.out.println("Ad: " + calisan1.getAd() + " soyad: " + calisan1.getSoyad() + " id: " + calisan1.getID());
		
		calisan1.setID(247);
		System.out.println("Ad: " + calisan1.getAd() + " soyad: " + calisan1.getSoyad() + " id: " + calisan1.getID());
	}

}
