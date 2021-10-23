package structuralDesignPatterns.Decorator;

public class FacebookDecorator extends BaseDecorator{

	public FacebookDecorator(Notifier notifier) {
		super(notifier);
	}
	
	public void send() {
		super.send();
		System.out.println("Facebook Notification!");
	}
}
