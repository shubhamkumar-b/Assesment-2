package test2Question3;

import java.util.ArrayList;

public class Trio implements MenuItem {
	
	String sandwichName;
	String saladName;
	String drinkName;
	double sandwichPrice;
	double saladPrice;
	double drinkPrice;
	String sentence;
	
	ArrayList<String> d = new ArrayList<String>();
	
	
	public Trio(String s, ArrayList<Sandwich> sand, ArrayList<Salad> sal, ArrayList<Drink> dri) {
		String k[] = s.split("/");
		String lk[] = k[2].split(" ");
		String last = "";
		for(int i=0;i<lk.length;i++) {
			if(lk[i].equals("Trio")) {
				continue;
			}else {
				last+=lk[i] + " ";
			}
		}
		for(int i=0;i<2;i++) {
			d.add(k[i]);
		}
		d.add(last);
		this.sandwichName = k[0];
		this.saladName = k[1];
		this.drinkName = k[2];
		for(int i=0;i<sand.size();i++) {
			if(sand.get(i).getName().equals(sandwichName)) {
				this.sandwichPrice = sand.get(i).getPrice();
			}
		}
		for(int i=0;i<sal.size();i++) {
			if(sal.get(i).getName().equals(saladName)) {
				this.saladPrice = sal.get(i).getPrice();
			}
		}
		for(int i=0;i<dri.size();i++) {
			if(dri.get(i).getName().equals(drinkName)) {
				this.drinkPrice = dri.get(i).getPrice();
			}
		}
	}

	public Trio() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("The different dishes are : ");
		System.out.println("Sandwich: " + "Bread" + ", Price: " + "1.00" + " ;Salad: " + "Onion" + ", Price: " + "2.00" + " ;Drink: " + "Wine" + ", Price: " + "2.00");
		
	}

}
