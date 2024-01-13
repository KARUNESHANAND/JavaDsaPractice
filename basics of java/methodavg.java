import java.math.BigDecimal;
import java.util.*;
public class methodavg {
    public static double calculateAvg(float a , float b , float c){
        double avg = (a+b+c)/3;

        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers to calculate the average : ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        double average = (double)(calculateAvg(a, b, c));
        System.out.print("The average of three numbers is : " );
        System.out.format("%.2f", average);
    }
}
