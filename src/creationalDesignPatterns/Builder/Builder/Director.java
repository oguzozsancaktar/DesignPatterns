package creationalDesignPatterns.Builder.Builder;

import creationalDesignPatterns.Builder.Model.HouseType;

public class Director {

	public void constructWoodenHouse(HouseBuilder builder) {
		builder.setType(HouseType.Wooden)
		.setRooms(5)
		.setDoors(5)
		.setWindows(12)
		.setGarage(true)
		.setGarden(true)
		.setSwimPool(false);
	}
	
	public void constructStoneHouse(HouseBuilder builder) {
		builder.setType(HouseType.Stone)
		.setRooms(5)
		.setDoors(5)
		.setWindows(12)
		.setGarage(true)
		.setGarden(true)
		.setSwimPool(false);
	}
	
	public void constructGolderHouse(HouseBuilder builder) {
		builder.setType(HouseType.Golden)
		.setRooms(5)
		.setDoors(5)
		.setWindows(12)
		.setGarage(true)
		.setGarden(true)
		.setSwimPool(false);
	}
}
