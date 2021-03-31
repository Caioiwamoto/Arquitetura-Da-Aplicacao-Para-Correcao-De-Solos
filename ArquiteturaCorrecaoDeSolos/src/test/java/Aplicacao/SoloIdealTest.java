package Aplicacao;

import org.junit.Test;
import static org.junit.Assert.*;


public class SoloIdealTest {
    
    @Test
    public void test(){
     
        assertEquals(0.0, new SoloIdeal(1).getAluminio(), 0.0);
        assertEquals(9.0, new SoloIdeal(1).getFosforo(), 0.0);
        assertEquals(0.35, new SoloIdeal(1).getPotassio(), 0.0);
        assertEquals(6.0, new SoloIdeal(1).getCalcio(), 0.0);
        assertEquals(1.5, new SoloIdeal(1).getMagnesio(), 0.0);
        assertEquals(9.0, new SoloIdeal(1).getEnxofre(), 0.0);
        assertEquals(0.0, new SoloIdeal(1).getAluminio(), 0.0);
            
        assertEquals(12.0, new SoloIdeal(2).getFosforo(), 0.0);
        assertEquals(0.25, new SoloIdeal(2).getPotassio(), 0.0);
        assertEquals(4.0, new SoloIdeal(2).getCalcio(), 0.0);
        assertEquals(1.0, new SoloIdeal(2).getMagnesio(), 0.0);
        assertEquals(6.0, new SoloIdeal(2).getEnxofre(), 0.0);
        assertEquals(0.0, new SoloIdeal(2).getAluminio(), 0.0);
    }
}
