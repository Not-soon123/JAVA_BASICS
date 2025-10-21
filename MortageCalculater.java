// Mortage_Calculatr
import java.util.Scanner;
import java.text.NumberFormat;
public class MortageCalculater{
 public static void main(String[] arg){

    final byte MONTH_IN_YEAR = 12;
    final byte PERCENT = 100;
    
   Scanner scan = new Scanner(System.in);

   System.out.println("Principal :");
   int principal = scan.nextInt();

   System.out.println("Annual Interest Rate:");
   double annualInterst = scan.nextDouble();
   double monthlyInterst = annualInterst/MONTH_IN_YEAR/PERCENT;

   System.out.println("Period(Years) :");
   int period = scan.nextInt();
   int numberOfpayment = period*MONTH_IN_YEAR;

   
   double NUMRATER = monthlyInterst *Math.pow((1+ monthlyInterst), numberOfpayment);
   double DINOMINATER = Math.pow(1+monthlyInterst, numberOfpayment) - 1;

   double mortage = principal* (NUMRATER/DINOMINATER);

   String formatedMortage = NumberFormat.getCurrencyInstance().format(mortage);

   System.out.println("Mortage : " + formatedMortage);




 }
}