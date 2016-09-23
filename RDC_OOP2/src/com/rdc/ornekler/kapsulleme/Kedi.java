package com.rdc.ornekler.kapsulleme;
/**
 * @author Alper
 * 
 */
import com.rdc.ornekler.kapsulleme.program.Memeli;

public class Kedi extends Memeli
{
	public Kedi()
	{
		System.out.println("Kedi icin parametresiz yapilandirici cagirildi.");
		dogurma();
		yavruyuSutleBesle();
		// yavruyu1YildanUzunKoru();
	}
}
