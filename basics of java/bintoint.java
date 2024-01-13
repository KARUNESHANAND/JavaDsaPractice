import java.util.*;

public class bintoint {
    
    public static void ConvertBinInt(int binNumb) {
        int myNum = binNumb;
        int pow = 0;
        int decimalNumb = 0;
        while (binNumb>0) {
            int lastDigit = binNumb%10;
            decimalNumb = decimalNumb + (lastDigit *(int) Math.pow(2, pow));
            pow++;
            binNumb = binNumb/10;
        }
        System.out.println(myNum + " binary number changes to decimal " + decimalNumb);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binNumb = sc.nextInt();
        ConvertBinInt(binNumb);
    }    
}
