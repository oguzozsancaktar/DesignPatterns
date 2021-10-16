package creationalDesignPatterns.Builder.Builder;

import creationalDesignPatterns.Builder.Model.HouseType;

public interface HouseBuilder {
	
	void reset();
	HouseBuilder setWindows(int windows);
	HouseBuilder setDoors(int doors);
	HouseBuilder setRooms(int rooms);
	HouseBuilder setGarage(boolean hasGarage);
	HouseBuilder setSwimPool(boolean hasSwimPool);
	HouseBuilder setGarden(boolean hasGarden);
	HouseBuilder setType(HouseType type);
	
}
