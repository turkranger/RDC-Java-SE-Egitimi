package com.rdc.jeneriktipler.ornek2.program;
/**
 * @author Alper
 * 
 */
import java.util.Date;

public class Run {

	public static void main(String[] args) 
	{
		
		Motor motorMustang = new Motor();
		
		Araba<Date, String, Motor, YakitTipi> car1;
		car1 = new Araba<Date, String, Motor, YakitTipi>( new Date(), "Mustang", motorMustang );
		
		System.out.println(car1);
		
		car1.getMotor().setHacim(5.4); car1.getMotor().setBeygirGucu(550);  car1.getMotor().setYakitTipi(YakitTipi.BENZIN);
		
		System.out.println(car1);
	}

}
