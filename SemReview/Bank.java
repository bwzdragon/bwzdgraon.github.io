
import java.util.Scanner;
import java.text.NumberFormat;
public class Bank
{
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        NumberFormat f=NumberFormat.getCurrencyInstance();
        Account account;
        int type = 0;
        
        System.out.print("Would you like to open an account? (y/n): ");
        String ans = s.nextLine().toLowerCase();
        if(ans.equals("y")) {
            System.out.print("Do you want a basic or premium account? (1 or 2): ");
            type = s.nextInt();
            
            while(type != 1 && type != 2) {
                System.out.println("Invalid choice");
                System.out.print("Do you want a basic or premium account? (1 or 2): ");
                type = s.nextInt();
            }
        
        
        System.out.println("First name: ");
        String fName = s.next();
        
        System.out.println("Last name: ");
        String lName = s.next();
        int accNum = (int)(Math.random() * (90000) + 10000);
        System.out.println ("Your account number is " + accNum); 
        
        System.out.print("Starting balance: ");
        double bal = s.nextDouble();
        
        if (type ==2) {
            while ( bal < 500) {
                System.out.println("Balance has to be atleast 500 for premium accounts");
                System.out.print("Starting balance: ");
         bal = s.nextDouble();
            }
            bal = bal;
        }
        
        account = new Account(fName, lName, accNum, bal);
        System.out.println ("Your account info");
        System.out.println("Name: " + account.getName() + "\nAccount Number: " + accNum + "\nBalance: $" + f.format(account.getBalance())); 
        int rating = account.takeSurvey();
        System.out.print("Rating: " + rating + " ");
        for(int i=0; i<rating; i++) {
            System.out.print("*");
        }
    }
        if(ans.equals("n")) {
             System.out.println("First name: ");
        String fName = s.next();
        
        System.out.println("Last name: ");
        String lName = s.next();
            
            System.out.println("Account Number: ");
            int accNum = s.nextInt();
            System.out.println("Account Balance: ");
            Double bal = s.nextDouble();
            System.out.println("Account Type: (B/P) ");
             String atype = s.next();
             double rate = 0.0;
             double min = 0;
             if (atype.equals("B")) rate = 2 ;
             else if (atype.equals("P")) {rate = 4 ;min = 500;}
             
             account = new Account(fName, lName, accNum, bal);
             System.out.println("Would you like to 1: Deposit, 2: Withdraw, 3: Add Interest, or 4: Exit. ");
            int choice = s.nextInt();    
            
            while(choice < 0 || choice > 4) {
                System.out.println("Invalid choice");
                System.out.println("Would you like to 1: Deposit, 2: Withdraw, 3: Add Interest, or 4: Exit. ");
                choice = s.nextInt();
            }
            while(choice != 4) {                
                
                if(choice == 1) {
                    System.out.print("How much: ");
                    account.deposit(s.nextDouble());
                } else if(choice == 2) {
                    if (atype.equals("B")) {
                    System.out.print("How much: ");
                    account.withdraw(s.nextDouble());
                } else {
                    System.out.print("How much: ");
                    account.withdraw(s.nextDouble(), 500.0);
                }
                } else if(choice == 3) {
                    
                    account.interest(rate);
                   
                }
                
                System.out.println("Would you like to 1: Deposit, 2: Withdraw, 3: Add Interest, or 4: Exit. ");
                choice = s.nextInt();
            }           
            System.out.println ("Your account info");
        System.out.println("Name: " + account.getName() + "\nAccount Number: " + accNum + "\nBalance: $" + f.format(account.getBalance())); 
            int rating = account.takeSurvey();
        System.out.print("Rating: " + rating + " ");
        for(int i=0; i<rating; i++) {
            System.out.print("*");
        }
            
        }
        
       
    }
    
}
