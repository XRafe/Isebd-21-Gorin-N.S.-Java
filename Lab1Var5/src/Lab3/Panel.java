package Lab3;


import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
	WaterCar WaterCar = new WaterCar();
	
	public void paint(Graphics g) {
		super.paint(g);
		WaterCar.DrawShip(g);
	}
}
