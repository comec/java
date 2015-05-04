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
public class Strings {
    
    public String reverse(String string)
    {
        // initialize a char array from given string
        char[] tmpString = string.toCharArray();
        int length = string.length() - 1;
        int count = 0;
      
        for (int i=length; i >= 0; i--, count++) {
            tmpString[count] = string.charAt(i);
        }
        return String.valueOf(tmpString);
    }
    
    public int countChars(String myString, char myChar)
    {
        int counter = 0;
        
        for (int i=0; i < myString.length(); i++) {
            if (myString.charAt(i) == myChar) {
                counter++;
            }
        }
        return counter;
    }
    
    public String toGerman(String myString)
    {
        String[] tmpString = myString.split("\\.");
        String newString = new String();
        int counter = 0;
        int length = tmpString[0].length() - 1;

        for (int i=length; i >= 0; i--, counter++) {
            if (counter == 3) {
                newString += ".";
                counter = 0;
            }
            newString += tmpString[0].charAt(i);
        }
        
        newString = reverse(newString) + "," + tmpString[1];
        return newString;
    }
}