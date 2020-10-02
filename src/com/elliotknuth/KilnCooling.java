package com.elliotknuth;

public class KilnCooling implements State {
	Kiln kiln;
	
	private KilnCooling() { }
	
	public KilnCooling(Kiln kiln) {
		this.kiln = kiln;
	}
	@Override
	public void powerOn() {
		System.out.println("The kiln is already on and is now cooling.  You can't turn it on again.");
	}

	@Override
	public void powerOff() {
		System.out.println("Turning the kiln off");
		kiln.setCurrentState(kiln.getKilnOff());
	}

	@Override
	public boolean setCone(int cone) {
		System.out.println("The kiln is cooling.  Please wait for it to reach room temperature before setting cone.");
		return false;
	}

	@Override
	public boolean setFiringSpeed(FiringSpeed speed) {
		System.out.println("The kiln is cooling.  Please wait for it to reach room temperature before setting firing speed.");
		return false;
	}
	
	@Override
	public boolean setBisqueFiring() {
		System.out.println("The kiln is cooling.  Please wait for it to reach room temperature before setting for bisque firing.");
		return false;
	}

	@Override
	public void fire() {
		System.out.println("The kiln is cooling.  Please wait for it to reach room temperature before trying to fire again.");
	}

	@Override
	public void stopFiring() {
		System.out.println("Resetting the kiln to idle state.");
		kiln.setCurrentState(kiln.getKilnOn());
	}

}
