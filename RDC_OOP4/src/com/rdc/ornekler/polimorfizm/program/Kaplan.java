package com.rdc.ornekler.polimorfizm.program;
/**
 * @author Alper
 * 
 */
public class Kaplan extends Kedi
{

	public Kaplan(String isim, int yas) 
	{
		super(isim, yas);
	}
	
	@Override
	public void avYap() {
		System.out.println("Kaplan geyik boyutunda av yapti.");
	}

	@Override
	public String toString() {
		return "Kaplan [toString()=" + super.toString() + "]";
	}
	
	
}
