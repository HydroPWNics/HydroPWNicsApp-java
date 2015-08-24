package com.GardenControl.HydroPWNicsApp.github.io;

import com.neuronrobotics.sdk.dyio.DyIO;
import com.neuronrobotics.sdk.dyio.peripherals.AnalogInputChannel;
import com.neuronrobotics.sdk.dyio.peripherals.DigitalInputChannel;
import com.neuronrobotics.sdk.dyio.peripherals.DigitalOutputChannel;

public class AC_ControlBox {
	boolean outlet0_status = false;
	boolean outlet1_status = false;
	int outlet0_current = 0;
	int outlet1_current = 0;
	
	DyIO AC_CntrlDyIO = null;
	
	// Digital outputs for triggering SSRs for turning AC outlets on and off.
	DigitalOutputChannel acSSR0 = null;
	DigitalOutputChannel acSSR1 = null;
	
	// Analog inputs for current sensing on AC outlets 
	AnalogInputChannel acSSR0_current = null;
	AnalogInputChannel acSSR1_current = null;
	
	// Flow Meter Digital Inputs
	DigitalInputChannel flowMeter0_p1 = null;
	DigitalInputChannel flowMEter0_p2 = null;
	
	// Water Level Sensor Digital Inputs, one per Row
	DigitalInputChannel wtrLvl0 = null;
	DigitalInputChannel wtrLvl1 = null;
	DigitalInputChannel wtrLvl2 = null;
	DigitalInputChannel wtrLvl3 = null;
		
	
	/**
	 * 
	 * @param dyio
	 */
	public AC_ControlBox(DyIO dyio){
		setupClass(dyio);
		setOutlet0_OFF();
		setOutlet1_OFF();	
	}
	
	/**
	 * 
	 * @param dyio
	 * @param outlet0	boolean determining the on/off status of the outlet when AC_ControlBox is instantiated
	 * @param outlet1	boolean determining the on/off status of outlet1 when AC_ControlBox is instantiated
	 */
	public AC_ControlBox(DyIO dyio, boolean outlet0, boolean outlet1){
		setupClass(dyio);
		if(outlet0){
			setOutlet0_ON();
		}
		else{
			setOutlet0_OFF();
		}
		
		if(outlet1){
			setOutlet1_ON();
		}
		else{
			setOutlet1_OFF();
		}
	}
	
	/**
	 * Sets up all objects related to class, setup as a function to allow for cleaner constructors
	 * @param dyio
	 */
	private void setupClass(DyIO dyio){
		AC_CntrlDyIO = dyio;
		acSSR0 = new DigitalOutputChannel(AC_CntrlDyIO.getChannel(1));
		acSSR1 = new DigitalOutputChannel(AC_CntrlDyIO.getChannel(2));
		acSSR0_current = new AnalogInputChannel(AC_CntrlDyIO.getChannel(4),true);
		acSSR1_current = new AnalogInputChannel(AC_CntrlDyIO.getChannel(5),true);
		wtrLvl0 = new DigitalInputChannel(AC_CntrlDyIO.getChannel(6));
		wtrLvl1 = new DigitalInputChannel(AC_CntrlDyIO.getChannel(7));
		wtrLvl2 = new DigitalInputChannel(AC_CntrlDyIO.getChannel(8));
		wtrLvl3 = new DigitalInputChannel(AC_CntrlDyIO.getChannel(9));
		flowMeter0_p1 = new DigitalInputChannel(AC_CntrlDyIO.getChannel(10));
		flowMEter0_p2 = new DigitalInputChannel(AC_CntrlDyIO.getChannel(11));
		
	}
	
	// Outlet 0 Control Functions
	/**
	 * 
	 */
	public void setOutlet0_ON(){
		acSSR0.setHigh(true);
		outlet0_status = true;
	}
	/**
	 * 
	 */
	public void setOutlet0_OFF(){
		acSSR0.setHigh(false);
		outlet0_status = false;
	}
	/**
	 * 
	 * @return
	 */
	public boolean getOutlet0_STATUS(){
		return outlet0_status;
	}
	/**
	 * 
	 * @return
	 */
	public int getOutlet0_CURRENT(){
		return outlet0_current;
	}
		
	
	// Outlet 1 Control Functions
	/**
	 * 
	 */
	public void setOutlet1_ON(){
		acSSR1.setHigh(true);
		outlet1_status = true;
	}
	/**
	 * 
	 */
	public void setOutlet1_OFF(){
		acSSR1.setHigh(false);
		outlet1_status = false;
	}
	/**
	 * 
	 */
	public boolean getOutlet1_STATUS(){
		return outlet1_status;
	}
	/**
	 * 
	 * @return
	 */
	public int getOutlet1_CURRENT(){
		return outlet1_current;
	}

	
	public void setupOutletAsTimedPump(int outlet_num){
		
	}
	
	public void setupOutletAsFlowTestPump(int outlet_num){
		
	}
	
	public void setupOutletAsWaterLevelPump(int outlet_num){
		
	}
	
}
