package com.rdc.ornekler.polimorfizm.program;
/**
 * @author Alper
 * 
 */
public class Araba 
{
	private int yil;
	private String marka;
	public Araba(int yil, String marka) {
		super();
		this.yil = yil;
		this.marka = marka;
	}
	public int getYil() {
		return yil;
	}
	public void setYil(int yil) {
		this.yil = yil;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	@Override
	public String toString() {
		return "Araba [yil=" + yil + ", marka=" + marka + "]";
	}
	
}
