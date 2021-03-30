/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacao;
import org.junit.jupiter.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteEquilibrioECorrecaoCTC {
    
    public class NewEmptyJUnitTest{
        @Test
        public void testSoloIdeal(){
            
            assertEquals(9.0, new SoloIdeal(1).getFosforo());
            assertEquals(0.35, new SoloIdeal(1).getPotassio());
            assertEquals(6.0, new SoloIdeal(1).getCalcio());
            assertEquals(1.5, new SoloIdeal(1).getMagnesio());
            assertEquals(9.0, new SoloIdeal(1).getEnxofre());
            assertEquals(0.0, new SoloIdeal(1).getAluminio());
            
            assertEquals(12.0, new SoloIdeal(2).getFosforo());
            assertEquals(0.25, new SoloIdeal(2).getPotassio());
            assertEquals(4.0, new SoloIdeal(2).getCalcio());
            assertEquals(1.0, new SoloIdeal(2).getMagnesio());
            assertEquals(6.0, new SoloIdeal(2).getEnxofre());
            assertEquals(0.0, new SoloIdeal(2).getAluminio());
            
        }
        
        @Test
        public void testCalculoSCmol(){
            assertEquals(7.54, new EquilibrioECorrecaoCTC().calculoSCmol(0.15, 5.76, 1.63));
        }
        
        @Test
        public void testCalculoCTCCmol(){
            assertEquals(12.89, new EquilibrioECorrecaoCTC().calculoCTCCmol(0.15, 5.76, 1.63, 5.35));
        }
        
        @Test
        public void testaVPercentual() {
            assertEquals(58.494957331264544, 
                new EquilibrioECorrecaoCTC().calculoVPercentual(
                    new EquilibrioECorrecaoCTC().calculoSCmol(0.15, 5.76, 1.63), 
                    new EquilibrioECorrecaoCTC().calculoCTCCmol(0.15, 5.76, 1.63, 5.35)
                )
            );
        }
        
        @Test
        public void testaMOPercentual() {
            assertEquals(3.07, new EquilibrioECorrecaoCTC().calculoMOPercentual(30.7));
        }
    
        @Test
        public void testaCalculaCarbono() {
            assertEquals(17.848837209302324, new EquilibrioECorrecaoCTC().calculoDoCarbono(
                        new EquilibrioECorrecaoCTC().calculoMOPercentual(30.7))
            );
        }
    }
}
