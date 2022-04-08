
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Exe {

	private static JFrame frame;
	
	
	
	// top
	private static void setupStartButton(Container pane) {
		JButton button = new JButton();
		
		button.setPreferredSize(new Dimension(GameManager.SCREEN_HIGHT*2, 
				GameManager.SCREEN_WIDTH/8));
		button.setIcon(new ImageIcon("Images//Exit.jpg"));
		
		button.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

			}
			
		});
		pane.add(button, BorderLayout.PAGE_START);	
	}
	
	
	//right label
    private static void setupRightlabel(Container pane) {
		JButton label = new JButton();
		
		label.setPreferredSize(new Dimension(GameManager.SCREEN_HIGHT, 
				GameManager.SCREEN_WIDTH));
		label.setIcon(new ImageIcon("Images//Julle_homepage.jpg"));
		
		label.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent e) {
				
				
			}
			
		});
		pane.add(label, BorderLayout.LINE_END);	
    }
    
    
	//left label
	private static void setupLeftlabel(Container pane)  {
		
		JButton label = new JButton();
		
		label.setPreferredSize(new Dimension(GameManager.SCREEN_HIGHT, 
				GameManager.SCREEN_WIDTH));
		label.setIcon(new ImageIcon("Images//Julle_homepage.jpg"));
		
		label.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent e) {
			

				
			}
			
		});
		pane.add(label, BorderLayout.LINE_START);	
	}
	
	
//	Bottom
	private static void setupBottomButton(Container pane) {
		
		JButton button = new JButton();
		
		button.setPreferredSize(new Dimension(GameManager.SCREEN_HIGHT, 
				GameManager.SCREEN_WIDTH/5));
		button.setIcon(new ImageIcon("Images//Play.png"));
		
		button.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				GamePlan gameplan = new GamePlan();
				
			}
			
		});
		pane.add(button, BorderLayout.PAGE_END);	
		
	}
	
	
	
	
	public static void addComponent(Container pane) {
		pane.setComponentOrientation(java.awt.ComponentOrientation.LEFT_TO_RIGHT);
		
		setupStartButton(pane);
		setupLeftlabel(pane);
		setupRightlabel(pane);
		setupBottomButton(pane);
		
		
	}
	private static void createFrame() {
		frame = new JFrame("Exe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addComponent(frame.getContentPane());
		frame.pack();
		frame.setVisible(true);
		
		
		
	}

	
	public Exe() {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createFrame();
				
			}
			
		});
	}

}
