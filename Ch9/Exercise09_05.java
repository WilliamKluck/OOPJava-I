//GregorianCalendar
import java.util.GregorianCalendar;
public class Exercise09_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar calendar = new GregorianCalendar();
		
		System.out.println(calendar.get(GregorianCalendar.MONTH) + "/" + 
							calendar.get(GregorianCalendar.DAY_OF_MONTH) + "/" + 
							calendar.get(GregorianCalendar.YEAR));
		calendar.setTimeInMillis(1234567898765L);
		System.out.println(GregorianCalendar.MONTH + "/" + 
				GregorianCalendar.DAY_OF_MONTH + "/" + 
				GregorianCalendar.YEAR);
	}

}
