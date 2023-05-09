
public class Exercise05_06{
    public static void main(String[] args){
        System.out.printf("%-10s %8s    |    %-8s %10s%n", "Miles", "Kilometers", "Kilometers", "Miles");
            
        int kilometers = 20;
        for (int i = 1; i < 11; i++){
            System.out.printf("%-12d %8.3f    |    %-10d %10.3f%n", i, i * 1.609, kilometers, kilometers * 0.6215); 
            kilometers += 5;
        }    
    }
}