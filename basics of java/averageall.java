import java.util.*;
public class averageall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number : ");
        Double numb1 = sc.nextDouble();
        System.out.println("Input the second number : ");
        Double numb2 = sc.nextDouble();
        System.out.println("Input the third number : ");
        Double numb3 = sc.nextDouble();
        Double avg = (numb1 + numb2 + numb3)/3;
        System.out.println("The average of the three numbers is : " + avg);
    }
    
}
