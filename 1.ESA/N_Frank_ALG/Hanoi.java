package N_Frank_ALG;
/**
 *
 * @author Norman Frank
 */
public class Hanoi 
{
    static int count = 0;
    
    public static int tuermeHanoi(int n, char x, char y, char z, String indent)
    {
        if(n == 1)
        {
            zieheScheibe(x, z, indent);
        }else
        {
            indent += " ";
            
            tuermeHanoi(n - 1, x, z, y, indent);
            
            zieheScheibe(x, z, indent);
            
            indent += " ";
            
            tuermeHanoi(n - 1, y, x, z, indent);
        }
        
        count++;
        
        return count;
    };
    
    public static void zieheScheibe(char x, char z, String indent)
    { 
        System.out.println(indent + "Bewege Scheibe von " + x + " nach " + z);
    };
}
  