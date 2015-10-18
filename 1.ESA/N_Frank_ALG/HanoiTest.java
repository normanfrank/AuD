package N_Frank_ALG;
 /**
 *
 * @author Norman Frank
 */
public class HanoiTest 
{
    public static void main(String[] args) 
    {
        int count = Hanoi.tuermeHanoi(3, 'A', 'B', 'C', " ");
        
        System.out.println("\n Anzahl der Rekursiven-Aufrufe : " + count);
    }
}
