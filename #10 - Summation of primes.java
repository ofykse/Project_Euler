class Untitled {
	public static void main(String[] args) {
		
		
		long sum = 2;
		int limit = 2000000;
		
		for (int i = 1; i <= limit; i += 2) {
			if(isPrime(i)) {
				sum += i;
				System.out.println(i);
				System.out.println("Sum so far: " + sum);
			}
		}
		
		System.out.println("Sum of all primes below " + limit +" is " + sum);
		
	}
	
	// Skal bli 142913828922...
	
	private static boolean isPrime(int num) {
		if (num < 2) return false;
		for (int i = 3; i * i <= num; i += 2) {
			if (num % i == 0) return false;
		}
		return true;
	}
}