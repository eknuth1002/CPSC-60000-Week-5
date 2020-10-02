package com.elliotknuth;

public class Kiln {
	
	private State kilnOn;
	private State kilnOff;
	private State kilnReady;
	private State kilnFiring;
	private State kilnCooling;
	
	private State currentState;
	
	private int cone = 022;
	private FiringSpeed speed = FiringSpeed.NORMAL;
	
	public Kiln() {
		kilnOn = new KilnOn(this);
		kilnOff = new KilnOff(this);
		kilnReady = new KilnReady(this);
		kilnFiring = new KilnFiring(this);
		kilnCooling = new KilnCooling(this);
		
		currentState = kilnOff;
		
	}

	public State getKilnOn() {
		return kilnOn;
	}

	public State getKilnOff() {
		return kilnOff;
	}
	
	public State getKilnReady() {
		return kilnReady;
	}
	
	public State getKilnFiring() {
		return kilnFiring;
	}

	public State getKilnCooling() {
		return kilnCooling;
	}
	
	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}
	
	public void turnOn() {
		currentState.powerOn();
	}

	public void turnOff() {
		currentState.powerOff();
	}

	public void setCone(int cone) {
		if (currentState.setCone(cone)) {
			this.cone = cone;
		}
	}

	public void setFiringSpeed(FiringSpeed speed) {
		if (currentState.setFiringSpeed(speed)) {
			this.speed = speed;
		}
	}

	public void setBisqueFiring() {
		if (currentState.setBisqueFiring()) {
			this.cone = 06;
			this.speed = FiringSpeed.NORMAL;
		}
	}

	public void fire() {
		currentState.fire();
	}
	
	public void stopFiring() {
		currentState.stopFiring();
	}
	
	public int getCone() {
		return cone;
	}

	public FiringSpeed getSpeed() {
		return speed;
	}
}
