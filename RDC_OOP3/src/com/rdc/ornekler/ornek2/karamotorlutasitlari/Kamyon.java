package com.rdc.ornekler.ornek2.karamotorlutasitlari;
/**
 * @author Alper
 * 
 */

import com.rdc.ornekler.ornek2.program.KaraMotorluTasiti;
import com.rdc.ornekler.ornek2.program.Motor;

public class Kamyon extends KaraMotorluTasiti
{
	
	private int kapiSayisi;
	
	public Kamyon(String marka, int yil, Motor motor, int tekerSayisi, int kapiSayisi) 
	{
		super(marka, yil, motor, tekerSayisi);
		this.kapiSayisi = kapiSayisi;		
	}

	public int getKapiSayisi() {
		return kapiSayisi;
	}

	public void setKapiSayisi(int kapiSayisi) {
		this.kapiSayisi = kapiSayisi;
	}

	@Override
	public String toString() {
		return "Kamyon [kapiSayisi=" + kapiSayisi + ", toString()=" + super.toString() + "]";
	}
	
		
}
