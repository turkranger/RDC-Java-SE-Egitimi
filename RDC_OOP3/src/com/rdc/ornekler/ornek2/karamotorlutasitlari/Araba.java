package com.rdc.ornekler.ornek2.karamotorlutasitlari;
/**
 * @author Alper
 * 
 */
import com.rdc.ornekler.ornek2.program.KaraMotorluTasiti;
import com.rdc.ornekler.ornek2.program.Motor;

public class Araba extends KaraMotorluTasiti
{
	
	private static final int VARSAYILAN_TEKER_SAYISI = 4;
	private int kapiSayisi;
	
	public Araba(String marka, int yil, Motor motor, int kapiSayisi) 
	{
		super(marka, yil, motor, VARSAYILAN_TEKER_SAYISI);
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
		return "Araba [kapiSayisi=" + kapiSayisi + ", toString()=" + super.toString() + "]";
	}
	
}
