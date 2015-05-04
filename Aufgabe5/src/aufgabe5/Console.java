/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author jkasten
 */
public class Console {
    
    private String input;
    
    public void setInputString(String name) {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        try {
            this.input =  buffer.readLine();
        } catch(IOException error) {
            System.err.println("IO error trying to read input");
            System.exit(1);
        }          
    }
    public String getInputString() {
        return this.input;
    }
   

}
