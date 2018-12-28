package Lab;

import java.awt.Color;
import java.awt.Graphics;

public class Ship extends Vehicle {

	protected final int shipWidth = 240;

	protected final int shipHeight = 60;

	public Ship() {

	}

	public Ship(int maxSpeed, float weight, Color mainColor) {
		MaxSpeed = maxSpeed;
		Weight = weight;
		MainColor = mainColor;
	}

	public void SetPosition(int x, int y, int width, int height) {
		_startPosX = x;
		_startPosY = y;
		_pictureWidth = width;
		_pictureHeight = height;
	}

	public void MoveTransport(Direction direction) {
		float step = MaxSpeed * 100 / Weight;
		switch (direction) {
		// вправо
		case Right:
			if (_startPosX + step < _pictureWidth - shipWidth) {
				_startPosX += step;
			}
			break;
		// влево
		case Left:
			if (_startPosX - step > 0) {
				_startPosX -= step;
			}
			break;
		// вверх
		case Up:
			if (_startPosY - step > 0) {
				_startPosY -= step;
			}
			break;
		// вниз
		case Down:
			if (_startPosY + step < _pictureHeight - shipHeight) {
				_startPosY += step;
			}
			break;
		}
	}

	public void DrawShip(Graphics g) {

		int yline = -5;

		g.setColor(Color.GREEN);
		g.fillRect(_startPosX + 40, _startPosY + 19, 120, 40);
		g.setColor(MainColor);
		g.fillRect(_startPosX + 50, _startPosY - 1, 90, 20);
		g.setColor(Color.RED);
		g.fillRect(_startPosX + 70, _startPosY - 31, 30, 30);
		g.setColor(Color.GREEN);
		while (yline < 35) {
			g.drawLine(_startPosX + 40, _startPosY + yline + 25, _startPosX - 10, _startPosY - 5);

			g.drawLine(_startPosX + 160, _startPosY + yline + 25, _startPosX + 210, _startPosY - 5);
			yline++;
		}

		g.drawLine(_startPosX + 160, _startPosY + 55, _startPosX + 210, _startPosY - 5);

	}

}
