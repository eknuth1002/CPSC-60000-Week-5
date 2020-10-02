package com.elliotknuth;

public interface State {
	public void powerOn();
	public void powerOff();
	public boolean setCone(int cone);
	public boolean setFiringSpeed(FiringSpeed speed);
	public boolean setBisqueFiring();
	public void fire();
	public void stopFiring();
}
