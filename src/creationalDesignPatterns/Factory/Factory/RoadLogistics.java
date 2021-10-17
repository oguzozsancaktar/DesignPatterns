package creationalDesignPatterns.Factory.Factory;

import creationalDesignPatterns.Factory.Model.Transport;
import creationalDesignPatterns.Factory.Model.Truck;

public class RoadLogistics extends Logistics {

	@Override
	public Transport createTransport() {
		return new Truck();
	}
}
