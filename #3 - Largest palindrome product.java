import java.lang.StringBuffer;
import javax.sound.midi.*;

class Untitled {
	public static void main(String[] args) {
		
		int temp = 0;
		String product = "";
		int largest = 0;
		
		
		for (int i = 100; i <= 999; i++) {
			for (int j = 100; j <= 999; j++) {
				
				temp = i * j;
				product = String.valueOf(temp);
				
				StringBuffer reversed = new StringBuffer(product);
				reversed.reverse();
				
				if(product.equals(reversed.toString())) {
					if(Integer.parseInt(product) > largest) {
						largest = Integer.parseInt(product);
					}
				}
			}
		}
		System.out.println("This is the largest palindrome: " + largest);
		
	}
}