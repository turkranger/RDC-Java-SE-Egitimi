package com.rdc.ornekler.ornek1.hesaplama;
/**
 * @author Alper
 * 
 */
public class HesapMakinesi 
{
	
	private HesapMakinesi() {
		// TODO Auto-generated constructor stub
	}
	
	public static int topla(int sayi1, int sayi2)
	{
		return sayi1 + sayi2;
	}
	
	public static int cikar(int sayi1, int sayi2)
	{
		return sayi1 - sayi2;
	}
	
	public static int carp(int sayi1, int sayi2)
	{
		return sayi1 * sayi2;
	}
	
	public static double bol(int sayi1, int sayi2)
	{
		return sayi1 / (double) sayi2;
	}
}
