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
import creationalDesignPatterns.Factory.Factory.Logistics;
import creationalDesignPatterns.Factory.Factory.RoadLogistics;
import creationalDesignPatterns.Factory.Factory.SeaLogistics;
import creationalDesignPatterns.Factory.Model.LogisticType;
import creationalDesignPatterns.Prototype.Factory.BundledShapeCache;
import creationalDesignPatterns.Prototype.Model.Circle;
import creationalDesignPatterns.Prototype.Model.Shape;

public class Main {

	private static Logistics logistic;
	
	
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

	static void factory() {
		
		LogisticType logisticType = LogisticType.Sea;
		
		if(logisticType == logisticType.Road) {
			logistic = new RoadLogistics();
		}else {
			logistic = new SeaLogistics();
		}
		
		logistic.planDelivery();
	}
	
	static void prototype() {
		Circle circle = new Circle();
		circle.x = 5;
		circle.y = 10;
		circle.radius = 15;
		circle.color = "red";
		
		Circle anotherCircle = (Circle) circle.clone();
		
		if(circle != anotherCircle) {
			System.out.println("Circles are different!");
		}
		
		if(circle.equals(anotherCircle)) {
			System.out.println("Circles are equals!");
		}
	}
	
	static void prototype2() {
		BundledShapeCache cache = new BundledShapeCache();
		
		Shape rectangle = cache.get("Medium blue rectangle");
		Shape anotherRectangle = cache.get("Medium blue rectangle");
		
		if(rectangle != anotherRectangle) {
			System.out.println("Rectangles are different!");
		}
		
		if(rectangle.equals(anotherRectangle)) {
			System.out.println("Rectangles are equals!");
		}
		
	}
	
	public static void main(String[] args) {
		abstractFactory();
		builder();
		factory();
		prototype();
		prototype2();
	}

}
