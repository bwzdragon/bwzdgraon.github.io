
import java.util.Scanner;
public class QuizGrader
{
    
    
    public static void main (String[] Args) {
          int key[] = { 7,8,1,4,5,6,3,2};
          int i = (int) (Math.random() + 1.5);
          if (i == 2)  reverse( key);
          int answers[] = new int [key.length];
          fill(answers);
          System.out.println("Answer Key: ");
          print(key);
          System.out.println("Your answers: ");
          print(answers);
          
          if (isValid(answers)) {
              boolean grades [] = grade(key, answers);
              print(grades);
              System.out.println("you recieved test " + i );
              System.out.println("your score was " + score(grades) + " out of " + key.length);
            }
            else System.out.println ( " Answers are invalid you must retake test");
    }
   
    
    public static void fill(int[] n )
    {
        Scanner s = new Scanner(System.in);
        int i =  0;
                    
        while ( i < n.length) {
            System.out.println("Enter your answer for question " + (i+1));
            n[i] = s.nextInt();
            i++;
        }
        
        
    }
    public static void print( int[] i ) {
        for (int j: i) {
            System.out.print(j + " ");
        }
        System.out.println (" ");
    }
    public static void reverse ( int[] i){
        int temp[] = new int[i.length];  
        for(int j = 0; j < temp.length; j++) 
        { temp[j] = i[j];  
        } 
        for (int a = i.length-1; a > -1; a--)
        {
        i[(i.length-1) - a] = temp [a];    
        }
        
    }
    public static void print ( boolean[] b )
    {
        for (boolean j: b) {
           if (j == true) System.out.print( "O ");
           if (j == false) System.out.print("X ");
        }
        System.out.println( " ");
    }
    public static boolean duplicates( int[] i)
    {
        boolean b = false;
        for(int a: i) {
            int x = 0;
            for(int c: i) {
             
                if (a == c)  x++;  
            }
            if (x > 1) b = true;
        }
        
        return b;
    }
    public static boolean isValid(int[] i) {
        boolean b = true;
        if (duplicates(i)) b = false;
        for ( int j : i ) {
            if (j > i.length || j < 1) b = false;
        }
        return b;
    }
    
    public static boolean[] grade(int[] a, int[] b) {
        boolean[] results = new boolean[b.length];
        for (int i = 0; i < b.length; i++ )
        {
            if (a[i] == b[i]) results[i] = true;
            else results [i] = false;
            
        }
        return results;
    }
   public static int score(boolean [] b)
   {
       int i = 0;
       
       for (boolean a : b) {
           if (a) i ++;
        }
        return i ;
    }
}
