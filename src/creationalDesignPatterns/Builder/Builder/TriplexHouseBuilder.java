package creationalDesignPatterns.Builder.Builder;

import creationalDesignPatterns.Builder.Model.HouseType;
import creationalDesignPatterns.Builder.Model.TriplexHouse;

public class TriplexHouseBuilder implements HouseBuilder {

	private TriplexHouse house;

	public TriplexHouseBuilder() {
		this.reset();
	}

	@Override
	public void reset() {
		this.house = new TriplexHouse();
	}

	@Override
	public HouseBuilder setWindows(int windows) {
		this.house.setWindows(windows);
		return this;
	}

	@Override
	public HouseBuilder setDoors(int doors) {
		this.house.setDoors(doors);
		return this;
	}

	@Override
	public HouseBuilder setRooms(int rooms) {
		this.house.setRooms(rooms);
		return this;
	}

	@Override
	public HouseBuilder setGarage(boolean hasGarage) {
		this.house.setHasGarage(hasGarage);
		return this;
	}

	@Override
	public HouseBuilder setSwimPool(boolean hasSwimPool) {
		this.house.setHasSwimPool(hasSwimPool);
		return this;
	}

	@Override
	public HouseBuilder setGarden(boolean hasGarden) {
		this.house.setHasGarden(hasGarden);
		return this;
	}

	@Override
	public HouseBuilder setType(HouseType type) {
		this.house.setType(type);
		return this;
	}

	public TriplexHouse getProduct() {
		return this.house;
	}
}
