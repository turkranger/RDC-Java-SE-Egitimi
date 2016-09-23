package com.rdc.arayuzler.ornek1.program;
/**
 * @author Alper
 * 
 */
public class Run 
{

	public static void main(String[] args) 
	{
		OracleConnection oracleConnection = new OracleConnection();
		
		if( oracleConnection.openConnection() )
		{
			// veritabani islemleri yapmaya hazir
			// veritabani islemleri yapilir.
		}
		
		oracleConnection.closeConnection();
	}

}
