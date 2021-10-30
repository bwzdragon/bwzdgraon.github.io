
/**
 * Write a description of class Action here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Action extends Movie
{
    // instance variables - replace the example below with your own
    private int deaths;

   public Action(String t, int s, String r, String a[], int d )
    {
        super(t,s,r, a);
        deaths = d;
    }
   
public void setDeaths(int i )
    {
        deaths = i;
    }
    public int getDeaths()
    {return deaths;
        
    }
    @Override
    public String toString()
    {
        
        return super.toString() + "Deaths: " + deaths;
    }
    public boolean changeRating()
    {
        if (deaths >= 5)
        {
            this.setRating("R");
            return true;
            
        }
        else{
            return false;
        }
    }
}
