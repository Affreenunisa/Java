import java.util.*;
public class ifexam{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt= 0;
        for (int i = 1; i <= n; i++) {
            // If n is divisible by i
            // without any remainder.
            if (n % i == 0) {
                // Increment the counter.
                cnt = cnt + 1;
            }
        }
        if(cnt==2){
            System.out.println("prime");
        }
        else{
            System.out.println("not");
        }
        
    }
}
