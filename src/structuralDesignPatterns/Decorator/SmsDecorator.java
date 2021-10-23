package structuralDesignPatterns.Decorator;

public class SmsDecorator implements Notifier{
	
	public void send() {
		System.out.println("SMS Notification!");
	}
	
}
