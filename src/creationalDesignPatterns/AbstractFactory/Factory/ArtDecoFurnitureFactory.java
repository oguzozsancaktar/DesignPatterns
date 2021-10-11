package creationalDesignPatterns.AbstractFactory.Factory;

import creationalDesignPatterns.AbstractFactory.Model.Chair.ArtDecoChair;
import creationalDesignPatterns.AbstractFactory.Model.Chair.Chair;
import creationalDesignPatterns.AbstractFactory.Model.Sofa.ArtDecoSofa;
import creationalDesignPatterns.AbstractFactory.Model.Sofa.Sofa;

public class ArtDecoFurnitureFactory extends FurnitureFactory {

	@Override
	public Chair createChair() {
		return new ArtDecoChair();
	}

	@Override
	public Sofa createSofa() {
		return new ArtDecoSofa();
	}

}
