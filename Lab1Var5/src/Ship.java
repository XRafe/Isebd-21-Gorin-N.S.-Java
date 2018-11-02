
	


public enum Direction
    {
        Up,
        Down,
        Left,
        Right
    }

    /// <summary>
    /// ����� ��������� ����������
    /// </summary>
    public class Ship
    {
        /// <summary>
        /// ����� ���������� ��������� ����������
        /// </summary>
        private float _startPosX;
        /// <summary>
        /// ������ ���������� ��������� ����������
        /// </summary>
        private float _startPosY;
        /// <summary>
        /// ������ ���� ���������
        /// </summary>
        private int _pictureWidth;
        //������ ���� ���������
        private int _pictureHeight;
        /// <summary>
        /// ������ ��������� ����������
        /// </summary>
        private final int carWidth = 240;
        /// <summary>
        /// ������ ��������� ����������
        /// </summary>
        private final int carHeight = 60;
        /// <summary>
        /// ������������ ��������
        /// </summary>
        public int MaxSpeed { private set; get; }
        /// <summary>
        /// ��� ����������
        /// </summary>
        public float Weight { private set; get; }
        /// <summary>
        /// �������� ���� ������
        /// </summary>
        public Color MainColor { private set; get; }
        /// <summary>
        /// �������������� ����
        /// </summary>
        public Color DopColor { private set; get; }
        /// <summary>
        /// ������� ������� ��������� ��������
        /// </summary>
        public bool FrontSpoiler { private set; get; }
        /// <summary>
        /// ������� ������� ������� ���������
        /// </summary>
        public bool SideSpoiler { private set; get; }
        /// <summary>
        /// ������� ������� ������� ��������
        /// </summary>
        public bool BackSpoiler { private set; get; }
        /// <summary>
        /// �����������
        /// </summary>
        /// <param name="maxSpeed">������������ ��������</param>
        /// <param name="weight">��� ����������</param>
        /// <param name="mainColor">�������� ���� ������</param>
        /// <param name="dopColor">�������������� ����</param>
        /// <param name="frontSpoiler">������� ������� ��������� ��������</param>
        /// <param name="sideSpoiler">������� ������� ������� ���������</param>
        /// <param name="backSpoiler">������� ������� ������� ��������</param>
        public Ship(int maxSpeed, float weight, Color mainColor, Color dopColor, bool
       frontSpoiler, bool sideSpoiler, bool backSpoiler)
        {
            MaxSpeed = maxSpeed;
            Weight = weight;
            MainColor = mainColor;
            DopColor = dopColor;
            FrontSpoiler = frontSpoiler;
            SideSpoiler = sideSpoiler;
            BackSpoiler = backSpoiler;
        }
        /// <summary>
        /// ��������� ������� ����������
        /// </summary>
        /// <param name="x">���������� X</param>
        /// <param name="y">���������� Y</param>
        /// <param name="width">������ ��������</param>
        /// <param name="height">������ ��������</param>
        public void SetPosition(int x, int y, int width, int height)
        {
            _startPosX = x;
            _startPosY = y;
            _pictureWidth = width;
            _pictureHeight = height;
        }
        /// <summary>
        /// ��������� ����������� ����������
        /// </summary>
        /// <param name="direction">�����������</param>
        public void MoveTransport(Direction direction)
        {
            float step = MaxSpeed * 100 / Weight;
            switch (direction)
            {
                // ������
                case Direction.Right:
                    if (_startPosX + step < _pictureWidth - carWidth)
                    {
                        _startPosX += step;
                    }
                    break;
                //�����
                case Direction.Left:
                    if (_startPosX - step > 0)
                    {
                        _startPosX -= step;
                    }
                    break;
                //�����
                case Direction.Up:
                    if (_startPosY - step > 0)
                    {
                        _startPosY -= step;
                    }
                    break;
                //����
                case Direction.Down:
                    if (_startPosY + step < _pictureHeight - carHeight)
                    {
                        _startPosY += step;
                    }
                    break;
            }
        }
        /// <summary>
        /// ��������� ����������
        /// </summary>
        /// <param name="g"></param>
        public void DrawCar(Graphics g)
        {
            int yline = -5;

            Brush general = new SolidBrush(Color.Blue);
            Brush body = new SolidBrush(Color.Green);
            Brush tube = new SolidBrush(Color.Red);
            Pen pen = new Pen(Color.Green);

            if (FrontSpoiler)
            {
                g.FillRectangle(body, _startPosX + 80, _startPosY - 6, 120, 40);
                g.FillRectangle(general, _startPosX + 90, _startPosY - 26, 90, 20);
                g.FillRectangle(tube, _startPosX + 110, _startPosY - 56, 30, 30);
                g.DrawLine(pen, _startPosX + 80, _startPosY + 30, _startPosX + 30, _startPosY - 30);
                while (yline < 35)
                {
                    g.DrawLine(pen, _startPosX + 80, _startPosY + yline, _startPosX + 30, _startPosY - 30);

                    g.DrawLine(pen, _startPosX + 200, _startPosY + yline, _startPosX + 250, _startPosY - 30);
                    yline++;
                }

                g.DrawLine(pen, _startPosX + 200, _startPosY + 30, _startPosX + 250, _startPosY - 30);

               

            }
        }
    }
	

