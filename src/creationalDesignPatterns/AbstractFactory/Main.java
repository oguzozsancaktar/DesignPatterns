package creationalDesignPatterns.AbstractFactory;

import creationalDesignPatterns.AbstractFactory.Factory.FurnitureFactory;
import creationalDesignPatterns.AbstractFactory.Model.FurnitureType;
import creationalDesignPatterns.AbstractFactory.Model.Chair.Chair;
import creationalDesignPatterns.AbstractFactory.Model.Sofa.Sofa;

public class Main {

	public static void main(String[] args) {
		
		FurnitureFactory factory = FurnitureFactory.getFactory(FurnitureType.MODERN);
		
		Chair chair = factory.createChair();
		Sofa sofa = factory.createSofa();
		
		chair.sitOn();
		sofa.nap();

	}

}
