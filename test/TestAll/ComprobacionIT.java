/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestAll;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LENOVO LEGION
 */
public class ComprobacionIT {
    
    public ComprobacionIT() {
    }

    @Test
    public void testElementoNumerico() {
        Comprobacion comprobacion = new Comprobacion();
        assertTrue(comprobacion.elementoNumerico("123"));
    }
    
}
