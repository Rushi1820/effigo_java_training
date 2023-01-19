package interfaces;

import java.awt.Color;
import java.awt.Frame;

public class one {

	public static void main(String args[]) {
		// Creating the instance of Frame 
		Frame fr = new Frame();
		fr.setSize(1000, 1500);
		fr.setTitle("This is my First AWT example");
		fr.setVisible(true);
		fr.setBackground(Color.green);
	}
}
