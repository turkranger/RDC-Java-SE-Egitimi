package com.rdc.jeneriktipler.ornek2.program;
/**
 * @author Alper
 * 
 */
public class Araba<Y, M, E, T>
{
	private Y yil;
	private M marka;
	private E motor;
	
	public Araba(Y yil, M marka, E motor) 
	{
		this.yil = yil;
		this.marka = marka;
		this.motor = motor;
	}
	
	public Y getYil() {
		return yil;
	}
	public void setYil(Y yil) {
		this.yil = yil;
	}
	public M getMarka() {
		return marka;
	}
	public void setMarka(M marka) {
		this.marka = marka;
	}
	public E getMotor() {
		return motor;
	}
	public void setMotor(E motor) {
		this.motor = motor;
	}


	@Override
	public String toString() {
		return "Araba [yil=" + yil + ", marka=" + marka + ", motor=" + motor + "]";
	}
	
}
