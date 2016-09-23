package com.rdc.jeneriktipler.ornek1.program;
/**
 * @author Alper
 * 
 */
public class Motor 
{
	private static final YakitTipi VARSAYILAN_YAKIT_TIPI = YakitTipi.BENZIN;
	private static final int VARSAYILAN_BEYGIR_GUCU = 130;
	private static final double VARSAYILAN_HACIM = 1.6;
	
	private double hacim;
	private int beygirGucu;
	private YakitTipi yakitTipi;
	
	public Motor(double hacim, int beygirGucu, YakitTipi yakitTipi) 
	{
		this.hacim = hacim;
		this.beygirGucu = beygirGucu;
		this.yakitTipi = yakitTipi;
	}
	
	public Motor() 
	{
		this(VARSAYILAN_HACIM, VARSAYILAN_BEYGIR_GUCU, VARSAYILAN_YAKIT_TIPI);
	}

	public double getHacim() {
		return hacim;
	}

	public void setHacim(double hacim) {
		this.hacim = hacim;
	}

	public int getBeygirGucu() {
		return beygirGucu;
	}

	public void setBeygirGucu(int beygirGucu) {
		this.beygirGucu = beygirGucu;
	}

	public YakitTipi getYakitTipi() {
		return yakitTipi;
	}

	public void setYakitTipi(YakitTipi yakitTipi) {
		this.yakitTipi = yakitTipi;
	}

	@Override
	public String toString() {
		return "Motor [hacim=" + hacim + ", beygirGucu=" + beygirGucu + ", yakitTipi=" + yakitTipi + "]";
	}
	
	
}
