import java.util.Scanner;

public class unitdigit {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        int digit = number%10;
        System.out.println(digit);
    }
}
