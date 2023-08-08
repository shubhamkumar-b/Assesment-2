package test2Question4;

public class NeuralTree implements DigitalTree {
	
	int sun;
	int energy;
	
	public NeuralTree(int n) {
		this.sun = n;
	}

	public NeuralTree() {
		// TODO Auto-generated constructor stub
	}

	public void absorbSunlight(int h) {
		// TODO Auto-generated method stub
		this.energy = 2*sun;
		
	}

	public void getTreeDetails() {
		// TODO Auto-generated method stub
		System.out.println("Neural Tree emits:" + "4" + " energy.");
		
	}

}
