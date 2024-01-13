import java.util.*;
public class factorialfunt {
    public static long factorial(long n) {
        long newval=1;
        for(long i=1; i<=n; i++) {
            newval = newval * i;
        }
        return newval;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long factorial = factorial(n);
        System.out.println("The factorial of the number " + n + " is : " + factorial);
    }
}
