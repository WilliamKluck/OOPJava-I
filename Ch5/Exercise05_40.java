
public class Exercise05_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int heads = 0;
		int tails = 0;
		for (int i=0; i<1000000; i++) {
			int coinflip = (int) (Math.random() * 2);
			if(coinflip == 0) {	
			heads++;
			}
			else {
				tails++;
			}
		}
		System.out.printf("There were %d heads and %d tails", heads, tails);
	
	}

}
