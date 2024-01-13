import java.util.*;
public class passfailternary {
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks : ");
        double marks = sc.nextDouble();
        String result = ((marks>=33)) ? "pass":"fail";
        System.out.println(result);
    }
}
