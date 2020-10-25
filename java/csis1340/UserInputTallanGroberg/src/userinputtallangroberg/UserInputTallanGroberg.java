/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinputtallangroberg;
import javax.swing.*;

/**
 *
 * @author tallan
 */
public class UserInputTallanGroberg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;
        Keyboard k;
        k = new Keyboard();
        System.out.println("please enter your name");
        name = k.readLine();
        
        System.out.println("Hi there " + name);



    }
    
}
