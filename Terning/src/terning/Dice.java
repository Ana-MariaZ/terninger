package terning;

public class Dice {
	// roll the dice and return the value (1-6)
	public int roll() {
		float d1=(float)Math.random();     // 0-1
		float d2=d1*5;                     // 0-5
		int d3=Math.round(d2);             // 0-5 integer
		return d3 + 1;                     // 1-6		
	}
	
	// roll the dice n times and print the values
	public void rollMultiple(int n) {
		for (int i=1; i<n; i++) {
			System.out.print("Du har sl�et" +  roll() + " ");
			
		}		
	}
}
