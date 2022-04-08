import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Projectile {
	
	private int xAxis;
	private int yAxis;
	private String imagepath;
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
	public String getImagepath() {
		return imagepath;
	}
	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}
	public Projectile(int xAxis, int yAxis, String imagepath) {
		super();
		this.xAxis = xAxis;
		this.yAxis = yAxis;
		this.imagepath = imagepath;
	}
	
	public void drawProjectile(Graphics g) {
		ImageIcon background = new ImageIcon("imagepath");
		
		g.drawImage(background.getImage(), xAxis,yAxis,null);
		
		
			
			
	}
	

}
