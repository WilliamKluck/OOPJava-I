//Random class
import java.util.Random;
public class Exercise09_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random(1000);
		
		for(int i = 0; i < 100; i++) {
			System.out.print(random.nextInt(100));
		}
	}

}
