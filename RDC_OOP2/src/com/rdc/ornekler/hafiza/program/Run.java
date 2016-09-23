package com.rdc.ornekler.hafiza.program;
/**
 * @author Alper
 * 
 */
public class Run
{

	public static void main(String[] args) 
	{
		int sayi1;
		
		sayi1 = 7;
		
		double sayi2 = 3.67;
		
		char ch;
		
		int sayi3;
		
		ch = 'a';
		
		
		Kaplan kaplan1;
		sayi3 = sayi1;
		Kedi kedi=new Kedi("tekir",3);
		kedi.avYap();
		kedi=new Kaplan("tekir",5);
		kedi.avYap();
		kaplan1 = new Kaplan("Simba", 4);
		kaplan1.tirmala();
		
		Kaplan kaplan2 = null;
		
		kaplan1 = kaplan2;
		
		Kaplan kaplan3 = new Kaplan("Felix", 5);
		
		kaplan1 = kaplan2 = kaplan3;
		
		System.out.println(kaplan1);  System.out.println(kaplan2);  System.out.println(kaplan3); 
		
		
		System.out.println();
		
		
		kaplan2.setYas(7);
			
		System.out.println(kaplan1);  System.out.println(kaplan2);  System.out.println(kaplan3); 
	}

}
