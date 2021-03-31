
package Aplicacao;

import org.junit.Test;
import static org.junit.Assert.*;


public class EquilibrioECorrecaoCTCTest {
    
    @Test
    public void testCalculoSCmol(){
        assertEquals(7.54, new EquilibrioECorrecaoCTC().calculoSCmol(0.15, 5.76, 1.63), 0);
    }
    
    @Test
    public void testCalculoCTCCmol() {
        assertEquals(12.89, new EquilibrioECorrecaoCTC().calculoCTCCmol(0.15, 5.76, 1.63, 5.35), 0.0);
    }
    
    @Test
    public void testCalculoVPercentual(){
        EquilibrioECorrecaoCTC eqCTC = new EquilibrioECorrecaoCTC();
        assertEquals(58.494957331264544, eqCTC.calculoVPercentual(
                                                eqCTC.calculoSCmol(0.15, 5.76, 1.63),
                                                eqCTC.calculoCTCCmol(0.15, 5.76, 1.63, 5.35)), 0.0);
    }
    
    @Test
    public void testMOPercentual() {
        assertEquals(3.07, new EquilibrioECorrecaoCTC().calculoMOPercentual(30.7),0.0);
    }
    
    @Test
    public void testCalculoCarbono(){
        EquilibrioECorrecaoCTC eqCTC = new EquilibrioECorrecaoCTC();
        assertEquals(17.848837209302324, eqCTC.calculoDoCarbono(eqCTC.calculoMOPercentual(30.7)), 0.0);
    }
    
    
    
}
