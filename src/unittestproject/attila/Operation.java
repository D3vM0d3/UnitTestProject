/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittestproject.attila;

/**
 *
 * @author Kiss Attila Zoltán
 */
public class Operation {
    private double number1;
    private double number2;

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }
    
    public Operation(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    
    /**
     * Összeadás
     * @return double
     */
    public double sum(){
        return number1 + number2;
    }
    
    /**
     * Kivonás
     * @return double
     */
    public double sub(){
        return number1 - number2;
    }
    
    /**
     * Szorzás
     * @return double
     */
    public double mul(){
        return number1 * number2;
    }
    
    /**
     * Osztás
     * @return mixed
     */
    public double div(){
        if(number2 == 0){
            throw new IllegalArgumentException("Hiba! 0-val való osztás!");
        }
        return number1 / number2;
    }
}
