class Untitled {
	public static void main(String[] args) {
			
			int sum = 2;
			int first = 1;
			int second = 2;
			int third = 0;
			
			while (third < 4000000) {
				third = first + second;
				if(third % 2 == 0) {
					sum += third;
				}
			first = second;
			second = third;
			}

			System.out.println(sum);
	}
}