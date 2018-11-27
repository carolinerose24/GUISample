package sample.view;

import sample.controller.GUIController;
import javax.swing.*;// .* gives us everything in that folder

public class SamplePanel extends JPanel //frame holds a panel
{
	private GUIController appController;
	
	public SamplePanel (GUIController appController)
	{
		super();//bc extends
		
		this.appController = appController;
	}
}
