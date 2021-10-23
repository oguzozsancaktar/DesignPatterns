package structuralDesignPatterns.Decorator;

public class SlackDecorator extends BaseDecorator{

	public SlackDecorator(Notifier notifier) {
		super(notifier);
	}
	
	public void send() {
		super.send();
		System.out.println("Slack Notification!");
	}
}
