package com.elliotknuth;

public class KilnOn implements State {
	Kiln kiln;
	
	private KilnOn() { }
	
	public KilnOn(Kiln kiln) {
		this.kiln = kiln;
	}

	@Override
	public void powerOn() {
		System.out.println("The kiln is already on.");
	}

	@Override
	public void powerOff() {
		System.out.println("Turning off the kiln.");
		kiln.setCurrentState(kiln.getKilnOff());
	}

	@Override
	public boolean setCone(int cone) {
		System.out.println("Setting the program for cone " + cone);
		kiln.setCurrentState(kiln.getKilnReady());
		return true;
	}

	@Override
	public boolean setFiringSpeed(FiringSpeed speed) {
		System.out.println("Setting the firing speed for " + speed);
		kiln.setCurrentState(kiln.getKilnReady());
		return true;
	}

	@Override
	public boolean setBisqueFiring() {
		System.out.println("Setting the program to cone 06 and 108F/hour");
		kiln.setCurrentState(kiln.getKilnReady());
		return true;
	}

	@Override
	public void fire() {
		System.out.println("You need to set a program first.");
	}

	@Override
	public void stopFiring() {
		System.out.println("The kiln is not firing.");		
	}

}
