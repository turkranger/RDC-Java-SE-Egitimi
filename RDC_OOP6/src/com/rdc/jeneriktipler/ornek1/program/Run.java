package com.rdc.jeneriktipler.ornek1.program;
/**
 * @author Alper
 * 
 */
public class Run 
{

	public static void main(String[] args) 
	{
		Araba<Integer> araba1 = new Araba<>();
		
		
		int num1 = 98;
		Integer sayi1 = new Integer(98);
		araba1.setDegisken( new Integer(57) ); // kisaca araba1.setDegisken(57); denilebilir
		System.out.println( araba1.getDegisken() );
		
		araba1.setDegisken(sayi1);
		System.out.println( araba1.getDegisken() );
		
		
		Araba<Motor> araba2 = new Araba<Motor>();
		
		araba2.setDegisken(new Motor(1.3, 150, YakitTipi.HIBRIT));
		System.out.println( araba2.getDegisken() );
		araba2.getDegisken().setHacim(1.4);
		System.out.println( araba2.getDegisken() );
	}

}
