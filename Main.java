import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Price = sc.nextInt();
        double Cgst= Price*0.09;
        double sgst=Price*0.11;
        double Totaltax=Cgst+sgst;
        double  TotalPricetoapay = Totaltax+Price;
        System.out.println(TotalPricetoapay);
    }


}