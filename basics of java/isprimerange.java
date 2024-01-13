import java.util.*;

public class isprimerange {
    public static boolean isPrime(int numb) {
        boolean isprime = true;
        if(numb==2) {
            isprime = true;
        }
        else {
            for(int j=2; j<=Math.sqrt(numb); j++) {
                if(numb%j==0) {
                    isprime=false;
                    break;
                }
            }
        }
        return isprime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till which u would like to print the prime numbers : ");
        int n = sc.nextInt();
        for(int numb = 2; numb <= n ; numb++ ){
            boolean ifprime = isPrime(numb);
            if (ifprime == true) {
                System.out.print(numb + " ");
            }
        }
        // for(int i = 2; i<=numb; i++) {
        //     boolean check = isPrime(i);
        //     if (check == true) {
        //         System.out.println();    
        //     }
        // } 
    }   
}
