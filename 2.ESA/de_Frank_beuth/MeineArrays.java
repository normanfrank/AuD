package de_Frank_beuth;

/**
 * Created by Norman Frank on 20.10.15.
 */

public class MeineArrays {
    private static int callCount;
	
    public static int getcallCount() {
		return callCount;
    }
    

    public static int binarySearchRecursiv(int[] ar, int x) {
    	callCount = 0;
        if(ar == null || x == 0){ //|| wird mit [ALT] + [Shift] + [7] erzeugt
            callCount++;
            return -1;
        }
        else {
        return binarySearchRecursiv(ar, x, 0, ar.length -1);
        }
    }
  
    private static int binarySearchRecursiv(int[] ar, int x, int l, int r){ //Hilfsmethode
        callCount++;
       // System.out.println("Vor der Halbierung: " + ar + x + l + r);
        if (r < l){
            return -1;
        }
        int n = ((l+r)/2);
       // System.out.println("Nach der Halbierung n: " + n + " x: " + x + " l: " + l + " r:" + r);
        
        if (x == ar[n]){
            return x;
        }
        else if (x < ar[n]) {
            return binarySearchRecursiv(ar, x, l, n-1);
        }
        else {
            return binarySearchRecursiv(ar, x, n+1, r);
        }
    }

}
