import java.util.*;
public class sumofdigit {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int digit=sc.nextInt();
        int sum=0;
        while(digit>0){
            sum+=digit%10;
            digit/=10;
        }
        System.out.println(sum);
    }
}
