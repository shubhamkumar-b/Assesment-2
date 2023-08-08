package test2Question1;

class MyCalculator implements AdvancedArithmetic {

	int sum = 0;

	public int divisor_sum(int n) {
		if(n>1000)
			return 0;
		else {
			for(int i=1;i<=n;i++) {
				if(n%i == 0) {
					sum+=i;
				}
			}
			return sum;
		}
	}
	
	public MyCalculator(int x){
		divisor_sum(x);
		displayResult();
	}
	
	public void displayResult() {
		System.out.println("Sum of all divisors are = " + sum);
	}

}
