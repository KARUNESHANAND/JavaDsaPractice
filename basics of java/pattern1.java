import java.util.*;
public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines of stars you would like to print in increasing order: ");
        int n = sc.nextInt();
        for(int line=0 ; line<n ; line++){
            for(int star = 0; star<=line;star++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
