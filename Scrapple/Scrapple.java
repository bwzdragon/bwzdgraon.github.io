
import java.util.Scanner;
public class Scrapple {
 public static void main(String[] args) {
 Scanner s = new Scanner(System.in);
 boolean b = true;
 while(b) {
 System.out.println("Welcome to scrapple");
 System.out.print("Enter word: ");
 WordTiles word = new WordTiles(s.next());
 
 System.out.println(word.toString());
 System.out.println("Score: " + word.getWordScore() );
 
 System.out.println("Do you want to enter another word (1 = yes 2 = no)"); 
 int i = s.nextInt();
 
 while(i != 1 && i != 2) {
 System.out.println("Do you want to enter another word (1 = yes 2 = no)"); 
 i = s.nextInt();
 }
 
  if(i == 2) {
 System.out.println("Program closed");
 b = false;
 break;
 } 
 }
 }

        
        
        
        
        
        
        
        
        
        
        
    }

