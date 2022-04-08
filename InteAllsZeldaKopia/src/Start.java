import javax.sound.sampled.AudioSystem;
import java.io.File;
import javax.swing.*;
import java.awt.*;

public class Start extends JPanel implements Runnable{
	private JFrame window = new JFrame();
	private String imagePath = "Julle_homepage.jpg";
	private String audioFileName = "GameMusic.mav.wav";
	
	public Start() {	
		playAudio();
		this.setPreferredSize(new Dimension(GameManager.SCREEN_WIDTH, GameManager.SCREEN_HIGHT));
		window.add(this);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		
		window.setVisible(true);
		
	}
	
	public void playAudio(){
		
		try {
		File audioPath = new File(audioFileName);
		
		GameManager.stream = AudioSystem.getAudioInputStream(audioPath); 
		GameManager.clip = AudioSystem.getClip();
		GameManager.clip.open(GameManager.stream);
		GameManager.clip.start();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void paint(Graphics g) {
		g.drawImage(new ImageIcon(imagePath).getImage(), 
				300,200, null);
	}

	@Override
	public void run() {
		try {
		Thread.sleep(2000);
		window.dispose();
		
		Exe exe = new Exe();
		
		}
		catch(InterruptedException e){
			
			e.printStackTrace();
			
		}
	}

	}

