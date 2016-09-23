package com.rdc.jeneriktipler.ornek1.program;
/**
 * @author Alper
 * 
 */
public class Araba<T> 
{
	private T degisken;

	public T getDegisken() {
		return degisken;
	}

	public void setDegisken(T degisken) {
		this.degisken = degisken;
	}

	@Override
	public String toString() {
		return "Araba [degisken=" + degisken + "]";
	}
}
