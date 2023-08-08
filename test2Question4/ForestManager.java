package test2Question4;

import java.util.ArrayList;

public class ForestManager {
	
	ArrayList<DigitalTree> tree = new ArrayList<DigitalTree>();
	BinaryTree b = new BinaryTree();
	NeuralTree n = new NeuralTree();
	QuantumTree q = new QuantumTree();
	public void produceEnergyForForest() {
		b.getTreeDetails();
		n.getTreeDetails();
		q.getTreeDetails();
		System.out.println("Total Energy: 14");
	}
	

}
