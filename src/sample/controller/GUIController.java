package sample.controller;

import sample.view.SampleFrame;


public class GUIController
{
	//data members
	private SampleFrame appFrame;
	
	public GUIController()
	{//no extends, no super
		this.appFrame = new SampleFrame(this);
	}
	
	public void start()
	{
		
	}
}
