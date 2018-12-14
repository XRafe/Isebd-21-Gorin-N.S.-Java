package Lab3;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Parking<T extends ITransport> {

	public ArrayList<T> _places;

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
		_places = new ArrayList<T>();
		PictureWidth = pictureWidth;
		PictureHeight = pictureHeight;
		for (int i = 0; i < sizes; i++) {
			_places.add(null);
		}
	}

	public int addoperator(T ship) {
		for (int i = 0; i < _places.size(); i++) {
			if (CheckFreePlace(i)) {
				_places.add(i, ship);
				_places.get(i).SetPosition(5 + i / 4 * _placeSizeWidth + 5, i % 4 * _placeSizeHeight + 60, PictureWidth, PictureHeight);
				return i;
			}
		}
		return -1;
	}

	public T removeoperator(int index) {
		if (index < 0 || index > _places.size()) {
			return null;
		}
		if (!CheckFreePlace(index)) {
			T ship = _places.get(index);
			_places.set(index, null);
			return ship;
		}
		return null;
	}

	private boolean CheckFreePlace(int index) {
		return _places.get(index) == null;
	}

	public void Draw(Graphics g) {
		DrawMarking(g);
		for (int i = 0; i < _places.size(); i++) {
			if (!CheckFreePlace(i)) {
				_places.get(i).DrawShip(g);
			}
		}
	}

	private void DrawMarking(Graphics g) {
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
