package Lab;

import java.awt.Graphics;

import javax.swing.JPanel;

public class PanelTakeShip extends JPanel {

	ITransport WaterCar;
	
	public void setShip(ITransport WaterCar2) {
		WaterCar=WaterCar2;
	}

	public void paint(Graphics g) {
		super.paint(g);
		if (WaterCar != null) {
			WaterCar.DrawShip(g);
		}
	}


}
