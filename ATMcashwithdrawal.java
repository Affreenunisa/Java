import java.util.Scanner;

public class ATMcashwithdrawal {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter hundred notes:");
        int hundrednotes=sc.nextInt();
        System.out.println("enter fivehundred notes:");
        int fivehundred=sc.nextInt();
        System.out.println("enter Thousand notes:");
        int thousand= sc.nextInt();
        int totalamt=(hundrednotes*100)+(fivehundred*500)+(thousand*1000);
        System.out.println(totalamt);

    }
}
