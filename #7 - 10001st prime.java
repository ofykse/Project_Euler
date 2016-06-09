import javax.swing.tree.*;

class Untitled {
	public static void main(String[] args) {
		
		int numberOfPrimes = 1;
		int primeNumber = 0;
		
		for (int i = 1; numberOfPrimes <= 10000; i +=2) {
			if(isPrime(i)) {
				numberOfPrimes++;
				primeNumber = i;
			}
		}
		System.out.println(primeNumber);

	}
	
	private static boolean isPrime(int num) {
		if (num < 2) return false;
		if (num == 2) return true;
		if (num % 2 == 0) return false;
		for (int i = 3; i * i <= num; i += 2)
		    if (num % i == 0) return false;
		return true;
	}
}