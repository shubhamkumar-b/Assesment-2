package test2Question3;

public class Drink implements MenuItem {
	
	String typeName;
	double price;
	public Drink(String name, double p) {
		this.typeName = name;
		this.price = p;
	}
	
	public String getName() {
		return typeName;
	}
	public double getPrice() {
		return price;
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("The " + typeName + " costs " + price);
		
	}

}
