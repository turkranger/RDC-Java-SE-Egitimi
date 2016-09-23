package com.rdc.abstractclass.ornek1.program;
/**
 * @author Alper
 * 
 */
import java.util.Date;

public abstract class AbstractTelefon implements Callable
{
	public void tarihGoster()
	{
		System.out.println("Tarih: " + new Date());
	}
	
	public void mesajYaz(String tel)
	{
		System.out.println(getClass() + "'dan aramaya yapiliyor. Telefon: " + tel);
	}
}
