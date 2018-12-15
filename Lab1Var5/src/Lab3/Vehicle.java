package Lab3;

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
    protected static int _pictureHeight;


    public int MaxSpeed;
    void getWheel(int MaxSpeed) {this.MaxSpeed=MaxSpeed;} 
    int setMaxSpeed() {return MaxSpeed;} 

    public float Weight;
    void getWheel(float Weight) {this.Weight=Weight;} 
    float setWeight() {return Weight;} 

    public Color MainColor;
    void getMainColor(Color MainColor) {this.MainColor=MainColor;} 
    Color setMainColor() {return MainColor;}
    
    
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
