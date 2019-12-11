/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittestproject.laszlo;

/**
 *
 * @author Lackó
 */

import static java.lang.Math.pow;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;


public class CubeAreaVolumeTest {
    
    public CubeAreaVolumeTest(){
    }
    
    /**
     * Kocka felszínszámítás tesztelése
     */
    @Test
    public void testArea(){
        System.out.println("A kocka oldalainak hossza 3");
        CubeAreaVolume area = new CubeAreaVolume(3);
        double exResult = 6*pow(3,2);
        assertEquals(exResult, area.CubeArea());
    
    }
    
    /**
     * Kocka térfogatszámítás tesztelése
     */
    @Test
    public void testVolume(){
        System.out.println("A kocka oldalainak hossza 3");
        CubeAreaVolume volume = new CubeAreaVolume(3);
        double exResult = pow(3,3);
        assertEquals(exResult, volume.CubeVolume());
        
    }
}
