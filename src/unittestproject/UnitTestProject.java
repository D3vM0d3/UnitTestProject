/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittestproject;

import unittestproject.attila.Operation;

/**
 *
 * @author Kiss Attila zoltán, Bodogán László, Smid Péter
 */
public class UnitTestProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Operation operation = new Operation(2, 3);
        System.out.println(String.format("%.2f + %.2f = %.2f", operation.getNumber1(), operation.getNumber2(), operation.sum()));
        System.out.println(String.format("%.2f - %.2f = %.2f", operation.getNumber1(), operation.getNumber2(), operation.sub()));
        System.out.println(String.format("%.2f * %.2f = %.2f", operation.getNumber1(), operation.getNumber2(), operation.mul()));
        System.out.println(String.format("%.2f / %.2f = %.2f", operation.getNumber1(), operation.getNumber2(), operation.div()));
    }
    
}
