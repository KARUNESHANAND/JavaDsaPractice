import java.util.*;
import java.util.Scanner;

public class sumofoddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int sumeven=0;
        int sumodd=0;
        do {
            System.out.println("Enter the number : ");
            int n = sc.nextInt();
            if(n%2==0) {
                sumeven+=n;
            }
            else {
                sumodd+=n;
            }
            System.out.print("Do you want to continue? Press 1 for yes or 0 for no");
            choice = sc.nextInt();
        }
        
        while(true);
        System.out.println("Sum of even numbers is " + sumeven);
        System.out.println("Sum of odd numbers is " + sumodd);
    
    
    }
}
