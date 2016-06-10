class Untitled {
	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		int c = 0;
		int sum = 1000;
		
		
		for (a = 1; a < sum/3; a++) {
			for (b = a; b < sum/2; b++) {
				c = sum - a - b;
				
				if(a*a + b*b == c*c) {
					System.out.println("a = " + a);
					System.out.println("b = " + b);
					System.out.println("c = " + c);
					System.out.println("a * b * c = " + (a * b * c));
				}
			}
		}
		
		
	}
}