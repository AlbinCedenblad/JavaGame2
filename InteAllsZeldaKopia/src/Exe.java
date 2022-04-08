
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Exe {

	private static JFrame frame;
	
	private static void setupStartButton(Container pane) {
		JButton button = new JButton();
		
		button.setPreferredSize(new Dimension(GameManager.SCREEN_HIGHT, 
				GameManager.SCREEN_WIDTH/5));
		button.setIcon(new ImageIcon("Julle_homepage.jpg"));
		
		button.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				JOptionPane.showMessageDialog(null, "oo");
				
			}
			
		});
		pane.add(button, BorderLayout.PAGE_START);	
	}
	
	
	//right button
    private static void setupRightButton(Container pane) {
		JButton button = new JButton();
		
		button.setPreferredSize(new Dimension(GameManager.SCREEN_HIGHT/3, 
				GameManager.SCREEN_WIDTH/5));
		button.setIcon(new ImageIcon("Julle_homepage.jpg"));
		
		button.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("Q BUTTON IS PRESSED");
				
			}
			
		});
		pane.add(button, BorderLayout.LINE_END);	
    }
    
    
//    Middle
    private static void setupCenterImage(Container pane) {
    	JLabel label = new JLabel();
    	
    	label.setPreferredSize(new Dimension(GameManager.SCREEN_HIGHT, 
				GameManager.SCREEN_WIDTH/5));
		label.setIcon(new ImageIcon("Julle_homepage.jpg"));
		pane.add(label, BorderLayout.CENTER);
    }
    
    
    
	//left button
	private static void setupLeftButton(Container pane)  {
		
		JButton button = new JButton();
		
		button.setPreferredSize(new Dimension(GameManager.SCREEN_HIGHT/5, 
				GameManager.SCREEN_WIDTH/3));
		button.setIcon(new ImageIcon("Julle_homepage.jpg"));
		
		button.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				JOptionPane.showMessageDialog(null, "oo");
				try {
					GameManager.stream.close();
					
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
				
			}
			
		});
		pane.add(button, BorderLayout.LINE_START);	
	}
	
	
//	Bottom
	private static void setupBottomButton(Container pane) {
		
		JButton button = new JButton();
		
		button.setPreferredSize(new Dimension(GameManager.SCREEN_HIGHT, 
				GameManager.SCREEN_WIDTH/5));
		button.setIcon(new ImageIcon("Julle_homepage.jpg"));
		
		button.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("ABOUT BUTTON IS PRESSED");
				
			}
			
		});
		pane.add(button, BorderLayout.PAGE_END);	
		
	}
	
	public static void addComponent(Container pane) {
		pane.setComponentOrientation(java.awt.ComponentOrientation.LEFT_TO_RIGHT);
		
		setupStartButton(pane);
		setupCenterImage(pane);
		setupLeftButton(pane);
		setupRightButton(pane);
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
