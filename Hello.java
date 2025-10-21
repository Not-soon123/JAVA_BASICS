
import java.util.Arrays;
import java.text.NumberFormat;
import java.util.Scanner;


//import java.util.Scanner;
public class Hello{
    public static void main(String [] arg){
   //Refferance datatypes are those use to store complex datatype
    String message = " HelloWorld!!";
    System.out.println(message.endsWith("!!"));//returns boolean
    System.out.println(message.startsWith("Heo"));//retuns boolean
    System.out.println(message.length());
    System.out.println(message.indexOf('H'));
    System.out.println(message.toLowerCase());
    System.out.println(message.trim());
    System.out.println(message.replace("l", "*"));

    //Escape sequance

    System.out.println("Hello \"Natan\" ");
    System.out.println("Hello \\ Natan \\ ");
    System.out.println("Hello\nNatan");
    System.out.println("Hello\tNatan");

    //array => to store list of the same type of iteam

    int[] array = new int[8];
    array[0] = 3;
    array[1] = 7;
    System.out.println(Arrays.toString(array));
    int [][] multipleArray = {{1,2},{3,4},{4,6}};
    System.out.println(Arrays.deepToString(multipleArray));

    final int year = 2018;//to make our variable dont changed
    int age = 56;
    System.out.println(year + age);
    System.out.println(year * age);
    System.out.println(year - age);
    System.out.println(year / age);//returns whole number
    double price1  = 2/3;// becomes 0 and the type change the value to the double 0.0
    double price = (double)2/(double)6;//2.0/6.0 = 0.333333
    System.out.println(price1);
    System.out.println(price);
    
    // casting

    byte age1 = 12;
    int age2 = 45;
    int sum = age2 + age1;//implisite casting
    System.out.println(sum);

    //byte sum2 = age1 + age2; this can't be done

    //Changing the String to the integer
    String age11 ="12";
    System.out.println(Integer.parseInt(age11));
    System.out.println(Short.parseShort(age11));
    System.out.println(Double.parseDouble(age11));
    
    //The maths class

    int nevas19 = Math.round(1.2F);
    double nevas12 = Math.ceil(1.2);
    double nevas22 = Math.floor(1.2);
    int nevas23 = Math.max(1,12);
    int nevas32 = Math.min(1 ,4);
    int neavss = (int)Math.round(Math.random()*100);
    System.out.println(neavss);
    System.out.println(nevas19);
    System.out.println(nevas12);
    System.out.println(nevas22);
    System.out.println(nevas23);
    System.out.println(nevas32);

    // Formatting Numbers

    NumberFormat currency = NumberFormat.getCurrencyInstance();
    String result = currency.format(neavss);

    System.err.println(result);

    NumberFormat priceee = NumberFormat.getPercentInstance();
    String pricee = priceee.format(0.12);

    System.err.println(pricee);

    // Reading Input
    Scanner scan = new Scanner(System.in);
    //System.out.println(scan.next());// one word only
    System.out.println(scan.nextLine());// All the lins




    }
}