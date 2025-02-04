import java.util.*;

public class sum {
    public static void factorial(int n) {
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial: " + fact);
    }
    public static void prime(int n){
        int cnt = 0;
        for (int i =1;i<=n;i++){
            if (n%i==0){
                cnt +=1;
            }
        }
        if (cnt==2){
            System.out.println("prime");

        }
        else{

            System.out.println("not prime");
        }
    }
    public static void even(int n){
        if(n%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void table(int n){
        for (int i=1;i<=10;i++){
            System.out.println(n+" x "+i+"= "+i*n);
        }
    }
    public static void average(int a,int b,int c){
        int sum= a+b+c;
        int ovrt =sum/3;
        System.out.println(ovrt);

    }
    public static void odd(int n){
        int sum =0;
        for(int i = 1;i<=n;i++){
        if(i%2!=0){
            sum+=i;   
        }
    }
    System.out.println(sum);
    }
    public static void infinite(){
         do{
            System.out.println("this is a loop");
         }
         while(true);
    }
    public static void  count(){
        int positive = 0, negative = 0, zeros = 0;
        System.out.println("Press 1 to continue & 0 to stop");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
 
 
        while(input == 1) {
            System.out.println("Enter your number : ");
            int number = sc.nextInt();
            if(number > 0) {
                positive++;
            } else if(number < 0) {
                negative++;
            } else {
                zeros++;
            }
 
 
            System.out.println("Press 1 to continue & 0 to stop");
            input = sc.nextInt();
        }
 
 
        System.out.println("Positives : "+ positive);
        System.out.println("Negatives : "+ negative);
        System.out.println("Zeros : "+ zeros);
    }   
 
 
    public static void power(int x, int n){
        int res =1;
        for(int i=0;i<n;i++){
            res = res*x;
            
        }
        System.out.println(res);
    }
    public static void fibonacci(int n){
        int a =0;
        int b =1;
        int sum=a+b;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            
            System.out.println(c + " ");
            sum+=c;
            a = b;
            b = c;     
        }
        System.out.println("sum"+sum);
    }
    public static int gcd(int a,int b){
        while(b!=0){
            int temp = b;
            b=a%b;
         a=temp;
        }
        return a;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for a: ");
        int a = sc.nextInt();
        System.out.println("Enter a number for b: ");
        int b = sc.nextInt();

       System.out.println(gcd(a,b));
        sc.close();
    }
}
