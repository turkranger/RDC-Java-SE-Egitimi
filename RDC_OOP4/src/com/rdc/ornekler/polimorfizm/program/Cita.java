package com.rdc.ornekler.polimorfizm.program;
/**
 * @author Alper
 * 
 */
public class Cita extends Kedi
{

	public Cita(String isim, int yas) {
		super(isim, yas);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void avYap() {
		System.out.println("Cita koyun boyutunda av yapti.");
	}

	@Override
	public String toString() {
		return "Cita [toString()=" + super.toString() + "]";
	}
	
	
	
}
