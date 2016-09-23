package com.rdc.ornekler.ornek2.program;
/**
 * @author Alper
 * 
 */
import com.rdc.ornekler.ornek3.program.MotorluTasit;

public class DenizMotorluTasiti extends MotorluTasit 
{
	private int uzunluk;

	public DenizMotorluTasiti(String marka, int yil, Motor motor, int uzunluk) {
		super(marka, yil, motor);
		this.uzunluk = uzunluk;
	}

	public int getUzunluk() {
		return uzunluk;
	}

	public void setUzunluk(int uzunluk) {
		this.uzunluk = uzunluk;
	}

	@Override
	public String toString() {
		return "DenizMotorluTasiti [uzunluk=" + uzunluk + ", toString()="
				+ super.toString() + "]";
	}


	
	
	
	

}
