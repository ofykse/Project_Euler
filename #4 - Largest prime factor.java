import java.util.*;
import java.lang.Math;

class Untitled {
	public static void main(String[] args) {
		
	long number = 600851475143L;	
	int max = 0;
	
	for(int i = 2; i < Math.sqrt(number); i++) {
		if (number % i == 0 && isPrime(i)) {
			max = i;
		}
	}

	System.out.println("Largest primefactor of the number " + number 		+ " is " + max );

	}
	
	private static boolean isPrime(int num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
	return true;
	}
}