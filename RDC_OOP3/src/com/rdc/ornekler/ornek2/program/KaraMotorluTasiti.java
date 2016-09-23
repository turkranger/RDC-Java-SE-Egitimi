package com.rdc.ornekler.ornek2.program;
/**
 * @author Alper
 * 
 */
import com.rdc.ornekler.ornek3.program.MotorluTasit;

public class KaraMotorluTasiti extends MotorluTasit
{

	private int tekerSayisi;
	
	public KaraMotorluTasiti(String marka, int yil, Motor motor, int tekerSayisi) 
	{
		super(marka, yil, motor);
		this.tekerSayisi = tekerSayisi;
	}

	public int getTekerSayisi() {
		return tekerSayisi;
	}

	public void setTekerSayisi(int tekerSayisi) {
		this.tekerSayisi = tekerSayisi;
	}

	@Override
	public String toString() {
		return "KaraMotorluTasiti [tekerSayisi=" + tekerSayisi + ", toString()=" + super.toString() + "]";
	}

	
}
