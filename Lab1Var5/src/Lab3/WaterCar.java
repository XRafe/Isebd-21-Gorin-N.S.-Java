package Lab2;

import java.awt.Color;
import java.awt.Graphics;

public class WaterCar extends Ship {
	
	
    public static Color DopColor;
    void getDopColor(Color DopColor) {WaterCar.DopColor=DopColor;} 
    Color setDopColor() {return WaterCar.DopColor;} 

    
    public static boolean Wheel;
    void getWheel(boolean Wheel) {WaterCar.Wheel=Wheel;} 
    boolean setWheel() {return WaterCar.Wheel;} 

    
    public static boolean Decoreation;
    void getDecoreation(boolean Decoreation) {WaterCar.Decoreation=Decoreation;} 
    boolean setDecoreation() {return WaterCar.Decoreation;} 


    public static boolean Whistle;
    void getWhistle(boolean Whistle) {WaterCar.Whistle=Whistle;} 
    boolean setWhistle() {return WaterCar.Whistle;} 

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


        if (Decoreation)
        {
            while (xline < 80)
            {
            	g.setColor(Color.GREEN);
                g.drawLine(_startPosX + 100 + xline, _startPosY - 20, _startPosX + 80 + xline, _startPosY + 25);
                xline += 5;

            }
        }

    	g.setColor(DopColor);

        if (Whistle)
        {
            while (yline < 35)
            {
                g.drawLine(_startPosX + 170, _startPosY - 15, _startPosX + 210, _startPosY - 35 + yline);
                yline += 1;

            }
        }
        if (Wheel)
        {

        	g.setColor(DopColor);
            g.fillOval(_startPosX + 70, _startPosY - 10, 60, 60);
        }


    }
}

