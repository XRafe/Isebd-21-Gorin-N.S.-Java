package Lab1;

import java.awt.Color;
import java.awt.Graphics;






    public class Ship
    {
        
        static int _startPosX;


        static int _startPosY;


        private static int _pictureWidth;


        private static int _pictureHeight;


        private final static int shipWidth = 240;


        private final static int shipHeight = 60;


        public static int MaxSpeed;
        void getMaxSpeed(int MaxSpeed) {Ship.MaxSpeed=MaxSpeed;} 
        int setMaxSpeed() {return Ship.MaxSpeed;}

        public static float Weight;
        void getWeight(float Weight) {Ship.Weight=Weight;} 
        float setWeight() {return Ship.Weight;}


        public static Color MainColor;
        void getMainColor(Color MainColor) {Ship.MainColor=MainColor;} 
        Color setMainColor() {return Ship.MainColor;}


        public Color DopColor;
        void getDopColor(Color DopColor) {this.DopColor=DopColor;} 
        Color setDopColor() {return this.DopColor;}

        public Ship()
        {
         
        }
        
        public Ship(int maxSpeed, float weight, Color mainColor, Color dopColor)
        {
            MaxSpeed = maxSpeed;
            Weight = weight;
            MainColor = mainColor;
            DopColor = dopColor;
        }


        public void SetPosition(int x, int y, int width, int height)
        {
            _startPosX = x;
            _startPosY = y;
            _pictureWidth = width;
            _pictureHeight = height;
        }


        public static void MoveTransport(Direction direction)
        {
            float step = MaxSpeed * 100 / Weight;
            switch (direction)
            {
                // вправо
                case Right:
                    if (_startPosX + step < _pictureWidth - shipWidth)
                    {
                        _startPosX += step;
                    }
                    break;
                //влево
                case Left:
                    if (_startPosX - step > 0)
                    {
                        _startPosX -= step;
                    }
                    break;
                //вверх
                case Up:
                    if (_startPosY - step > 0)
                    {
                        _startPosY -= step;
                    }
                    break;
                //вниз
                case Down:
                    if (_startPosY + step < _pictureHeight - shipHeight)
                    {
                        _startPosY += step;
                    }
                    break;
            }
            
            
        }
        
    	public void DrawShip(Graphics g) {

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
    
    
	

