package com.rdc.abstractclass.ornek1.program;
/**
 * @author Alper
 * 
 */
public class UyduTelefonu extends AbstractTelefon 
{
	private boolean uyduVarMi;
	
	@Override
	public void aramaYap(String telNo) 
	{
		if(uyduVarMi)
		{
			mesajYaz(telNo);
		}
		else
		{
			System.out.println("Uydu yok.");
		}
	}

	public boolean isUyduVarMi() {
		return uyduVarMi;
	}

	public void setUyduVarMi(boolean uyduVarMi) {
		this.uyduVarMi = uyduVarMi;
	}

	@Override
	public String toString() {
		return "UyduTelefonu [uyduVarMi=" + uyduVarMi + "]";
	}

}
