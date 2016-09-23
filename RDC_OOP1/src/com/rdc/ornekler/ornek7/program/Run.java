package com.rdc.ornekler.ornek7.program;

public class Run 
{

	public static void main(String[] args) 
	{
		Calisan calisan1 = new Calisan(245);
		
		Calisan calisan2 = new Calisan("Hasan", "Ucar");
		System.out.println("Calisan2 id: " + calisan2.getId());
		
		System.out.println(calisan1); // System.out.println(calisan1.toString()); ile ayni
//		System.out.println(calisan2.toString());
//		calisan2.setId(245);
		
	 	String str1 = new String("Selam");
	 	String str2 = "naber";
	 	
		System.out.println( calisan1.equals(str1) );
		
		System.out.println( calisan1.equals(calisan2) );
		
		System.out.println( calisan1.hashCode() );
		
		System.out.println( calisan2.hashCode() );
	}

}
