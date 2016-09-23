package com.rdc.dosyaislemleri.program;
/**
 * @author Alper
 * 
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Run1 
{
	
	public static final int FIRST_NAME = 0;
	public static final int LAST_NAME = 1;	

	public static void main(String[] args) 
	{
		BufferedReader inputStream = null;
		BufferedWriter outputStream = null;
		String line;
		String surname;
		
		try
		{
			inputStream = new BufferedReader(new FileReader("C:\\Users\\alper\\Desktop\\yap.txt"));
			System.out.println("RDC_ogrenciler.txt dosyasi okundu.");
			
			outputStream = new BufferedWriter(new FileWriter("C:\\Users\\alper\\Desktop\\RDC_ogrencilerSoyad.txt"));
			System.out.println("RDC_ogrencilerSoyad.txt dosyasi olusturuldu.");
			
			while( (line = inputStream.readLine()) != null)
			{
				// outputStream.write(line + "\n");
				
				surname = line.split(" ")[LAST_NAME];
				
				outputStream.write(surname + "\n");
			}
		}
		catch(IOException exception)
		{
			exception.printStackTrace();
			exception.getMessage();
		}
		finally 
		{
			if(inputStream != null)
			{
				try
				{
					inputStream.close();
				}
				catch(IOException exception)
				{
					exception.printStackTrace();
					exception.getMessage();
				}
				
				if(outputStream != null)
				{
					try
					{
						outputStream.close();
					}
					catch(IOException exception)
					{
						exception.printStackTrace();
						exception.getMessage();
					}
				}
			}
		}

	}

}
