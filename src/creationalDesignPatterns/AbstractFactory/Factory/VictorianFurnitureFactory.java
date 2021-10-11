package creationalDesignPatterns.AbstractFactory.Factory;

import creationalDesignPatterns.AbstractFactory.Model.Chair.Chair;
import creationalDesignPatterns.AbstractFactory.Model.Chair.VictorianChair;
import creationalDesignPatterns.AbstractFactory.Model.Sofa.Sofa;
import creationalDesignPatterns.AbstractFactory.Model.Sofa.VicorianSofa;

public class VictorianFurnitureFactory extends FurnitureFactory{

	@Override
	public Chair createChair() {
		return new VictorianChair();
	}

	@Override
	public Sofa createSofa() {
		return new VicorianSofa();
	}

}
