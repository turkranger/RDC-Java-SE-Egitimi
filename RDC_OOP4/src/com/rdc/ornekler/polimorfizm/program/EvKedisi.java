package com.rdc.ornekler.polimorfizm.program;
/**
 * @author Alper
 * 
 */
public class EvKedisi extends Kedi
{

	public EvKedisi(String isim, int yas) 
	{
		super(isim, yas);
	}
	
	@Override
	public void avYap() {
		System.out.println("Ev kedisi fare boyutunda av yapti.");
	}

	@Override
	public String toString() {
		return "EvKedisi [toString()=" + super.toString() + "]";
	}
		
}
