package com.rdc.abstractclass.ornek1.program;
/**
 * @author Alper
 * 
 */
import java.util.Scanner;

public class Run 
{

	private static final int FIRST_INDEX = 0;
	private static final boolean DEFAULT_BOOLEAN = true;

	public static void main(String[] args) 
	{
		AbstractTelefon telefon;
		char telefonSecim;
		String telNumara;
		String telTip;
		Scanner scanner = new Scanner(System.in);

		do
		{
			System.out.println();
			System.out.println("Lutfen arama yapacaginiz telefonıun tipini seciniz:");
			System.out.println("Cep tel icin: c\nUydu tel icin: u \nAnkesorlu tel icin: a\n");
			
			telefonSecim = scanner.next().charAt(FIRST_INDEX);
			
			switch (telefonSecim) 
			{
				case 'c':
					telefon = new CepTelefonu();
					telTip = TelefonCesit.cep_telefonu.toString();
					telefonSoru(TelefonCesit.cep_telefonu.toString());
					telNumara = scanner.next();
					
					telefonuAramayaHazirla(telefon);
					
					telefon.aramaYap(telNumara);
					
					break;
		
				case 'u':
					telefon = new UyduTelefonu();
					
					telefonSoru(TelefonCesit.uydu_telefonu.toString());
					telNumara = scanner.next();
					
					telefonuAramayaHazirla(telefon);
					
					telefon.aramaYap(telNumara);
					
					break;
					
				case 'a':
					telefon = new AnkesorluTelefon();
					
					telefonSoru(TelefonCesit.ankesorlu_telefon.toString());
					telNumara = scanner.next();
					
					telefonuAramayaHazirla(telefon);
					
					telefon.aramaYap(telNumara);
					
					break;
					
				case 'e' :
					System.out.println("Cikis tusuna basniz. Iyi gunler.");
					break;
					
				default :
					System.out.println("Yanlis secim yaptiniz. Lutfen tekrar secim yapiniz.");
					break;
			}
		}
		while(telefonSecim != 'e');
		
		
	}

	private static void telefonuAramayaHazirla(AbstractTelefon telefon) 
	{
		if (telefon instanceof CepTelefonu) 
		{
			((CepTelefonu) telefon).setSebekevarMi(DEFAULT_BOOLEAN);
			((CepTelefonu) telefon).setKontorVarMi(DEFAULT_BOOLEAN);
		}
		
		if(telefon instanceof UyduTelefonu)
		{
			((UyduTelefonu) telefon).setUyduVarMi(DEFAULT_BOOLEAN);
		}
		
		if(telefon instanceof AnkesorluTelefon)
		{
			((AnkesorluTelefon) telefon).setJetonVarMi(DEFAULT_BOOLEAN);
		}
		
		telefon.tarihGoster();
	}

	public static void telefonSoru(String telefonCesidi)
	{
		System.out.println("Lutfen " + telefonCesidi + " numarasini giriniz.");
	}
}
