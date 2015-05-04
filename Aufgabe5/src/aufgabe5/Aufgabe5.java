/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe5;

/**
 *
 * @author jens
 */
public class Aufgabe5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String myString = "Hello World!";
        char myChar = 'o';
       
        System.out.println("Orginal: " + myString);
        
        Strings string = new Strings();
        System.out.println("reverseToUpper: " + string.reverse(myString).toUpperCase());
        System.out.println("Anzahl von[" + myChar + "] in " + myString + ": " + string.countChars(myString, myChar));
     
        String firstName = "Max";
        String lastName = "Mustermann";
        String output = firstName + " " + lastName;
        System.out.println(output);
         
        String count = "1234567890.98765";
        System.out.println("Ausgangswert: " + count);
        System.out.println("Gewechselt: " + string.toGerman(count));
    }  
}
