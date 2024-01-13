import java.util.*;
public class multfunc2 {

    public static int multiply(int a , int b){
        int mult =  a * b;
        return mult;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mult = multiply(a,b);
        System.out.print("The multiplication of " + a + " and " + b + " is  : " );
        System.out.print(mult);
    }
}
