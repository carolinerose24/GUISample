package sample.view;

import sample.controller.GUIController;
import javax.swing.*;// .* gives us everything in that folder

import java.awt.Color;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SamplePanel extends JPanel //frame holds a panel
{
	private GUIController appController;
	
	private JButton colorButton;
	private JLabel textLabel;
	
	public SamplePanel (GUIController appController)
	{
		super();//bc extends
		
		this.appController = appController;
		colorButton = new JButton("Click to change the color");//words on button
		textLabel = new JLabel("This is a color app");
		
		setupPanel();
		setupLayout();
		setupListeners();
	
	}
	
	
	private void setupPanel()
	{
		this.setBackground(Color.lightGray);
		this.add(textLabel);
		this.add(colorButton);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners() //makes the buttons 'listen' for an action
	{
		colorButton.addActionListener(new ActionListener() 
		{//action listeners -> are interfaces and need these structures
			public void actionPerformed(ActionEvent mouseClick)
			{// NEEEEEEED public void
				
			}
		});
	}
	
	
}
