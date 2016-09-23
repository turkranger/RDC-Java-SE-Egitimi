package com.rdc.abstractclass.ornek1.program;
/**
 * @author Alper
 * 
 */
public class CepTelefonu extends AbstractTelefon
{
	private boolean sebekevarMi;
	private boolean kontorVarMi;
	
	
	@Override
	public void aramaYap(String telNo) 
	{
		if(sebekevarMi)
		{
			if(kontorVarMi)
			{
				mesajYaz(telNo);
			}
			else
			{
				System.out.println("Lutfen kontor yukleyiniz.");
			}
		}
		else
		{
			System.out.println("Sebeke uygun degil.");
		}
	}
	
	public boolean isSebekevarMi() {
		return sebekevarMi;
	}
	public void setSebekevarMi(boolean sebekevarMi) {
		this.sebekevarMi = sebekevarMi;
	}
	public boolean isKontorVarMi() {
		return kontorVarMi;
	}
	public void setKontorVarMi(boolean kontorVarMi) {
		this.kontorVarMi = kontorVarMi;
	}
	
	@Override
	public String toString() {
		return "CepTelefonu [sebekevarMi=" + sebekevarMi + ", kontorVarMi=" + kontorVarMi + "]";
	}
		
	
}
