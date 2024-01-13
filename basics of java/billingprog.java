import java.util.*;
public class billingprog {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of pen : ");
        float pencost = sc.nextFloat();
        System.out.println("Enter the cost of pencil : ");
        float pencilcost = sc.nextFloat();
        System.out.println("Enter the cost of eraser : ");
        float erasercost = sc.nextFloat();
        double bill =  ((pencost + pencilcost + erasercost)*0.18 + (pencost + pencilcost + erasercost)); 
        System.out.println("The bill for the total items are : " + bill);
        
    }
}