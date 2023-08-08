package test2Question3;

public class Salad implements MenuItem{
	
	String typeName;
	double price;
	public Salad(String name, double p) {
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
