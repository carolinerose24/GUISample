package sample.view;
import javax.swing.JFrame;
import sample.controller.GUIController;

public class SampleFrame extends JFrame
{
	//data members
	private GUIController appController;
	private SamplePanel appPanel;
	
	//constructor-initialize data members
	public SampleFrame(GUIController appController) //2 data members inside - controller
	{ //first line of every constructor (in every class that uses) in extends JFrame-- must use super to call the parent structure
		super();
		
		this.appController = appController; //parameter -> data member
		this.appPanel = new SamplePanel(appController);
		
		setupFrame(); //->send to helper method-keep constructor clean
	}
	
	private void setupFrame() //helper method
	{
		this.setContentPane(appPanel);
		this.setSize(1000, 500);
		this.setTitle("MY first GUI App");
		this.setResizable(false);
		this.setVisible(true);
	}
}
