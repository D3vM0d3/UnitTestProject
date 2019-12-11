/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittestproject.peter;

/**
 *
 * @author Canis
 */
public class Bubblesort {
    public static int[] bubbleSortInc(int[] tomb) {  
        int n = tomb.length;  
        int temp = 0;  
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(tomb[j-1] > tomb[j]){  
                    temp = tomb[j-1];  
                    tomb[j-1] = tomb[j];  
                    tomb[j] = temp;  
                }      
            }  
        }
        return tomb;
    }
    
    public static int[] bubbleSortDesc(int[] tomb) {  
	int n = tomb.length;
	int temp = 0;
	for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
		if(tomb[j-1] < tomb[j]){
                    temp = tomb[j-1];
                    tomb[j-1] = tomb[j];
                    tomb[j] = temp;
		}	
            }
	}
        return tomb;
    }
 
}
