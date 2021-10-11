package creationalDesignPatterns.AbstractFactory.Factory;

import creationalDesignPatterns.AbstractFactory.Model.FurnitureType;
import creationalDesignPatterns.AbstractFactory.Model.Chair.Chair;
import creationalDesignPatterns.AbstractFactory.Model.Sofa.Sofa;

public abstract class FurnitureFactory {

	private static final ArtDecoFurnitureFactory ART_DECO_FACTORY = new ArtDecoFurnitureFactory();
	private static final ModernFurnitureFactory MODERN_FACTORY = new ModernFurnitureFactory();
	private static final VictorianFurnitureFactory VICTORIAN_FACTORY = new VictorianFurnitureFactory();

	public static FurnitureFactory getFactory(FurnitureType type) {
		
		FurnitureFactory factory = null;
		
		switch (type) {
			case ART_DECO: {
				factory = ART_DECO_FACTORY;
				break;
			}
			case MODERN: {
				factory = MODERN_FACTORY;
				break;
			}
			case VICTORIAN: {
				factory = VICTORIAN_FACTORY;
				break;
			}
		}
		
		return factory;
	}

	public abstract Chair createChair();

	public abstract Sofa createSofa();
}
