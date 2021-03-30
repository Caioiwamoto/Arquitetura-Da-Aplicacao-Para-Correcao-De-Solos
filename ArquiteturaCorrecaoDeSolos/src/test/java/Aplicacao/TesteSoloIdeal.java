
package Aplicacao;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteSoloIdeal {
    
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
}
