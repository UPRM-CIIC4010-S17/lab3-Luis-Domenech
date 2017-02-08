import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Luis Domenech");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//Ubuntu pc resolution is 1920 x 1080
		myFrame.setSize(200, 200);
		//We subtract the frame's dimensions to truly center the frame.
		myFrame.setLocation(960 - myFrame.getWidth(), 540 - myFrame.getHeight());
		myFrame.setVisible(true);
	}
}