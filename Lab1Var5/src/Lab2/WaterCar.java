package Lab2;

import java.awt.Color;
import java.awt.Graphics;

public class WaterCar extends Ship {
	
	
    public Color DopColor;

    public boolean Wheel;
    
    public boolean Decoreation;
    

    public boolean Whistle;

    public WaterCar() 
    {

    }

    public WaterCar(int maxSpeed, float weight, Color mainColor, Color dopColor, boolean
   wheel, boolean decoreation, boolean whistle) 
    {
    	super (maxSpeed, weight, mainColor);
        DopColor = dopColor;
        Wheel = wheel;
        Decoreation = decoreation;
        Whistle = whistle;
    }
    
    public void DrawShip(Graphics g)
    {

        int xline = 0;
        int yline = 0;

        super.DrawShip(g);

        while (xline < 80)
        {
        	g.setColor(Color.GREEN);
            g.drawLine(_startPosX + 100 + xline, _startPosY - 20, _startPosX + 80 + xline, _startPosY + 25);
            xline += 5;

        }
        if (Decoreation)
        {

        }

    	g.setColor(DopColor);
        while (yline < 35)
        {
            g.drawLine(_startPosX + 170, _startPosY - 15, _startPosX + 210, _startPosY - 35 + yline);
            yline += 1;

        }
        if (Whistle)
        {

        }
    	g.setColor(DopColor);
        g.fillOval(_startPosX + 70, _startPosY - 10, 60, 60);
        if (Wheel)
        {

        }


    }
}

