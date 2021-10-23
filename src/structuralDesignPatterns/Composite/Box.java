package structuralDesignPatterns.Composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements Item {

	private List<Item> itemList;
	
	public Box() {
		this.itemList = new ArrayList<Item>();
	}

	public void addItem(Item item) {
		itemList.add(item);
	}
	
	public void removeItem(Item item) {
		itemList.remove(item);
	}
	
	public List<Item> getItemList(){
		return this.itemList;
	}
	
	@Override
	public double getPrice() {
		
		double price = 0;
		
		for (Item item : itemList) {
			price += item.getPrice();
		}
		
		return price;
	}

}
