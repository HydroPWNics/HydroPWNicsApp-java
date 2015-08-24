package com.GardenControl.HydroPWNicsApp.github.io;

import com.DataTypes.hydroPWNicsAPI.github.io.Garden;
import com.neuronrobotics.sdk.dyio.DyIO;

public class GardenController {
	
	Garden deployedGarden = new Garden();
	AC_ControlBox pmpLghtsBox = new AC_ControlBox(new DyIO());
	
	public GardenController(){
		
	}
	
	public void shutOffLights(){
		pmpLghtsBox.setOutlet0_OFF();
	}
	
	public void turnOnLights(){
		pmpLghtsBox.setOutlet0_ON();
	}
	
	
	
}
