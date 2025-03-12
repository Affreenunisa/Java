import java.util.Scanner;

public class days {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int days=sc.nextInt();
        int hours=days*24;
        System.out.println("Hours "+hours);
        int minutes= hours*60;
        System.out.println("Minutes "+minutes);
        int seconds=minutes*3600;
        System.out.println("Seconds "+seconds);
    }
}
