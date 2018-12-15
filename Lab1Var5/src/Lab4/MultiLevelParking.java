package Lab4;

import java.util.ArrayList;

public class MultiLevelParking {
	ArrayList<Parking<ITransport>> hangarStages;
	private final int countPlaces = 12;
	public MultiLevelParking(int countStages, int pictureWidth, int pictureHeight)
	{
		hangarStages = new ArrayList<Parking<ITransport>>();
		for (int i = 0; i < countStages; ++i)
		{
			hangarStages.add(new Parking<ITransport>(countPlaces, pictureWidth, pictureHeight));
		}
	}
	public Parking<ITransport> get(int ind)
	{
		if (ind > -1 && ind < hangarStages.size())
		{
			return hangarStages.get(ind);
		}
		return null;
	}
}
