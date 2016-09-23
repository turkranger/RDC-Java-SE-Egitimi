package com.rdc.abstractclass.ornek1.program;
/**
 * @author Alper
 * 
 */
public class AnkesorluTelefon extends AbstractTelefon
{
	private boolean jetonVarMi;
	
	@Override
	public void aramaYap(String telNo) {
		if(jetonVarMi)
		{
			mesajYaz(telNo);
		}
		else
		{
			System.out.println("Jeton atmadiniz.");
		}
		
	}

	public boolean isJetonVarMi() {
		return jetonVarMi;
	}

	public void setJetonVarMi(boolean jetonVarMi) {
		this.jetonVarMi = jetonVarMi;
	}

	@Override
	public String toString() {
		return "AnkesorluTelefon [jetonVarMi=" + jetonVarMi + "]";
	}

	
}
