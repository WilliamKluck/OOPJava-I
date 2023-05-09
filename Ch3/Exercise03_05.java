import java.util.Scanner;

public class Exercise03_05{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter todays date: ");
        int date = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int period = input.nextInt();

        int futureDate = (date + period) % 7;
        String dayOfWeek = "";

        switch(date){
            case 0: dayOfWeek = "Sunday";
                    break;
            case 1: dayOfWeek = "Monday";
                    break; 
            case 2: dayOfWeek = "Tuesday";
                    break;
            case 3: dayOfWeek = "Wednesday";
                    break;
            case 4: dayOfWeek = "Thursday";
                   break;
            case 5: dayOfWeek = "Friday";
                    break;
            case 6: dayOfWeek = "Saturday";
                    break;
        }

        if (futureDate == 0){
            System.out.print("Todays is " + dayOfWeek + " and the future day is Sunday");
        }else if(futureDate == 1){
            System.out.print("Todays is " + dayOfWeek + " and the future day is Monday");
        }else if(futureDate == 2){
            System.out.print("Todays is " + dayOfWeek + " and the future day is Tuesday");
        }else if(futureDate == 3){
            System.out.print("Todays is " + dayOfWeek + " and the future day is Wednesday");
        }else if(futureDate == 4){
            System.out.print("Todays is " + dayOfWeek + " and the future day is Thursday");
        }else if(futureDate == 5){
            System.out.print("Todays is " + dayOfWeek + " and the future day is Friday");
        }else if(futureDate == 6){
            System.out.print("Todays is " + dayOfWeek + " and the future day is Saturday");
        }
        input.close();
    }
}
