package structuralDesignPatterns.Decorator;

public class BaseDecorator implements Notifier {

	private Notifier notifier;
	
	public BaseDecorator(Notifier notifier) {
		this.notifier = notifier;
	}
	
	@Override
	public void send() {
		this.notifier.send();
	}

}
