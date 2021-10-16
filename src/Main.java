import creationalDesignPatterns.AbstractFactory.Factory.FurnitureFactory;
import creationalDesignPatterns.AbstractFactory.Model.FurnitureType;
import creationalDesignPatterns.AbstractFactory.Model.Chair.Chair;
import creationalDesignPatterns.AbstractFactory.Model.Sofa.Sofa;
import creationalDesignPatterns.Builder.Builder.Director;
import creationalDesignPatterns.Builder.Builder.DuplexHouseBuilder;
import creationalDesignPatterns.Builder.Builder.TriplexHouseBuilder;
import creationalDesignPatterns.Builder.Model.DuplexHouse;
import creationalDesignPatterns.Builder.Model.HouseType;
import creationalDesignPatterns.Builder.Model.TriplexHouse;

public class Main {

	static void abstractFactory() {
		FurnitureFactory factory = FurnitureFactory.getFactory(FurnitureType.MODERN);

		Chair chair = factory.createChair();
		Sofa sofa = factory.createSofa();

		chair.sitOn();
		sofa.nap();
	}

	static void builder() {
		Director director = new Director();
		TriplexHouseBuilder triplexBuilder = new TriplexHouseBuilder();

		director.constructStoneHouse(triplexBuilder);
		TriplexHouse triplexHouse = triplexBuilder.getProduct();

		System.out.println(triplexHouse.toString());

		DuplexHouseBuilder duplexBuilder = new DuplexHouseBuilder();
		duplexBuilder.setType(HouseType.Golden).setDoors(6).setRooms(5).setWindows(7).setGarage(false).setGarden(false)
				.setSwimPool(false);
		DuplexHouse duplexHouse = duplexBuilder.getProduct();

		System.out.println(duplexHouse.toString());
	}

	public static void main(String[] args) {
		abstractFactory();
		builder();
	}

}
