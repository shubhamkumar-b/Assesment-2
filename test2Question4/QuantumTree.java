package test2Question4;

public class QuantumTree {
	
	int sun;
	int energy;
	
	public QuantumTree(int n) {
		this.sun = n;
	}

	public QuantumTree() {
		// TODO Auto-generated constructor stub
	}

	public void absorbSunlight(int h) {
		// TODO Auto-generated method stub
		this.energy = 2*sun;
		
	}

	public void getTreeDetails() {
		// TODO Auto-generated method stub
		System.out.println("Quantum Tree emits:" + "6" + " energy.");
		
	}

}
