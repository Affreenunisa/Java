import java.util.Scanner;

public class mark1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sub1=sc.nextInt();
        int sub2=sc.nextInt();
        int sub3=sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 =sc.nextInt();
        int total=sub1+sub2+sub3+sub4+sub5;
        System.out.println("Aggregate"+total);
        float percentage=total/5;
        System.out.println("Percentage"+percentage+"%");
    }
}
