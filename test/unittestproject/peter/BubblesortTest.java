/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittestproject.peter;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;
/**
 *
 * @author Canis
 */
public class BubblesortTest {
    
    public BubblesortTest (){
    }
    int tomb[] ={6,15,84,34,94,213,99};      
    
    /**
     * Növekvő sorrend tesztelése
     */
    @Test
    public void testSortInc() {
        Bubblesort bubblesort = new Bubblesort();
        boolean expectedResult = true;
        boolean testResult = true;
        int tombnov[]=bubblesort.bubbleSortInc(tomb);
        for (int i = 0; i < tombnov.length - 1; i++) {
            if (tombnov[i] > tombnov[i + 1])
                testResult = false;
        }
        assertEquals(expectedResult, testResult); 
    }
    
    /**
     * Csökkenő sorrend tesztelése
     */
    @Test
    public void testSortDesc() {
        Bubblesort bubblesort = new Bubblesort();
        boolean expectedResult = true;
        boolean testResult = true;
        int tombcsokk[]=bubblesort.bubbleSortDesc(tomb);
        for (int i = 0; i < tombcsokk.length - 1; i++) {
            if (tombcsokk[i] < tombcsokk[i + 1])
                testResult = false;
        }
        assertEquals(expectedResult, testResult); 
    }
 
}
