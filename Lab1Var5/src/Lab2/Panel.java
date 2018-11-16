package Lab1;


import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
	
	
	public void paint(Graphics g) {
		super.paint(g);

		 int yline = -5;


		 if (FormShip.DrawShip) {
        	 g.setColor(Color.GREEN);
             g.fillRect(Ship._startPosX + 80, Ship._startPosY - 6, 120, 40);
             g.setColor(Ship.MainColor);
             g.fillRect(Ship._startPosX + 90, Ship._startPosY - 26, 90, 20);
             g.setColor(Color.RED);
             g.fillRect(Ship._startPosX + 110, Ship._startPosY - 56, 30, 30);
             g.setColor(Color.GREEN);
             g.drawLine(Ship._startPosX + 80, Ship._startPosY + 30, Ship._startPosX + 30, Ship._startPosY - 30);
             while (yline < 35)
             {
                 g.drawLine(Ship._startPosX + 80, Ship._startPosY + yline, Ship._startPosX + 30, Ship._startPosY - 30);

                 g.drawLine(Ship._startPosX + 200, Ship._startPosY + yline, Ship._startPosX + 250, Ship._startPosY - 30);
                 yline++;
             }

             g.drawLine(Ship._startPosX + 200, Ship._startPosY + 30, Ship._startPosX + 250, Ship._startPosY - 30);

		 }
         

            
		
	
         
	}
}
