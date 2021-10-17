package creationalDesignPatterns.Factory.Factory;

import creationalDesignPatterns.Factory.Model.Transport;

public abstract class Logistics {

	public void planDelivery() {	
		Transport transport = createTransport();	
		transport.deliver();
	}

	public abstract Transport createTransport();
}
