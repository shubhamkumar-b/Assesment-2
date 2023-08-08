package test2Question4;

public class BinaryTree implements DigitalTree {
	
	int sun;
	int energy;
	String name;
	
	public BinaryTree(int n) {
		this.sun = n;
	}

	public BinaryTree() {
		// TODO Auto-generated constructor stub
	}

	public void absorbSunlight(int h) {
		// TODO Auto-generated method stub
		this.energy = 2*sun;
		
	}

	public void getTreeDetails() {
		// TODO Auto-generated method stub
		System.out.println("Binary Tree emits:" + "4" + " energy.");
		
	}

}
