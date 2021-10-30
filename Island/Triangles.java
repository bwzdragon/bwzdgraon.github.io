

public class Triangles
{
    // instance variables - replace the example below with your own
    public static void main(String [] args)
    {
      for(int i=1; i<=10000000; i*=10) {
          System.out.println("The probability for " + i + " trials is " + calcProb(i));
        }
        
        
        
        
    }

    public static double calcProb(int t) //t = trials
    {  
        int s = 0; //s = success
        for (int i = 0; i < t ; i++ )
        {
            
            double a = Math.random();
            double b = Math.random();
 
         while(a == b || a == 0 || b == 0) {
                a = Math.random();
                b = Math.random();
            }   
            
            if(a > b ) 
            {
                double c = a;
                a = b;
                b = c;
            
            }
            
            double l1 = a;
            double l2 = b-a; 
            double l3 = 1-b;
            
            if (isTri(l1, l2,l3))
            s++;
        }
        
        return (double)s/t;
    }
    
    public static boolean isTri(double s1, double s2, double s3) {
        if(s1 + s2 > s3 && s2 + s3 > s1 && s1 + s3 > s2) 
            return true;
        return false;
    }
}
