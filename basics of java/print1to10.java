import java.util.*;

public class print1to10 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you to print to from 1");
        int numb = sc.nextInt();
        int i = 1;
        while(i <= numb) {
            System.out.println(i);
            i++;
        }
    }    
}
