import java.util.*;
public class optimisedprime {
    public static boolean isPrime(int n){
        boolean isPrime = true;
        if (n==2) {
            isPrime = true;
        }
        else {
            for(int i = 2; i<=Math.sqrt(n); i++){
                if(n%i==0) {
                    isPrime = false;
                }
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number you would like to check if it is prime or not : ");
        int n = sc.nextInt();
        boolean check = isPrime(n);
        if(check == true) {
            System.out.println(n + " is a prime number.");
        }
        else{
            System.out.println(n + " is not a prime number." );
        }

    }
}
