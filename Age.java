import java.util.Scanner;

public class Age {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int date= sc.nextInt();
        int month= sc.nextInt();
        int year= sc.nextInt();
        if(year<2025 && date<31 && month<12){
            int age=2025-year;
            System.out.println(age);
        }
        else{
            System.out.println("Invalid data");
        }
    }
}
