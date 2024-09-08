//import stuff here
import java.util.Scanner;
//Your code here

public class Program7{
    public static void main(String[] args) {
        double bucksOld = 0.0;
        double klevinOld = 0.0;
        double nicklesOld = 0.0;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.print("Enter schrute-bucks: ");
        bucksOld = myScanner.nextInt();
        System.out.print("\nEnter klevins: ");
        klevinOld = myScanner.nextInt();
        System.out.print("\nEnter stanley-nickels: ");
        nicklesOld = myScanner.nextInt();
        
        double bucksNew = 0;
        final double klevinNew = klevinOld/20.0;
        final double nickelsNew = nicklesOld/240.0;
        
        bucksNew = (double)Math.round((nickelsNew + klevinNew + bucksOld)*100)/100;
        
        System.out.println("\nDecimal schrute-bucks = $" + bucksNew);
    }
}
//Paste console output below:
/*

Enter schrute-bucks: 7

Enter klevins: 17

Enter stanley-nickels: 9

Decimal schrute-bucks = $7.89

*/
