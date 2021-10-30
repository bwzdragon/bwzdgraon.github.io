
import java.util.*; //for ArrayList and Scanner
public class FoodList
{
    private ArrayList <Food> f ;
    private Scanner s = new Scanner(System.in);

    
    public FoodList()
    {
     f = new ArrayList<Food>();
        System.out.print("How many foods to add: ");
      int n = s.nextInt();
        for(int i=0; i<n; i++) {
            this.addItem();   
    }
}

   
    public ArrayList<Food> getFood()
    {
        // put your code here
        return f;
    }
    public void addItem()
    {
        Food fo = new Food();
        fo.getFoodInfo();
        
        if(f.size()==0) 
        {
            f.add(fo); 
        }
        else if(fo.getCals()>= f.get(f.size()-1).getCals()) 
        {
            f.add(fo);         
        }
        else  
        {
            
            for(int i=0; i<f.size(); i++)
            {
                if(fo.getCals()< f.get(i).getCals()) 
                {
                    f.add(i,fo); 
                    break; 
                }
            }
        }
    }
    
    public String toString()
    {
        String str = "";
        for(int i = 0; i < f.size() ; i++)
        {
            str = str  + (i+1)+ ".   " + f.get(i).toString();
        }
        return str;
    }
   public  void  removeItems(ArrayList<Integer> array) 
    {
        
        for(int i=1; i<array.size(); i++) {
            int n = array.get(i);
            int pos = i;
            
            while(pos > 0 && n < array.get(pos-1)) {
                array.set(pos, array.get(pos-1));
                pos--;
            }
            array.set(pos, n);
        }
    for(int i=array.size()-1; i>= 0; i--) {
            System.out.println(f.remove(array.get(i).intValue()));
        }
    }
    
    public double totalCost()
    {
        double s = 0;
        for(int i = 0; i<f.size(); i++)
        {
            s= s+f.get(i).getCost();
        }
        return s;
    }
}
