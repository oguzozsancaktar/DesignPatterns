package creationalDesignPatterns.AbstractFactory.Model.Chair;

public class ArtDecoChair implements Chair {

	@Override
	public void sitOn() {
		System.out.println("Sit on Art Deco Chair");
	}
}
