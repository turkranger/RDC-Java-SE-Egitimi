package com.rdc.ornekler.kalitim.program;
/**
 * @author Alper
 * 
 */
public class Run 
{

	public static void main(String[] args) 
	{
		EvKedisi evKedisi1 = new EvKedisi("Tekir", 3);
		evKedisi1.avYap();
		
		System.out.println(evKedisi1);
		
		Kaplan kaplan1;
		kaplan1 = new Kaplan("Max", 2);
		kaplan1.avYap();
		
		System.out.println(kaplan1);	
	}

}
