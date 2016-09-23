package com.rdc.ornekler.hafiza.program;
/**
 * @author Alper
 * 
 */
public class Kaplan extends Kedi
{

	public Kaplan(String ad, int yas) 
	{
		super(ad, yas);
	}

	@Override
	public void avYap() {
		System.out.println("Ismi " + getAd() + " yasi " + getYas() + " olan kaplan geyik boyutunda avlarla beslenir.");
	}
	
	@Override
	public void zipla() {
		System.out.println("Ismi " + getAd() + " yasi " + getYas() + " olan kaplan 2 m zipladi.");
	}
	
	@Override
	public void tirmala() {
		System.out.println("Ismi " + getAd() + " yasi " + getYas() + " olan ev kedisi 100 N/m2 siddetinde pence atti.");
	}

	@Override
	public String toString() {
		return "Kaplan [toString()=" + super.toString() + "]";
	}
	
	
}
