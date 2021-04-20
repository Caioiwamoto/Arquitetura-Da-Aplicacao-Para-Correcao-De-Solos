
package Aplicacao;
import org.junit.Test;
import static org.junit.Assert.*;

public class CorrecaoERecuperacaoDoFosforoTest {
    CorrecaoERecuperacaoDoFosforo CRFosforo = new CorrecaoERecuperacaoDoFosforo();
    
    @Test
    public void testCalculoDaQuantidadeDaFonteAplicar(){
        assertEquals(123.95079365079366, CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70,  TiposDeFontesDeFosforo.SUPERFOSFATO_SIMPLES), 0.0);
        assertEquals(54.41742160278746, CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.SUPERFOSFATO_TRIPLO), 0.0);
        assertEquals(46.481547619047625,CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.MAP), 0.0);
        assertEquals(49.58031746031747,CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.DAP), 0.0);
        assertEquals(123.95079365079366,CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.YOORIN), 0.0);
        assertEquals(67.60952380952381,CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.FOSFATO_ARAD), 0.0);
        assertEquals(76.93497536945813,CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.FOSFATO_GAFSA), 0.0);
        assertEquals(69.72232142857143,CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.FOSFATO_DAOUI), 0.0);
        assertEquals(92.96309523809525,CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.FOSFATO_PATOS_MINAS), 0.0);
        assertEquals(120.60077220077221,CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.ESCORIA_DE_THOMAS), 0.0);
        assertEquals(42.90604395604396,CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.ACIDO_FOSFORICO), 0.0);
        assertEquals(123.95079365079366,CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.MULTIF_MAGNESIANO), 0.0);
    }
    
    @Test
    public void testCalculoDoCalcioKiloPorHectare(){
        assertEquals(34.70622222222223, CRFosforo.calculoDoCalcioKiloPorHectare(TiposDeFontesDeFosforo.SUPERFOSFATO_SIMPLES, 
                                        CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.SUPERFOSFATO_SIMPLES)), 0.0);
        
        assertEquals(10.883484320557493,CRFosforo.calculoDoCalcioKiloPorHectare(TiposDeFontesDeFosforo.SUPERFOSFATO_TRIPLO, 
                                        CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.SUPERFOSFATO_TRIPLO)), 0.0);
         
        assertEquals(4.183339285714286,CRFosforo.calculoDoCalcioKiloPorHectare(TiposDeFontesDeFosforo.MAP, 
                                        CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.MAP)), 0.0);
         
        assertEquals(7.932850793650795,CRFosforo.calculoDoCalcioKiloPorHectare(TiposDeFontesDeFosforo.DAP, 
                                        CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.DAP)), 0.0);
          
        assertEquals(34.70622222222223,CRFosforo.calculoDoCalcioKiloPorHectare(TiposDeFontesDeFosforo.YOORIN, 
                                        CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.YOORIN)), 0.0);
          
        assertEquals(35.15695238095238,CRFosforo.calculoDoCalcioKiloPorHectare(TiposDeFontesDeFosforo.FOSFATO_ARAD, 
                                        CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.FOSFATO_ARAD)), 0.0);
          
        assertEquals(40.006187192118226,CRFosforo.calculoDoCalcioKiloPorHectare(TiposDeFontesDeFosforo.FOSFATO_GAFSA, 
                                        CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.FOSFATO_GAFSA)), 0.0);
          
        assertEquals(31.375044642857144,CRFosforo.calculoDoCalcioKiloPorHectare(TiposDeFontesDeFosforo.FOSFATO_DAOUI, 
                                        CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.FOSFATO_DAOUI)), 0.0);
          
        assertEquals(26.02966666666667,CRFosforo.calculoDoCalcioKiloPorHectare(TiposDeFontesDeFosforo.FOSFATO_PATOS_MINAS, 
                                        CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.FOSFATO_PATOS_MINAS)), 0.0);
          
        assertEquals(53.06433976833977,CRFosforo.calculoDoCalcioKiloPorHectare(TiposDeFontesDeFosforo.ESCORIA_DE_THOMAS, 
                                        CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.ESCORIA_DE_THOMAS)), 0.0);
          
        assertEquals(0.0,CRFosforo.calculoDoCalcioKiloPorHectare(TiposDeFontesDeFosforo.ACIDO_FOSFORICO, 
                                        CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.ACIDO_FOSFORICO)), 0.0);
          
        assertEquals(22.31114285714286,CRFosforo.calculoDoCalcioKiloPorHectare(TiposDeFontesDeFosforo.MULTIF_MAGNESIANO, 
                                        CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.MULTIF_MAGNESIANO)), 0.0);
        
    }
    
    @Test
    public void testCalculoDoEnxofreKiloPorHectare(){
        assertEquals(12.395079365079367,CRFosforo.calculoDoEnxofreKiloPorHectare(TiposDeFontesDeFosforo.SUPERFOSFATO_SIMPLES, 
                                        CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.SUPERFOSFATO_SIMPLES)), 0.0);
        
        assertEquals(0.0,CRFosforo.calculoDoEnxofreKiloPorHectare(TiposDeFontesDeFosforo.SUPERFOSFATO_TRIPLO, 
                                        CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.SUPERFOSFATO_TRIPLO)), 0.0);
        
        assertEquals(18.59261904761905,CRFosforo.calculoDoEnxofreKiloPorHectare(TiposDeFontesDeFosforo.YOORIN, 
                                        CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.YOORIN)), 0.0);
        
        assertEquals(13.634587301587302,CRFosforo.calculoDoEnxofreKiloPorHectare(TiposDeFontesDeFosforo.MULTIF_MAGNESIANO, 
                                        CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.MULTIF_MAGNESIANO)), 0.0);
    }
    
    @Test
    public void testCalculoDoCustoDaFonteUtilizarPorHectare(){
        assertEquals(24.790158730158733, CRFosforo.calculoDoCustoDaFonteUtilizarPorHectare(
                                         1, CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.SUPERFOSFATO_SIMPLES), 200), 0.0);
        
        assertEquals(156.178, CRFosforo.calculoDoCustoDaFonteUtilizarPorHectare( 
                              1,CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.SUPERFOSFATO_SIMPLES), 1260), 0.0);
    }
    
}
