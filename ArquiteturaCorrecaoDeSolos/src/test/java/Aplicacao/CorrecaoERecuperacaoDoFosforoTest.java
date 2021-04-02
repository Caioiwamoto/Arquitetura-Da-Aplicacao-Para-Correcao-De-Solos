
package Aplicacao;


import org.junit.Test;
import static org.junit.Assert.*;


public class CorrecaoERecuperacaoDoFosforoTest {
    CorrecaoERecuperacaoDoFosforo CRFosforo = new CorrecaoERecuperacaoDoFosforo();
    @Test
    public void testCalculoDaQuantidadeDaFonteAplicar(){
        assertEquals(123.95079365079366, CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, 1), 0.0);
        assertEquals(54.41742160278746, CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, 2), 0.0);
        assertEquals(46.481547619047625,CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, 3), 0.0);
        assertEquals(49.58031746031747,CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, 4), 0.0);
        assertEquals(123.95079365079366,CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, 5), 0.0);
        assertEquals(67.60952380952381,CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, 6), 0.0);
        assertEquals(76.93497536945813,CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, 7), 0.0);
        assertEquals(69.72232142857143,CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, 8), 0.0);
        assertEquals(92.96309523809525,CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, 9), 0.0);
        assertEquals(120.60077220077221,CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, 10), 0.0);
        assertEquals(42.90604395604396,CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, 11), 0.0);
        assertEquals(123.95079365079366,CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, 12), 0.0);
        assertEquals(0.0,CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, 13), 0.0);  
    }
    
    @Test
    public void testCalculoDoCalcioKiloPorHectare(){
        assertEquals(34.70622222222223, CRFosforo.calculoDoCalcioKiloPorHectare(1, 
                                        CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, 1)), 0.0);
        
        assertEquals(10.883484320557493,CRFosforo.calculoDoCalcioKiloPorHectare(2, 
                                        CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, 2)), 0.0);
         
        assertEquals(4.183339285714286,CRFosforo.calculoDoCalcioKiloPorHectare(3, 
                                        CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, 3)), 0.0);
         
        assertEquals(7.932850793650795,CRFosforo.calculoDoCalcioKiloPorHectare(4, 
                                        CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, 4)), 0.0);
          
        assertEquals(34.70622222222223,CRFosforo.calculoDoCalcioKiloPorHectare(5, 
                                        CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, 5)), 0.0);
          
        assertEquals(35.15695238095238,CRFosforo.calculoDoCalcioKiloPorHectare(6, 
                                        CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, 6)), 0.0);
          
        assertEquals(40.006187192118226,CRFosforo.calculoDoCalcioKiloPorHectare(7, 
                                        CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, 7)), 0.0);
          
        assertEquals(31.375044642857144,CRFosforo.calculoDoCalcioKiloPorHectare(8, 
                                        CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, 8)), 0.0);
          
        assertEquals(26.02966666666667,CRFosforo.calculoDoCalcioKiloPorHectare(9, 
                                        CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, 9)), 0.0);
          
        assertEquals(53.06433976833977,CRFosforo.calculoDoCalcioKiloPorHectare(10, 
                                        CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, 10)), 0.0);
          
        assertEquals(0.0,CRFosforo.calculoDoCalcioKiloPorHectare(11, 
                                        CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, 11)), 0.0);
          
        assertEquals(22.31114285714286,CRFosforo.calculoDoCalcioKiloPorHectare(12, 
                                        CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, 12)), 0.0);
          
        assertEquals(0.0,CRFosforo.calculoDoCalcioKiloPorHectare(13, 
                                        CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, 13)), 0.0);
        
    }
    
    @Test
    public void testCalculoDoEnxofreKiloPorHectare(){
        assertEquals(12.395079365079367,CRFosforo.calculoDoEnxofreKiloPorHectare(1, 
                                        CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, 1)), 0.0);
        
        assertEquals(0.0,CRFosforo.calculoDoEnxofreKiloPorHectare(2, 
                                        CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, 2)), 0.0);
        
        assertEquals(18.59261904761905,CRFosforo.calculoDoEnxofreKiloPorHectare(5, 
                                        CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, 5)), 0.0);
        
        assertEquals(13.634587301587302,CRFosforo.calculoDoEnxofreKiloPorHectare(12, 
                                        CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, 12)), 0.0);
    }
    
    @Test
    public void testCalculoDoCustoDaFonteUtilizarPorHectare(){
        assertEquals(24.790158730158733, CRFosforo.calculoDoCustoDaFonteUtilizarPorHectare(
                                         CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, 1), 200), 0.0);
        
        assertEquals(156.178,CRFosforo.calculoDoCustoDaFonteUtilizarPorHectare(
                             CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, 1), 1260), 0.0);
    }
    
}
