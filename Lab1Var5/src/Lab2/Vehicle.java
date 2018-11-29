package Lab2;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Vehicle implements ITransport
{


    protected float _startPosX;


    protected float _startPosY;
    /// <summary>
    /// Ширина окна отрисовки
    /// </summary>
    protected int _pictureWidth;
    //Высота окна отрисовки
    protected int _pictureHeight;


    public int MaxSpeed;


    public float Weight;


    public Color MainColor;
    
    
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
