

public class game { 
	
	public static void main(String[] args) {
		Thread gameThread = new Thread(new Start());
		gameThread.run();
	
	}
}
