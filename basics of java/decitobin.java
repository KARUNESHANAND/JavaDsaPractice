import java.util.*;

public class decitobin {
    public static void DecimaltoBinary(int decinumb){
        double mynumb = decinumb;
        int pow = 0;
        int binNum = 0;

        while(decinumb > 0) {
            int rem = decinumb%2;
            binNum = binNum + (rem*(int)Math.pow(10, pow));
            pow++;
            decinumb=decinumb/2;
        }
        System.out.println("binary form of " + mynumb + " = " + binNum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number to convert to binary : ");
        int deciNumb = sc.nextInt();
        DecimaltoBinary(deciNumb);

    }
}