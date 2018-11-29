package Lab2;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Vehicle implements ITransport
{

    protected int _startPosX;


    protected int _startPosY;
    /// <summary>
    /// Ширина окна отрисовки
    /// </summary>
    protected int _pictureWidth;
    //Высота окна отрисовки
    protected int _pictureHeight;


    public static int MaxSpeed;
    void getWheel(int MaxSpeed) {Vehicle.MaxSpeed=MaxSpeed;} 
    int setMaxSpeed() {return Vehicle.MaxSpeed;} 

    public static float Weight;
    void getWheel(float Weight) {Vehicle.Weight=Weight;} 
    float setWeight() {return Vehicle.Weight;} 

    public static Color MainColor;
    void getMainColor(Color MainColor) {Vehicle.MainColor=MainColor;} 
    Color setMainColor() {return Vehicle.MainColor;}
    
    
    public void SetPosition(int x, int y, int width, int height)
    {
        _startPosX = x;
        _startPosY = y;
        _pictureWidth = width;
        _pictureHeight = height;
    }
    public abstract void DrawShip(Graphics g);
    public abstract void MoveTransport(Direction direction);
}
