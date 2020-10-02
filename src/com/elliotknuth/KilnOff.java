package com.elliotknuth;

public class KilnOff implements State {
	Kiln kiln;
	
	private KilnOff() { }
	
	public KilnOff(Kiln kiln) {
		this.kiln = kiln;
	}
	@Override
	public void powerOn() {
		System.out.println("Turning the kiln on");
		kiln.setCurrentState(kiln.getKilnOn());
	}

	@Override
	public void powerOff() {
		System.out.println("The kiln is already turned off.");
	}

	@Override
	public boolean setCone(int cone) {
		System.out.println("The kiln is turned off.  Please turn the kiln on to program a cone.");
		return false;
	}

	@Override
	public boolean setFiringSpeed(FiringSpeed speed) {
		System.out.println("The kiln is turned off.  Please turn the kiln on to set a firing speed.");
		return false;
	}

	@Override
	public boolean setBisqueFiring() {
		System.out.println("The kiln is turned off.  Please turn the kiln on to set for bisque firing.");
		return false;
	}

	@Override
	public void fire() {
		System.out.println("The kiln is turned off.  Please turn the kiln on and verify program before firing.");
	}

	@Override
	public void stopFiring() {
		System.out.println("The kiln is turned off and not firing.  Please turn the kiln on and use a firing program.");		
	}

}
