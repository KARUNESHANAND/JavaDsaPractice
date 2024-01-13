import java.util.*;
public class binomcoeff {
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
        long r = sc.nextLong();
        long factorial = factorial(n);
        long factorial2 = factorial(r);
        long factorial3 = factorial(n-r);
        long binomcoeff = factorial / (factorial2 * factorial3);
        System.out.println("The binomial coeff of the number " + n +" and "+ r +" is : " + binomcoeff);
    }
}
