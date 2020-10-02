package com.elliotknuth;

public class Runner {
	public static void main(String[] args) {
		Kiln kiln = new Kiln();
		
		kiln.turnOff();
		kiln.setBisqueFiring();
		
		kiln.turnOn();
		kiln.fire();
		
		kiln.setBisqueFiring();
		kiln.fire();
		
		//Pretend there is a thermosensor able to detect the temp and that you see the temp is at the right level
		kiln.stopFiring();
		
		//Pretend there is a thermosensor able to detect the temp is below 150F and you see it is at that level
		kiln.stopFiring();
		
		kiln.setCone(4);
		kiln.setFiringSpeed(FiringSpeed.FAST);
		
		kiln.fire();
		kiln.turnOff();
	}
}
