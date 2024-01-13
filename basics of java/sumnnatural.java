import java.util.*;
public class sumnnatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n to generate the sum till that number : ");
        int numb = sc.nextInt();
        int i = 0;
        int newnumb1 = 0;
        while(i <= numb) {
            newnumb1 +=  i;
            i++;
            
        }
        System.out.println(newnumb1);
    }
}
