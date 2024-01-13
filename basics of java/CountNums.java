//Code to calculate the occurence of a particular digit in the number 
import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        System.out.print("Enter the number whose occurence you need to find the number of times: ");
        int m = in.nextInt();
        int count = 0;
        while (n > 0) {
            int remainder = n % 10;
            if (remainder == m) {
                count++;
            }
            n = n / 10;
        }
        System.out.print("THE NUMBER OF OCCURENCERENCE OF THAT DIGIT IS : ");
        System.out.print(count);
    }
    
}
