import java.awt.Graphics;

import javax.swing.ImageIcon;

public class You {
	
	private int xAxis;
	private int yAxis;
	private String imagePath;
	public int getxAxis() {
		return xAxis;
	}
	public void setxAxis(int xAxis) {
		this.xAxis = xAxis;
	}
	public int getyAxis() {
		return yAxis;
	}
	public void setyAxis(int yAxis) {
		this.yAxis = yAxis;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public You(int xAxis, int yAxis, String imagePath) {
		super();
		this.xAxis = xAxis;
		this.yAxis = yAxis;
		this.imagePath = imagePath;
	}
	
	public void PaintYou(Graphics g) {
		ImageIcon you = new ImageIcon("Images//Julle_homepage.jpg");
		
		g.drawImage(you.getImage(), xAxis,yAxis,null);
		
		
			
			
	}
	

}
