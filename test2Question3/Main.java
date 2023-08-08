package test2Question3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Sandwich> sand = new ArrayList<Sandwich>();
	static ArrayList<Salad> sal = new ArrayList<Salad>();
	static ArrayList<Drink> dri = new ArrayList<Drink>();
	static ArrayList<Trio> tri = new ArrayList<Trio>();
	static Scanner z = new Scanner(System.in);
	
	public static void registerSand(ArrayList<Sandwich> sand) {
		System.out.println("Sandwich menu: ");
		System.out.println("Enter no. of Sandwich you want to register: ");
		int n = z.nextInt();
		for(int i = 0; i<n;i++) {
			System.out.println("Enter name of Sandwich");
			String name = z.next();
			System.out.println("Enter Price");
			double p = z.nextDouble();
			sand.add(new Sandwich(name, p));
			System.out.println("Sandwich: " + sand.get(i).getName() + " gets registered.");	
		}
	}
	
	public static void registerSal(ArrayList<Salad> sal) {
		System.out.println("Salad menu: ");
		System.out.println("Enter no. of Salad you want to register: ");
		int n = z.nextInt();
		for(int i = 0; i<n;i++) {
			System.out.println("Enter name of Salad");
			String name = z.next();
			System.out.println("Enter Price");
			double p = z.nextDouble();
			sal.add(new Salad(name, p));
			System.out.println("Salad: " + sal.get(i).getName() + " gets registered.");	
		}
	}
	
	public static void registerDri(ArrayList<Drink> dri) {
		System.out.println("Drink menu: ");
		System.out.println("Enter no. of Drink you want to register: ");
		int n = z.nextInt();
		for(int i = 0; i<n;i++) {
			System.out.println("Enter name of Drink");
			String name = z.next();
			System.out.println("Enter Price");
			double p = z.nextDouble();
			dri.add(new Drink(name, p));
			System.out.println("Drink: " + dri.get(i).getName() + " gets registered.");	
		}
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Register Sandwich:");
		registerSand(sand);
		System.out.println("Register Salad:");
		registerSal(sal);
		System.out.println("Register Drink:");
		registerDri(dri);
		System.out.println("=========Sandwich Menu=========");
		for(int i=0;i<sand.size();i++) {
			sand.get(i).display();
		}
		System.out.println("=========Salad Menu=========");
		for(int i=0;i<sal.size();i++) {
			sal.get(i).display();
		}
		System.out.println("=========Drink Menu=========");
		for(int i=0;i<dri.size();i++) {
			dri.get(i).display();
		}
		System.out.println("Enter your Trio");
		String s = z.next();
		new Trio(s, sand, sal, dri);
		Trio t = new Trio();
		System.out.println("=========Trio Details=========");
		t.display();
	}

}
