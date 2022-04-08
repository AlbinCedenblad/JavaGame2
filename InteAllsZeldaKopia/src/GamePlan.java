
		import javax.swing.*;
		import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

	
		public class GamePlan extends JPanel implements KeyListener{
			private JFrame window = new JFrame();
//			Projectile projectile = new Projectile(500,500);
			You you = new You(400,600,"imagePath");
			
		
			public GamePlan() {
			window.setSize(1000,1000); 
			window.setLocation(40, 20);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setVisible(true);
			window.add(this);
			
			
			
				
				 
			}
		

    		public void paint(Graphics g) {
			ImageIcon background = new ImageIcon("Images//yellow-brick-wall.jpg");
			g.drawImage(background.getImage(),0,0,null);
			
			you.PaintYou(g);
			
			
			
				
				
		}
		
			


			@Override
			public void keyTyped(KeyEvent e) {
				
				
			}


			@Override
			public void keyPressed(KeyEvent e) {
				
				
			}


			@Override
			public void keyReleased(KeyEvent e) {
				
			}

	}


