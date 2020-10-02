package com.elliotknuth;

public class KilnReady implements State {
	Kiln kiln;
	
	private KilnReady() { }
	
	public KilnReady(Kiln kiln) {
		this.kiln = kiln;
	}
	@Override
	public void powerOn() {
		System.out.println("The kiln is already on and programmed to fire.");
	}

	@Override
	public void powerOff() {
		System.out.println("Turnign the kiln off.");
		kiln.setCurrentState(kiln.getKilnOff());
	}

	@Override
	public boolean setCone(int cone) {
		System.out.println("Changing the program for cone " + cone + ".  You may set it for another cone, fast firign, or fire the kiln.");
		return true;
	}

	@Override
	public boolean setFiringSpeed(FiringSpeed speed) {
		System.out.println("Changing the firing speed to " + speed);
		return true;
	}
	
	@Override
	public boolean setBisqueFiring() {
		System.out.println("Changing the cone to 06 and speed to 108F/hour");
		return true;
	}

	@Override
	public void fire() {
		System.out.println("Firing kiln.  Please do not look into kiln without eye protection of open kiln when over 150F.");
		kiln.setCurrentState(kiln.getKilnFiring());
	}

	@Override
	public void stopFiring() {
		System.out.println("The kiln is not firing yet.");
	}

}
