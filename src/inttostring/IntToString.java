/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inttostring;

/**
 *
 * @author Mike Brooks
 */
public class IntToString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(numberToString(5));
        System.out.println(numberToString2(-15));
    }
    
    public static String numberToString(int num) {
        return Integer.toString(num);
    }
    
    public static String numberToString2(int num) {
        return String.valueOf(num);
    }
    
}
