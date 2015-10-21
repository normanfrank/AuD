package de_Frank_beuth;


/**
 * Created by Norman Frank on 20.10.15.
 */

public class MeineArraysTest {
	
    public static void main (String[] args) {
    	int lArray1 = 0;
    	int rArray1 = 999;
		int[] ar1 = new int [rArray1 - lArray1 +1];
    		for(int i = 0; i <= rArray1 - lArray1; i++)
    			ar1[i] = lArray1 +i;
        System.out.println("Ein Array mit den Zahlen 0 - 999");
        System.out.println("Gesuchter Wert: " + MeineArrays.binarySearchRecursiv(ar1, 12));
        System.out.println("Anzahl der Durchgänge: "+ MeineArrays.getcallCount());	
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
 //------------------------------------------------------------------------------------------------------------------       
    	int lArray2 = 0;
    	int rArray2 = 9999;
		int[] ar2 = new int [rArray2 - lArray2 +1];
    		for(int i = 0; i <= rArray2 - lArray2; i++)
    			ar2[i] = lArray2 +i;
        System.out.println("Ein Array mit den Zahlen 0 - 9999");
        System.out.println("Gesuchter Wert: " + MeineArrays.binarySearchRecursiv(ar2, 12));
        System.out.println("Anzahl der Durchgänge: "+ MeineArrays.getcallCount());	
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

	}
}
