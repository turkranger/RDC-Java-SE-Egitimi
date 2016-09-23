package com.rdc.ornekler.ornek2.program;
/**
 * @author Alper
 * 
 */
public class Vapur 
{
	private int model;
	private Motor motor;
	public Vapur(int model, Motor motor) {
		super();
		this.model = model;
		this.motor = motor;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	@Override
	public String toString() {
		return "Vapur [model=" + model + ", motor=" + motor + "]";
	}
	
}
