import java.util.*;
public class printlargestoftwo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        double number_1 = sc.nextDouble();
        System.out.println("Enter the second number : ");
        double number_2 = sc.nextDouble();
        if(number_1 > number_2){
            System.out.println(number_1 + " is greater than " + number_2);
        }
        if(number_1 == number_2){
            System.out.println(number_1 + " is equal to " + number_2);
        }
        else {
            System.out.println(number_2 + " is greater than " + number_1);
        }
    
    }
}
