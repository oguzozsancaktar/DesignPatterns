package creationalDesignPatterns.Factory.Factory;

import creationalDesignPatterns.Factory.Model.Ship;
import creationalDesignPatterns.Factory.Model.Transport;

public class SeaLogistics extends Logistics{

	@Override
	public Transport createTransport() {
		return new Ship();
	}
}
