
/**
 * Write a description of class Comedy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Comedy extends Movie
{
    // instance variables - replace the example below with your own
    private int laughs;

    
    public Comedy(String t, int s, String r, String a[])
    {
        super(t,s,r, a);
        laughs = 0;
    }

    public void setLaughs(int i )
    {
        laughs = i;
    }
    public int getLaughs()
    {return laughs;
        
    }
    @Override
    public String toString()
    {
        
        return super.toString() + "Laughs: " + laughs;
    }
    public void showMovie(int n)
    {
        ((Movie)this).showMovie();
       laughs = laughs + n;
    }
}
