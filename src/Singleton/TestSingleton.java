/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author Amil
 */
public class TestSingleton {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
         Singleton s2 = Singleton.getInstance();
         if(s1.hashCode()==s2.hashCode()){
             System.out.println("both are same object"+s1.hashCode());
         }
         else{
             System.out.println("Diff objects");
         }
         
        
    }
   
}
