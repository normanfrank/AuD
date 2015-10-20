package de_Frank_beuth;
/**
 * Created by Norman Frank on 20.10.15.
 */

public class MeineArrays {
    private static int callCount;

    public static int getcallCount() {
		return callCount;
    }
    
    // Array Werte und Länge des Array intitialisieren
    public static int binarySearchRecursiv(int[] ar, int x) {
        if(ar == null || x == 0){ //|| wird mit [ALT] + [Shift] + [7] erzeugt
            callCount++;
            return -1;
        }
        else {
        return binarySearchRecursiv(ar, x, 0, ar.length -1);
        }
    }
    
    //Der Algorithmus
    private static int binarySearchRecursiv(int[] ar, int x, int l, int r){
        callCount++;
       
        if (r < l){
            return callCount;
        }
        int n = ((l+r)/2);

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
