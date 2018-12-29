package Lab;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

	public static ITransport ship;

	void setAir(ITransport transport) {

		ship = transport;

	}

	@Override

	public void paint(Graphics g) {

		super.paint(g);

		if (ship != null) {

			ship.DrawShip(g);

		}
	}

}
