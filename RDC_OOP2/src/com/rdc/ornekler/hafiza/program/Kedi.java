package com.rdc.ornekler.hafiza.program;
/**
 * @author Alper
 * 
 */
public class Kedi 
{
	private String ad;
	private int yas;
	
	public Kedi(String ad, int yas) 
	{
		this.ad = ad;
		this.yas = yas;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	@Override
	public String toString() {
		return "Kedi [ad=" + ad + ", yas=" + yas + "]";
	}
	
	public void zipla()
	{
		System.out.println("Kedi zipladi");
	}
	
	public void tirmala()
	{
		System.out.println("Kedi tirmaladi.");
	}
	
	public void avYap()
	{
		System.out.println("Kedi av yapti.");
	}
}
