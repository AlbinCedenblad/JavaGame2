
		import javax.swing.*;
		import java.awt.*;

	
		public class GamePlan extends JPanel implements Runnable{
			private JFrame window = new JFrame();
			private String imagePath = "yellow-brick-wall.jpg";
			
			public GamePlan() {	
				this.setPreferredSize(new Dimension(GameManager.SCREEN_WIDTH, 
						GameManager.SCREEN_HIGHT));
				window.add(this);
				window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				window.pack();
				window.setVisible(true);
				
			}
			

			public void paint(Graphics g) {
				g.drawImage(new ImageIcon(imagePath).getImage(), 
						0,0, null);
			}


			@Override
			public void run() {
				
				
			}

	}


