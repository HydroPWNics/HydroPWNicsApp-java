package com.GUI.HydroPWNicsApp.github.io;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

@SuppressWarnings("serial")
public class Dashboard extends JFrame{

	// default size of JFrame when first drawn
	private int x_dflt=800;
	private int y_dflt=500;
	
	// class wide variables for dynamic resizing of objects
	public static double width;
	public static double height;
	
	
	// Constructor metho
	public Dashboard(){
		
	}
	
	
	
	public JTabbedPane BuildGraphicalDashTab(){
		return new JTabbedPane();
	}
	
	public JTabbedPane BuildSettingsTab(){
		return new JTabbedPane();
	}
	
	public JTabbedPane BuildStatsTab(){
		return new JTabbedPane();
	}
	
	public JTabbedPane BuildHubTab(){
	 return new JTabbedPane();	
	}
	
	// builds the Tab for displaying the status of all Garden
	public JTabbedPane BuildGardenUnitTab(){
		return new JTabbedPane();
	}
	
	
	public JPanel BuildGraphicsPanel(){
		return new JPanel();
	}
	
}
