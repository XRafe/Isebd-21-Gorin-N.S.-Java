package Lab;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashMap;

public class Parking<T extends ITransport> {

	public HashMap<Integer, T> _places;

	public int _maxCount;

	protected int PictureWidth;

	void getPictureWidth(int PictureWidth) {
		this.PictureWidth = PictureWidth;
	}

	int setPictureWidth() {
		return this.PictureWidth;
	}

	protected int PictureHeight;

	void getPictureHeight(int PictureHeight) {
		this.PictureHeight = PictureHeight;
	}

	int setPictureHeight() {
		return this.PictureHeight;
	}

	private int _placeSizeWidth = 260;
	private int _placeSizeHeight = 120;

	public Parking(int sizes, int pictureWidth, int pictureHeight) {
		_maxCount = sizes;
		_places = new HashMap<Integer, T>();
		PictureWidth = pictureWidth;
		PictureHeight = pictureHeight;
	}

	public int addoperator(T ship) {
		if (_places.size() == _maxCount) {
			return -1;
		}
		for (int i = 0; i < _maxCount; i++) {
			if (CheckFreePlace(i)) {
				_places.put(i, ship);
				_places.get(i).SetPosition(5 + i / 4 * _placeSizeWidth + 5, i % 4 * _placeSizeHeight + 60, PictureWidth,
						PictureHeight);
				return i;
			}
		}
		return -1;

	}

	public T removeoperator(int index) {
		if (!CheckFreePlace(index)) {
			T ship = _places.get(index);
			_places.remove(index);
			return ship;
		}
		return null;

	}

	private boolean CheckFreePlace(int index) {
		return !_places.containsKey(index);
	}

	public void Draw(Graphics g) {
		DrawMarking(g);
		for (int i = 0; i < _places.size(); i++) {
			if (!CheckFreePlace(i)) {
				_places.get(i).DrawShip(g);
			}
		}
	}

	public void DrawMarking(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawRect(0, 0, (_places.size() / 5) * _placeSizeWidth, 480);
		for (int i = 0; i < _places.size() / 5; i++) {

			for (int j = 0; j < 6; ++j) {
				g.setColor(Color.BLUE);
				g.drawLine(i * _placeSizeWidth, j * _placeSizeHeight, i * _placeSizeWidth + 110, j * _placeSizeHeight);
			}
			g.drawLine(i * _placeSizeWidth, 0, i * _placeSizeWidth, 400);
		}
	}
}
