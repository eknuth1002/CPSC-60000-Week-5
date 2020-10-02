package com.elliotknuth;

public class KilnFiring implements State {
	Kiln kiln;
	
	private KilnFiring() { }
	
	public KilnFiring(Kiln kiln) {
		this.kiln = kiln;
	}
	@Override
	public void powerOn() {
		System.out.println("The kiln is already on and firing.");
	}

	@Override
	public void powerOff() {
		System.out.println("Turning off the kiln.  The firing was not complete and wares may be effected.");
		kiln.setCurrentState(kiln.getKilnOff());
	}

	@Override
	public boolean setCone(int cone) {
		System.out.println("The kiln is firing.  Please stop the firing or wait until it is complete to set the cone.");
		return false;
	}

	@Override
	public boolean setFiringSpeed(FiringSpeed speed) {
		System.out.println("The kiln is firing.  Please stop the firing or wait until it is complete to setting a firing speed.");
		return false;
	}
	
	@Override
	public boolean setBisqueFiring() {
		System.out.println("The kiln is firing.  Please stop the firing or wait until it is complete to set for bisque firing.");
		return false;
	}

	@Override
	public void fire() {
		System.out.println("The kiln is already firing.");
	}

	@Override
	public void stopFiring() {
		System.out.println("The firing is complete.  Now allowing the kiln to cool.  Please wait until the temperature is at least as low as 250F (preferrably 150F) before opening.");
		kiln.setCurrentState(kiln.getKilnCooling());
	}
	
}
