package Lab;

import java.awt.Color;
import java.awt.Graphics;

public class WaterCar extends Ship {

	public Color DopColor;

	public boolean Wheel;

	public boolean Decoreation;

	public boolean Whistle;

	public WaterCar() {

	}

	public WaterCar(int maxSpeed, float weight, Color mainColor, Color dopColor, boolean wheel, boolean decoreation,
			boolean whistle) {
		super(maxSpeed, weight, mainColor);
		DopColor = dopColor;
		Wheel = wheel;
		Decoreation = decoreation;
		Whistle = whistle;
	}

	public void DrawShip(Graphics g) {

		int xline = 0;
		int yline = 0;

		super.DrawShip(g);

		if (Decoreation) {
			while (xline < 80) {
				g.setColor(Color.GREEN);
				g.drawLine(_startPosX + 60 + xline, _startPosY + 5, _startPosX + 40 + xline, _startPosY + 50);
				xline += 5;

			}
		}

		g.setColor(DopColor);

		if (Whistle) {
			while (yline < 35) {
				g.drawLine(_startPosX + 130, _startPosY + 10, _startPosX + 170, _startPosY - 10 + yline);
				yline += 1;

			}
		}
		if (Wheel) {

			g.setColor(DopColor);
			g.fillOval(_startPosX + 30, _startPosY + 15, 60, 60);
		}

	}
}
