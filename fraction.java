import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.*;
public class fraction {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double num1=sc.nextDouble();
        double num2=sc.nextDouble();
        double frac1=num1-(int)num1;

        double frac2=num2-(int)num2;
        double answer= frac1 + frac2;
        System.out.printf("%.4f",answer);
    }
}
