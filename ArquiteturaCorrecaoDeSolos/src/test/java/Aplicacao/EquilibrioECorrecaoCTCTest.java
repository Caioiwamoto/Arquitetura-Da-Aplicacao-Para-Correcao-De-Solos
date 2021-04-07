
package Aplicacao;

import org.junit.Test;
import static org.junit.Assert.*;


public class EquilibrioECorrecaoCTCTest {
    
    EquilibrioECorrecaoCTC EqCrCTC = new EquilibrioECorrecaoCTC(0.15,5.76,1.63,5.35,30.7);
    
    @Test
    public void testCalculoSCmol(){
        assertEquals(7.54, EqCrCTC.calculoSCmol(), 0);
    }
    
    @Test
    public void testCalculoCTCCmol() {
        assertEquals(12.89, EqCrCTC.calculoCTCCmol(), 0.0);
    }
    
    @Test
    public void testCalculoVPercentual(){
        assertEquals(58.494957331264544, EqCrCTC.calculoVPercentual(), 0.0);
    }
    
    @Test
    public void testMOPercentual() {
        assertEquals(3.07, EqCrCTC.calculoMOPercentual(),0.0);
    }
    
    @Test
    public void testCalculoCarbono(){
        assertEquals(17.848837209302324, EqCrCTC.calculoDoCarbono(), 0.0);
    }
    
    
    
}
