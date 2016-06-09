import java.math.*;

class Untitled {
	public static void main(String[] args) {
		
		
		long sumOfTheSqaure = 0;
		long squareOfTheSum = 0;
		long sum = 0;
		
		
		//Sum of the square
		for (int i = 0; i <=100; i++) {
			sumOfTheSqaure += (long)Math.pow(i,2);
		}
		
		//Square of the sum
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		
		squareOfTheSum = (long)Math.pow(sum,2);
		
		// Square of the sum - sum of the square
		System.out.println(squareOfTheSum - sumOfTheSqaure);		
		
	}
}