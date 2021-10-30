
import java.util.*; //for ArrayList and Scanner
import java.text.*; //for NumberFormat
public class GroceryStore
{
    private static Scanner s=new Scanner(System.in);
    private static NumberFormat curr=NumberFormat.getCurrencyInstance();
    public static void main(String args[])
    {

        FoodList f=new FoodList(); //a new empty FoodList
        int choice=0;
        while(choice!=4) //program continues until check out
        {  
            System.out.println("Please enter your choice: ");
            System.out.println("1. Add more items to your list.\n2. Remove items from your list.\n"
                + "3. Print your list.\n4. Check out\n\n");
            choice=s.nextInt();
            while(choice<1 || choice>4)
            {
                System.out.println("Error.  Try again.");  
                choice=s.nextInt();
            }
            if(choice==1)
            {
                addItems(f);
            }
            else if(choice==2)
            {
                removeItems(f); 
            }
            else if(choice==3)
            {
                printList(f);
            }
            else
            {
                checkOut(f);
            }
        }
    }

    public static void printList(FoodList f)
    {
        System.out.println("Your grocery list in order of healthiness:\n" + f);

    }

    public static void removeItems(FoodList f)
    {
        ArrayList<Integer> list = new ArrayList();

        int n = 0;
        while (n==0) 
        {
        System.out.println("Enter a number from (1-" + f.getFood().size() + ") to remove food");
        int i = s.nextInt();
        if ((i< 1 || i> f.getFood().size())&& i != 0) System.out.println("Invalid entry");
        else if (i >= 1 && i <= f.getFood().size()) { 
        list.add(i-1);
        }
        else {
        n= 1;
        }
        }
        f.removeItems(list);

         
        
    }

    public static void addItems(FoodList f)
    {
        System.out.println("How many foods would you like to add? ");
        int n = s.nextInt();
        for(int i=0; i<n; i++) {
            f.addItem();
        }
    }

    public static void checkOut(FoodList f)
    {
        printList(f);
        System.out.println("your total cost is $" + f.totalCost() );
    }
}
