
/**
 * Write a description of class WordTiles here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WordTiles
{
    // instance variables - replace the example below with your own
    private Tile[] word;

    
    public WordTiles(String str)
    {
        
        word = new Tile[str.length()];
        
        for ( int i = 0 ; i < word.length ; i++) {
            word[i] = new Tile(str.substring(i,i+1));
            
            
        }
        
    }

    
    public int getWordScore()
    {
       int i = 0;
        for ( int j = 0 ; j < word.length ; j++) {
            i = i + word[j].getValue();
    }
    return i;
}
public String toString(){
    String str = "";
    for ( int i = 0 ; i < word.length ; i++) {
    str = str + word[i].toString()+ " ";
}
return str;
}
}
