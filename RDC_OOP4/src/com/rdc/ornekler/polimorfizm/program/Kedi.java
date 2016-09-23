package com.rdc.ornekler.polimorfizm.program;
/**
 * @author Alper
 * 
 */
public class Kedi 
{
	private String isim;
	private int yas;
	
	public Kedi(String isim, int yas) {
		this.isim = isim;
		this.yas = yas;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	@Override
	public String toString() {
		return "EvKedisi [isim=" + isim + ", yas=" + yas + "]";
	}
	
	public void avYap()
	{
		System.out.println("Kedi av yapti.");
	}
}
