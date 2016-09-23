package com.rdc.ornekler.ornek3.program;
/**
 * @author Alper
 * 
 */
import com.rdc.ornekler.ornek2.program.Motor;

public class MotorluTasit 
{
	private String marka;
	private int yil;
	private Motor motor;
	
	public MotorluTasit(String marka, int yil, Motor motor) // "default constructor"i ezdi.
	{
		this.marka = marka;
		this.yil = yil;
		this.motor = motor;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public int getYil() {
		return yil;
	}
	public void setYil(int yil) {
		this.yil = yil;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	@Override
	public String toString() {
		return "MotorluTasit [marka=" + marka + ", yil=" + yil + ", motor=" + motor + "]";
	}
	
	
}
