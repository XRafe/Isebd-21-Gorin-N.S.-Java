package Lab3;

import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelParking extends JPanel {
	Parking<ITransport> parking;


	public void setParking(Parking<ITransport> parking2) {
		parking = parking2;
	}


	public void paint(Graphics g) {
		super.paint(g);
		parking.Draw(g);
	}



}
