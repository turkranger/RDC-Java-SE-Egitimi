package com.rdc.ornekler.ornek3.program;

public class Run 
{

	public static void main(String[] args) 
	{
		Calisan employee1 = new Calisan(243, "Ali", "Gider");
		System.out.println("Ad: " + employee1.ad + " soyad: " + employee1.soyad + " id: " + employee1.id);
		
		Calisan employee2;
		employee2 = new Calisan("Veli", "Gelir");
		System.out.println("Ad: " + employee2.ad + " soyad: " + employee2.soyad + " id: " + employee2.id);
		
		Calisan employee3 = new Calisan();
		System.out.println("Ad: " + employee3.ad + " soyad: " + employee3.soyad + " id: " + employee3.id);
	}

}
