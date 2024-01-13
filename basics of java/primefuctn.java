import java.util.*;
public class primefuctn {
    
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        if (n==2) {
            isPrime = true;
        }
        else{
            for(int i=2; i<=n-1;i++) {
            if (n%i==0) {
                isPrime = false;
                break;
            }
        }
     }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you would like to check if prime or not : ");
        int n = sc.nextInt();
        boolean result = isPrime(n);
        if(result == false) {
            System.out.println(n + " is not a prime number.");
        }
        else {
            System.out.println(n + " is a prime number.");
        }

    }
}
