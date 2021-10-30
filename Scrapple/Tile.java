
/**
 * Write a description of class Tile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tile
{
    // instance variables - replace the example below with your own
    private String letter;
    private int value;
    private static int [] scores = {1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
    private static String alpha =  ("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    
    public Tile(String str)
    {
        letter = str;
        value = scores[alpha.indexOf(letter.toUpperCase())];
    }

    
    public String getLetter()
    {
        
        return letter;
    }
    public int getValue()
    {
        
        return value;
    }
    public String toString() {
        return letter + "(" + value + ")";
    }
}
