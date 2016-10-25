package com.rdc.dosyaislemleri.program;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Run2
{
	
	public static final int FIRST_NAME = 0;
	public static final int LAST_NAME = 1;	

	public static void main(String[] args) 
	{

		
		String line;
		String firstName;
		
		try
		(
			BufferedReader inputStream = new BufferedReader(new FileReader("C:\\Users\\alper\\Desktop\\RDC_ogrenciler.txt"));
			BufferedWriter outputStream = new BufferedWriter(new FileWriter("C:\\Users\\alper\\Desktop\\RDC_ogrencilerAd.txt"));
		)
		{
			
			System.out.println("RDC_ogrenciler.txt dosyasi okundu.");

			System.out.println("RDC_ogrencilerSoyad.txt dosyasi olusturuldu.");
						
			while( (line = inputStream.readLine()) != null)
			{
				// outputStream.write(line + "\n");
				
				firstName = line.split(" ")[FIRST_NAME];
				
				outputStream.write(firstName + "\n");
			}
		}
		catch(IOException exception)
		{
			exception.printStackTrace();
			exception.getMessage();
		}		
		
	}

}
