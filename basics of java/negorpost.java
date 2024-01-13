import java.util.*;
public class negorpost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        Double numb = sc.nextDouble();
        if(numb < 0) {
            System.out.println("The number is negative.");
        }
        else {
            System.out.println("The number is positive.");
        }
    }
    
}
