package creationalDesignPatterns.AbstractFactory.Model.Chair;

public class ModernChair implements Chair{

	@Override
	public void sitOn() {
		System.out.println("Sit on Modern Chair");
	}
}
