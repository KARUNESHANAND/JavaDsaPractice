import java.util.*;
public class reverseofnumb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse : ");
        int numb = sc.nextInt();
        int lengthofnumb = (int)(Math.log10(numb)+ 1);
        // System.out.println(lengthofnumb);
        for(int i=0; i<lengthofnumb ; i++) {
            int div = numb%10;
            int revnumb = (int)(div*Math.pow(10, lengthofnumb - i-1));
            
            System.out.println(revnumb);
        }
    }
}
