import java.util.Scanner;
public class taxicharge {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Taxi Number: ");
        String taxino=sc.next();
        System.out.println("Enter the distance travelled");
        int distance=sc.nextInt();
        System.out.println("Taxi Number: "+taxino);
        System.out.println("Distance Travelled: "+distance);
        if (distance<=5){
            System.out.println("Amount: 100");
        } else if (distance<=15) {
            System.out.println("Amount: "+distance*10);
        } else if (distance<=25) {
            System.out.println("Amount: "+ distance*8);
        }else{
            System.out.println("Amount: "+distance*5);
        }
    }
}
