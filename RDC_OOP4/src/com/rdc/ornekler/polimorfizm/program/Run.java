package com.rdc.ornekler.polimorfizm.program;
/**
 * @author Alper
 * 
 */
import java.util.ArrayList;
import java.util.List;

public class Run 
{

	private static final double KEDI_CESIT_SAYISI = 3;
	private static final int VARSAYILAN_YAS = 0;
	private static final String VARSAYILAN_STR = "bilinmiyor";
	private static final int LISTE_LIMIT = 5;

	public static void main(String[] args) 
	{
		Kedi kedi;
		
		kedi = new Kedi("Vahsi", 2);
		
		kedi = new Kedi("Sansar", 4);
		
		// kedi = new Araba(2012, "BMW"); yapamaz
		
		// POLIMORFIZM
		System.out.println();
		
		kedi = new Kaplan("Simba", 4);
		kedi = new Cita("Leo", 5);
		kedi = new EvKedisi("Tekir", 2);
		
		
		
		// YUKARI CEVRIM
		System.out.println();
		
		Kaplan kaplan1 = new Kaplan("asda", 4);
		Cita cita1 = new Cita("fdsdf", 5);
		EvKedisi evKedisi1 = new EvKedisi("safdf", 4);
		avGoster(cita1);
		avGoster(kaplan1);
		avGoster(evKedisi1);
		
		
		// DINAMIK BAGLAMA
		System.out.println();
		
		List<Kedi> kediListesi = new ArrayList<Kedi>();
		for(int i=0; i < LISTE_LIMIT; i++)
		{
			kediListesi.add( rastgeleKediSec() );
		}
		
		kediListesiGoster(kediListesi);
		
	}
	
	public static void avGoster(Kedi cat)
	{
		cat.avYap();
	}

	public static Kedi rastgeleKediSec()
	{
		Kedi kedi = null;
		
		int secim = (int)(Math.random()*KEDI_CESIT_SAYISI);
		
		switch (secim) 
		{
			case 0:
				kedi = new EvKedisi(VARSAYILAN_STR, VARSAYILAN_YAS);
				break;
			case 1:
				kedi = new Cita(VARSAYILAN_STR, VARSAYILAN_YAS);
				break;
			case 2:
				kedi = new Kaplan(VARSAYILAN_STR, VARSAYILAN_YAS);
				break;
		}
		
		return kedi;
	}
	
	public static void kediListesiGoster(List<Kedi> kediListesi)
	{
		for (Kedi kedi : kediListesi) 
		{
			System.out.println(kedi);
		}
	}
}
