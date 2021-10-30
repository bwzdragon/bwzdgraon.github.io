
import java.util.Scanner;
public class EncodedMessage
{
    // instance variables - replace the example below with your own
    public static void main (String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Give message that is at least 10 characters long");
        String a = s.nextLine();
        a = a.toUpperCase(); // a = message
        while (!(a.length() > 9))
        {
            System.out.println("Give message that is at least 10 characters long, the last one wasn't atleast 10 characters long");
            a = s.nextLine().toUpperCase();

        }
        System.out.println("Give a code word with a length that is less than 7, no spaces allowed ");
        String b = s.nextLine();// b = code
        b = b.toUpperCase(); 

        while(b.indexOf(" ") != -1 || b.length() >= 7 ) {
            System.out.println("Bad code word, contains space or is too long ");
            b = s.nextLine().toUpperCase();
        }

        System.out.println("Your encoded phrase is " + encode(a, b));
    }

    public static String getRandString(String str)
    {
        int i = (int) (Math.random() * str.length());
        int k = (int) (Math.random() * str.length()) ;

        while (i >= k) {
            i = (int) (Math.random() * str.length());
            k = (int) (Math.random() * str.length()) ;
        }
        return str.substring(i,k);
    }

    public static String encode(String m, String c) {
        String m2 = ""; //encoded message
        String letters = "";

        for(int i=0; i<m.length(); i++) {
            for(int n=0; n<c.length(); n++) {
                if(c.substring(n, n+1).equals(m.substring(i,i+1)))
                    letters += c.substring(n, n+1);
            }
            if(letters.indexOf(m.substring(i,i+1)) != -1) {  
                String rand = getRandString(c);                  
                m2 += rand;
                System.out.println(rand);
            } else {
                m2 += m.substring(i,i+1);
            }
        }        

        return m2;
    }
}
