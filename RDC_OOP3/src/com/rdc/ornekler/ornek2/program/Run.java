package com.rdc.ornekler.ornek2.program;
/**
 * @author Alper
 * 
 */
import com.rdc.ornekler.ornek2.karamotorlutasitlari.Araba;
import com.rdc.ornekler.ornek2.karamotorlutasitlari.Kamyon;
import com.rdc.ornekler.ornek2.denizmotorlutasitlari.Vapur;

public class Run 
{

	public static void main(String[] args) 
	{
		Araba araba1 = new Araba("Ford", 1967, new Motor(5.0, 500, YakitTipi.BENZIN), 2);
		
		Motor motorMAN = new Motor(7.3, 700, YakitTipi.MAZOT);
		Kamyon kamyon1 = new Kamyon("MAN", 2000, motorMAN, 8, 2);
		Vapur vapur=new Vapur("Markaaa", 2015, new Motor(50,1000,YakitTipi.MAZOT), 100, 50);
		System.out.println(araba1);
		System.out.println(kamyon1);
		System.out.println(vapur);
	}
	

}
