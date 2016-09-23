package com.rdc.ornekler.kalitim.program;
/**
 * @author Alper
 * 
 */
public class EvKedisi extends Kedi
{

	public EvKedisi( String ad, int yas) 
	{
		super(ad, yas);
	}
	
	@Override
	public void avYap() {
		System.out.println("Ismi " + getAd() + " yasi " + getYas() + " olan ev kedisi fare boyutunda avlarla beslenir.");
	}

	@Override
	public void zipla() {
		System.out.println("Ismi " + getAd() + " yasi " + getYas() + " olan ev kedisi 3 m zipladi.");
	}
	
	@Override
	public void tirmala() {
		System.out.println("Ismi " + getAd() + " yasi " + getYas() + " olan ev kedisi 1 N/m2 siddetinde tirmik atti.");
	}

	@Override
	public String toString() {
		return "EvKedisi [toString()=" + super.toString() + "]";
	}



}
