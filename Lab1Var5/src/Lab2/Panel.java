package Lab2;


import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
	Ship Ship = new Ship();
	
	public void paint(Graphics g) {
		super.paint(g);
		Ship.DrawShip(g);
	}
}
