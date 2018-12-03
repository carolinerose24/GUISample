package sample.view;

import sample.controller.GUIController;
import javax.swing.*;// .* gives us everything in that folder

import java.awt.Color;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class SamplePanel extends JPanel //frame holds a panel
{
	private GUIController appController;
	
	private JButton colorButton;
	private JButton THISbutton;
	private JLabel textLabel;
	
	private SpringLayout appLayout;
	
	public SamplePanel (GUIController appController)
	{
		super();//bc extends
		
		this.appController = appController;
		appLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	
	}
	
	
	private void setupPanel()
	{
		this.setBackground(Color.lightGray);
		textLabel = new JLabel("This is a color app");
		

		this.add(textLabel);
		colorButton = new JButton("Click to change the color");

		THISbutton = new JButton("This button does NOTHING!");
		this.add(THISbutton);
		
		this.add(colorButton);
		
		this.setLayout(appLayout);
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, textLabel, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, textLabel, 20, SpringLayout.WEST, this);
		
		appLayout.putConstraint(SpringLayout.NORTH, colorButton, 17, SpringLayout.SOUTH, textLabel);
		appLayout.putConstraint(SpringLayout.WEST, colorButton, 10, SpringLayout.WEST, this);
		
		appLayout.putConstraint(SpringLayout.NORTH, THISbutton, 66, SpringLayout.SOUTH, colorButton);
		appLayout.putConstraint(SpringLayout.WEST, THISbutton, 92, SpringLayout.WEST, this);
		
	}
	
	private void setupListeners() //makes the buttons 'listen' for an action
	{
		colorButton.addActionListener(new ActionListener() 
		{//action listeners -> are interfaces and need these structures
			public void actionPerformed(ActionEvent mouseClick)
			{// NEEEEEEED public void
											//System.out.println("*button click*"); //a way to see if your button is clicking
				changeBackgroundColor();
			}
		});
		
		
		THISbutton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				sharkMethod();
			}
		});
		
		
	}
	
	private void changeBackgroundColor()
	{
		//uses ints for color in java (swift: percentages, app inventor: lists)
		int red = (int)(Math.random() * 256);
		int green = (int)(Math.random() * 256); // the (int) is a CAST command -> makes it go to that form
		int blue = (int)(Math.random() * 256); // 0 -> 255 = 256 numbers 255.234234234 -> cuts it off to make it an int
		
		this.setBackground(new Color (red, green, blue));
		textLabel.setText("Red is " + red + ". Green is " + green + ". Blue is " + blue + ".");
	}
	
	private void sharkMethod()
	{
//		ArrayList<String> shark = new ArrayList<String> [5];
//		for (int i = 0; i < 10; i ++)
//		{
//			THISbutton.setText("");
//		}
		THISbutton.setText("No more sugar cookies for you Santa, you're gonna eat your words!");
		
	//	THISbutton.setBackground(new Color(99,22,33));
	
	}
	
}
