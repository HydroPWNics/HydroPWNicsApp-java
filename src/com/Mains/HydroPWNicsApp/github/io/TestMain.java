package com.Mains.HydroPWNicsApp.github.io;


import com.GardenControl.HydroPWNicsApp.github.io.AC_ControlBox;
import com.neuronrobotics.sdk.dyio.DyIO;
import com.neuronrobotics.sdk.ui.ConnectionDialog;

public class TestMain {
	
	/* This class exist as a "main" for testing of all kinds along the way
	 * Testing classes
	 * Testing class functions
	 * Testing Test Cases
	 * Testing All the Things!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	*/
	
	static DyIO the_dyio = null;
	
	public static void main(String[] args) {
		System.out.println("Starting");
		DyIO dyio=new DyIO();
		if (!ConnectionDialog.getBowlerDevice(dyio)){
			System.err.println("Dialog failed");
			System.out.println("WHat the fuck it didn't work");
			return;
		}
		dyio.ping();
		dyio.disconnect();
		System.out.println("Connection OK!");
		the_dyio = dyio;
		
		System.out.println("the fuckign dyio is hooked the fuck up");
		
		new AC_ControlBox(the_dyio);
		System.out.println("AC Control box object created see if its fucking working");
	}

}
