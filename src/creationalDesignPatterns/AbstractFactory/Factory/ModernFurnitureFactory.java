package creationalDesignPatterns.AbstractFactory.Factory;

import creationalDesignPatterns.AbstractFactory.Model.Chair.Chair;
import creationalDesignPatterns.AbstractFactory.Model.Chair.ModernChair;
import creationalDesignPatterns.AbstractFactory.Model.Sofa.ModernSofa;
import creationalDesignPatterns.AbstractFactory.Model.Sofa.Sofa;

public class ModernFurnitureFactory extends FurnitureFactory{

	@Override
	public Chair createChair() {
		return new ModernChair();
	}

	@Override
	public Sofa createSofa() {
		return new ModernSofa();
	}

}
