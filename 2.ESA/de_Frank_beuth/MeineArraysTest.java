package de_Frank_beuth;


/**
 * Created by Norman Frank on 20.10.15.
 */

public class MeineArraysTest {

    public static void main (String[] args) {
        int[] ar = {3, 5, 6, 9, 13, 18, 34, 46};
        int result = MeineArrays.binarySearchRecursiv(ar, 13);
        System.out.println("Anzahl der Durchgänge: "+ MeineArrays.getcallCount());
        System.out.println("Gesuchter Wert: "+ result);
    }
}
