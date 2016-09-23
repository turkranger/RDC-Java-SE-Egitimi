package com.rdc.ornekler.staticerisim.program;
/**
 * @author Alper
 * 
 */
public class Run 
{

	public static void main(String[] args) 
	{
		Ogrenci ogrenci1 = new Ogrenci();
		Ogrenci ogrenci2 = new Ogrenci();
		Ogrenci ogrenci3 = new Ogrenci();
		
		System.out.println( Ogrenci.ogrenciSayaci );
		
		new Ogrenci();
		new Ogrenci();
		new Ogrenci();
		
//		System.out.println( ogrenci3.getOgrenciSayaci() );
//		
//		System.out.println( ogrenci1.getOgrenciSayaci() );
		
		System.out.println( Ogrenci.ogrenciSayaci );
	}

}
