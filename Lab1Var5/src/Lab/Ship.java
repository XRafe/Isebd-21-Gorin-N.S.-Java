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

   		 if (FormShip.DrawShip) {
           	 g.setColor(Color.GREEN);
                g.fillRect(_startPosX + 80, _startPosY - 6, 120, 40);
                g.setColor(MainColor);
                g.fillRect(_startPosX + 90, _startPosY - 26, 90, 20);
                g.setColor(Color.RED);
                g.fillRect(_startPosX + 110, _startPosY - 56, 30, 30);
                g.setColor(Color.GREEN);
                g.drawLine(_startPosX + 80, _startPosY + 30, _startPosX + 30, _startPosY - 30);
                while (yline < 35)
                {
                    g.drawLine(_startPosX + 80, _startPosY + yline, _startPosX + 30, _startPosY - 30);

                    g.drawLine(_startPosX + 200, _startPosY + yline, _startPosX + 250, _startPosY - 30);
                    yline++;
                }

                g.drawLine(_startPosX + 200, _startPosY + 30, _startPosX + 250, _startPosY - 30);

   		 }
            

               
   		
   	
            
   	}

     }
    
    
	

