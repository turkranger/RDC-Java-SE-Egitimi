package com.rdc.ornekler.ornek2.denizmotorlutasitlari;
/**
 * @author Alper
 * 
 */
import com.rdc.ornekler.ornek2.program.DenizMotorluTasiti;
import com.rdc.ornekler.ornek2.program.Motor;

public class Vapur extends DenizMotorluTasiti 
{
	private int kapasite;

	public Vapur(String marka, int yil, Motor motor, int uzunluk, int kapasite) {
		super(marka, yil, motor, uzunluk);
		this.kapasite = kapasite;
	}

	public int getKapasite() {
		return kapasite;
	}

	public void setKapasite(int kapasite) {
		this.kapasite = kapasite;
	}

	@Override
	public String toString() {
		return "Vapur [kapasite=" + kapasite + ", toString()="
				+ super.toString() + "]";
	}
	
}
