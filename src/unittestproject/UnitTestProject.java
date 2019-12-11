/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittestproject;

import unittestproject.attila.Operation;
import unittestproject.peter.Bubblesort;

/**
 *
 * @author Kiss Attila Zoltán, Bodogán László, Smid Péter
 */
public class UnitTestProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        
        //Kiss Attila Zoltán
        Operation operation = new Operation(2, 3);
        System.out.println(String.format("%.2f + %.2f = %.2f", operation.getNumber1(), operation.getNumber2(), operation.sum()));
        System.out.println(String.format("%.2f - %.2f = %.2f", operation.getNumber1(), operation.getNumber2(), operation.sub()));
        System.out.println(String.format("%.2f * %.2f = %.2f", operation.getNumber1(), operation.getNumber2(), operation.mul()));
        System.out.println(String.format("%.2f / %.2f = %.2f", operation.getNumber1(), operation.getNumber2(), operation.div()));
        
        System.out.println("");
        
        //Smid Péter
        int tomb[] ={6,15,84,34,94,213,99};      
        System.out.println("Rendezés előtti tömb:");  
        for(int i=0; i < tomb.length; i++){  
            System.out.print(tomb[i] + " ");  
        }  
        System.out.println();  
                  
        Bubblesort bubblesort = new Bubblesort();
        bubblesort.bubbleSortInc(tomb);
        System.out.println("Növekvőbe rendezett tömb:");  
        for(int i=0; i < tomb.length; i++){  
            System.out.print(tomb[i] + " ");  
        }
        
        bubblesort.bubbleSortDesc(tomb);
        System.out.println("\nCsökkenőbe rendezett tömb:");  
        for(int i=0; i < tomb.length; i++){  
            System.out.print(tomb[i] + " ");  
        }       
    }
}
