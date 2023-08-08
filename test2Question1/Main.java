package test2Question1;

import java.util.Scanner;

public class Main extends MyCalculator{

	public Main(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z= new Scanner(System.in);
		int n = z.nextInt();
		new MyCalculator(n);

	}

}
