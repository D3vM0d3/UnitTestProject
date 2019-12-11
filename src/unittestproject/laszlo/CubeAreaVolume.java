/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittestproject.laszlo;

import static java.lang.Math.pow;

/**
 *
 * @author Lackó
 */
public class CubeAreaVolume {
    private double a;
    
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public CubeAreaVolume(double a) {
        this.a = a;
    }
    
    /**
     * Kocka felszíne
     * @return double
     */
    public double CubeArea(){
        return 6*pow(a,2);
    
    }
    
    /**
     * Kocka térfogata
     * @return double
     */
    public double CubeVolume(){
        return pow(a,3);
        
    }
    
}
