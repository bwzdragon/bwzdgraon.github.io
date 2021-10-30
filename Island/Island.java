
import java.util.Scanner;

public class Island
{
    private static Scanner s=new Scanner(System.in); 
    public static void main(String[] args) 
    {

        System.out.println ("Give names");
        String n1 = s.nextLine(); 
        String n2 = s.nextLine(); 
        String n3 = s.nextLine(); 
        String j1 = getRandJob();
        String j2 = getRandJob();
        String j3 = getRandJob();

        System.out.println ("You are stuck on island with your friends");
        System.out.println (n1 + " the " + j1);
        System.out.println (n2 +" the " +j2);
        System.out.println (n3 +" the "+ j3);

        boolean f;
        boolean c;

        if(j1 == "farmer" || j2 == "farmer" || j3 == "farmer") {
            System.out.println("You will have food.");
            f = true;
        } else {
            System.out.println("You will starve to death.");
            f = false;
        }

        if(j1 == "carpenter" || j2 == "carpenter" || j3 == "carpenter") {
            System.out.println("You will have shelter.");
            c = true;
        } else {
            System.out.println("You will not have shelter and will die.");
            c = false;
        }
        
        if(!f || !c) 
            System.out.println("You will not survive, you will not move on to part 2.");
        else if(f && c) {
            System.out.println("You have found a magical cave that contains a boat.");
            if (!puzzle1(n1))
            System.out.println("You will not survive");
            else {
            System.out.println("You will move on to puzzle 2");
                if (!puzzle2(n2)) 
                System.out.println("You will not survive");
                else {
                System.out.println("You will move on to puzzle 3");
                    if (!puzzle3(n3))
                    System.out.println("You will not survive");
                    else 
                    System.out.println("You have survived, good job");
                }
            }
        }
        

    }
    public static Boolean puzzle1(String str)
        {

        System.out.println (str + " Give a word that begins and ends with the first letter of your name");
        String p1 = s.nextLine();  

        return (str.substring(0,1).equalsIgnoreCase(p1.substring(0,1)) && str.substring(0,1).equalsIgnoreCase(p1.substring(p1.length() - 1)) );
    }
    public static Boolean puzzle2(String str)
    {

        System.out.println (str +" Enter a number that is in the ones digit of the number that is equal to the square of the length of your name. ");
        int a = s.nextInt(); 
        return (Math.pow(str.length(),2) %10 == a);

    }

    public static Boolean puzzle3(String str)
    {

        System.out.println (str + " If your name contains the letter A, enter a number (rounded to the nearest integer) that is the square root of twice the length of your name. If not, enter the cube root of twice the length of your name rounded to the nearest integer. ");
        int a = s.nextInt(); 

         if(str.indexOf('a') != -1 || str.indexOf('A') != -1) 
            {if(a == (int)(Math.sqrt(str.length() * 2) + 0.5))
                return true;
            return false;}
         else 
           { if(a == (int)(Math.cbrt(str.length() * 2) + 0.5))
                return true;
            return false;}

    }

    public static String getRandJob() 
    {
        String a = "farmer";
        String b = "carpenter";
        String c = "balloon blower";
        String d = "human calculator";
        int rand = (int)(Math.random() * 4) + 1;
        if (rand ==1)
            return a;
        else if (rand == 2)
            return b;
        else if (rand == 3)
            return c;
        else  
            return d;

    }
}
