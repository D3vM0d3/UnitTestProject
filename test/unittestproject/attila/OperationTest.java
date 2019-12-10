/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittestproject.attila;

//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

/**
 *
 * @author Kiss Attila Zoltán
 */
public class OperationTest {
    
    public OperationTest() {
    }
    
    /**
     * Test of sum method, of class Operation.
     * Összeadás tesztelése
     */
    @Test
    public void testSum() {
        System.out.println("2 + 3 = 5");
        Operation operation =new Operation(2, 3);
        double expectedResult = 2 + 3;
        assertEquals(expectedResult, operation.sum());     
    }
    
    /**
     * Test of sum method, of class Operation.
     * Kivonás tesztelése
     */
    @Test
    public void testSub() {
        System.out.println("2 - 3 = -1");
        Operation operation =new Operation(2, 3);
        double expectedResult = 2 - 3;
        assertEquals(expectedResult, operation.sub());     
    }
    
    /**
     * Test of sum method, of class Operation.
     * Szorzás tesztelése
     */
    @Test
    public void testMul() {
        System.out.println("2 * 3 = 6");
        Operation operation =new Operation(2, 3);
        double expectedResult = 2 * 3;
        assertEquals(expectedResult, operation.mul());     
    }
    
    /**
     * Test of sum method, of class Operation.
     * Osztás tesztelése
     */
    @Test
    public void testDiv() {
        System.out.println("2 / 3 = 0.67");
        Operation operation =new Operation(2, 3);
        double expectedResult = 2.0 / 3.0;
        assertEquals(expectedResult, operation.div());     
    }
    
    /**
     * Test of sum method, of class Operation.
     * Osztás tesztelése
     */
    @Test
    public void testDivDibisionByZero() {
        System.out.println("2 / 0 = Hiba! 0-val való osztás!");
        Operation operation = new Operation(2,0);
        //IllegalArgumentException expectedResult = new IllegalArgumentException("Hiba! 0-val való osztás!");
        //assertEquals(expectedResult, operation.div());
        //fail("Expected an IndexOutOfBoundsException to be thrown");
        
        try {
            IllegalArgumentException expectedResult = new IllegalArgumentException("Hiba! 0-val való osztás!");
            assertEquals(expectedResult, operation.div());
            fail("Hiba! 0-val való osztás!");
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage(), is("Hiba! 0-val való osztás!"));
        }
    }
}
