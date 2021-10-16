package creationalDesignPatterns.Builder.Model;

public class TriplexHouse {

	private int windows;
	private int doors;
	private int rooms;
	private boolean hasGarage;
	private boolean hasSwimPool;
	private boolean hasGarden;
	private HouseType type;
	
	public TriplexHouse() {
		
	}

	public TriplexHouse(int windows, int doors, int rooms, boolean hasGarage, boolean hasSwimPool, boolean hasGarden,
			HouseType type) {
		super();
		this.windows = windows;
		this.doors = doors;
		this.rooms = rooms;
		this.hasGarage = hasGarage;
		this.hasSwimPool = hasSwimPool;
		this.hasGarden = hasGarden;
		this.type = type;
	}

	public int getWindows() {
		return windows;
	}

	public void setWindows(int windows) {
		this.windows = windows;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public boolean isHasGarage() {
		return hasGarage;
	}

	public void setHasGarage(boolean hasGarage) {
		this.hasGarage = hasGarage;
	}

	public boolean isHasSwimPool() {
		return hasSwimPool;
	}

	public void setHasSwimPool(boolean hasSwimPool) {
		this.hasSwimPool = hasSwimPool;
	}

	public boolean isHasGarden() {
		return hasGarden;
	}

	public void setHasGarden(boolean hasGarden) {
		this.hasGarden = hasGarden;
	}

	public HouseType getType() {
		return type;
	}

	public void setType(HouseType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "TriplexHouse [windows=" + windows + ", doors=" + doors + ", rooms=" + rooms + ", hasGarage=" + hasGarage
				+ ", hasSwimPool=" + hasSwimPool + ", hasGarden=" + hasGarden + ", type=" + type + "]";
	}

}
