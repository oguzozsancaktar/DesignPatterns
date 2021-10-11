
import creationalDesignPatterns.AbstractFactory.Factory.FurnitureFactory;
import creationalDesignPatterns.AbstractFactory.Model.FurnitureType;
import creationalDesignPatterns.AbstractFactory.Model.Chair.Chair;
import creationalDesignPatterns.AbstractFactory.Model.Sofa.Sofa;

public class Main {

	static void abstractFactory() {
		FurnitureFactory factory = FurnitureFactory.getFactory(FurnitureType.MODERN);

		Chair chair = factory.createChair();
		Sofa sofa = factory.createSofa();

		chair.sitOn();
		sofa.nap();
	}

	public static void main(String[] args) {
		abstractFactory();
	}

}