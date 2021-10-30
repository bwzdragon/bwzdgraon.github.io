

public class RomCom extends Comedy
{
    // instance variables - replace the example below with your own
    private boolean happy;

  
    public RomCom(String t, int s, String r, String a[], boolean h )
    {
        super(t,s,r, a);
        happy = h;
    }
public void setHappy(boolean i )
    {
        happy = i;
    }
    public boolean getHappy()
    {return happy;
        
    }
   
    @Override
    public String toString()
    {
        
        if(happy == true)
        {
        return super.toString() + "\nHappy Ending: YES " ;
    } else 
{
    return super.toString() + "\nHappy Ending: NO " ;
    }
}
}
