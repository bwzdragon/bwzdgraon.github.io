import java.text.NumberFormat;
import java.util.Scanner;
public class Account
{
    // instance variables - replace the example below with your own
    private String fName;
    private String lName;
    private int accNum;
    private double accBal;
    NumberFormat f=NumberFormat.getCurrencyInstance();
   
    public Account(String n1, String n2, int num, double bal)
    {
        // initialise instance variables
        fName = n1;
        lName = n2;
        accNum = num;
        accBal = bal;
    }

    public int getAcctNo()
    {
        // put your code here
        return accNum;
    }
    
   public double getBalance()
    {
        // put your code here
        return accBal;
    }
    public String getName()
    {
        // put your code here
        return fName + " " + lName;
    }
    public void deposit(double d)
    {
        // put your code here
        accBal = d + accBal;
    }
    public void withdraw(double a)
    {
        // put your code here
        if (a<= accBal){
            accBal = accBal - a;
        }
        else {
            System.out.println("Insufficient funds, balance cannot go below 0");
        }
    }
    public void withdraw(double a, double b)
    {
        if ((accBal - a)>= b){
            accBal = accBal - a;
        }
        else {
            System.out.println("Insufficient funds.  You must keep a minimum balance of " +  f.format(b));
        }
    }
     public int takeSurvey() {
       Scanner s = new Scanner(System.in);
       int i;
       System.out.print("Rate your experience (1-10): ");
       i = s.nextInt();
       while(i > 10 || i < 1) {
           System.out.println("Must be between 1 and 10");
           System.out.print("Rate your experience (1-10): ");
           i = s.nextInt();
       }
       return i;
   }
    public void interest(double d) {
        double r = d;
        
        if (accBal < 1000) r= r;
        if ((accBal >= 1000) && (accBal<= 5000)) r = r + 0.5;
        if (accBal > 5000) r= r+ 0.75;
        r= r/100;
        accBal = accBal + (accBal * r);
        r= r*100;
         System.out.println ("Interest rate is " + r + "%");
    }
}
