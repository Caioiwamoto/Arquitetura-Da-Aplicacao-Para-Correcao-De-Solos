
package Aplicacao;
import org.junit.Assert;
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
    public void testCalculaValoresDosNutrientesAdicionais(){
        Assert.assertArrayEquals(new double[]{34.70622222222223, 12.395079365079367}, CRFosforo.calculaValoresDosNutrientesAdicionais(TiposDeFontesDeFosforo.SUPERFOSFATO_SIMPLES,
                                            CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.SUPERFOSFATO_SIMPLES)), 0.0);
        
        Assert.assertArrayEquals(new double[]{10.883484320557493, 0.0}, CRFosforo.calculaValoresDosNutrientesAdicionais(TiposDeFontesDeFosforo.SUPERFOSFATO_TRIPLO,
                                            CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.SUPERFOSFATO_TRIPLO)), 0.0);
        
        Assert.assertArrayEquals(new double[]{4.183339285714286, 0.0}, CRFosforo.calculaValoresDosNutrientesAdicionais(TiposDeFontesDeFosforo.MAP,
                                            CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.MAP)), 0.0);
        
        Assert.assertArrayEquals(new double[]{7.932850793650795, 0.0}, CRFosforo.calculaValoresDosNutrientesAdicionais(TiposDeFontesDeFosforo.DAP,
                                            CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.DAP)), 0.0);
        
        Assert.assertArrayEquals(new double[]{34.70622222222223, 18.59261904761905}, CRFosforo.calculaValoresDosNutrientesAdicionais(TiposDeFontesDeFosforo.YOORIN,
                                            CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.YOORIN)), 0.0);
        
        Assert.assertArrayEquals(new double[]{35.15695238095238, 0.0}, CRFosforo.calculaValoresDosNutrientesAdicionais(TiposDeFontesDeFosforo.FOSFATO_ARAD,
                                            CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.FOSFATO_ARAD)), 0.0);
        
        Assert.assertArrayEquals(new double[]{40.006187192118226, 0.0}, CRFosforo.calculaValoresDosNutrientesAdicionais(TiposDeFontesDeFosforo.FOSFATO_GAFSA,
                                            CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.FOSFATO_GAFSA)), 0.0);
        
        Assert.assertArrayEquals(new double[]{31.375044642857144, 0.0}, CRFosforo.calculaValoresDosNutrientesAdicionais(TiposDeFontesDeFosforo.FOSFATO_DAOUI,
                                            CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.FOSFATO_DAOUI)), 0.0);
        
        Assert.assertArrayEquals(new double[]{26.02966666666667, 0.0}, CRFosforo.calculaValoresDosNutrientesAdicionais(TiposDeFontesDeFosforo.FOSFATO_PATOS_MINAS,
                                            CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.FOSFATO_PATOS_MINAS)), 0.0);
        
        Assert.assertArrayEquals(new double[]{53.06433976833977, 0.0}, CRFosforo.calculaValoresDosNutrientesAdicionais(TiposDeFontesDeFosforo.ESCORIA_DE_THOMAS,
                                            CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.ESCORIA_DE_THOMAS)), 0.0);
        
        Assert.assertArrayEquals(new double[]{0.0, 0.0}, CRFosforo.calculaValoresDosNutrientesAdicionais(TiposDeFontesDeFosforo.ACIDO_FOSFORICO,
                                            CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.ACIDO_FOSFORICO)), 0.0);
        
        Assert.assertArrayEquals(new double[]{22.31114285714286, 13.634587301587302}, CRFosforo.calculaValoresDosNutrientesAdicionais(TiposDeFontesDeFosforo.MULTIF_MAGNESIANO,
                                            CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.MULTIF_MAGNESIANO)), 0.0);
    }
    
    @Test
    public void testNutrientesAdicionais(){
        Assert.assertArrayEquals(new String[]{"Calcio", "Enxofre"}, CRFosforo.nutrientesAdicionais(TiposDeFontesDeFosforo.SUPERFOSFATO_SIMPLES));
        Assert.assertArrayEquals(new String[]{"Calcio", "Magnesio"}, CRFosforo.nutrientesAdicionais(TiposDeFontesDeFosforo.SUPERFOSFATO_TRIPLO));
        Assert.assertArrayEquals(new String[]{"Nitrogenio", ""}, CRFosforo.nutrientesAdicionais(TiposDeFontesDeFosforo.MAP));
        Assert.assertArrayEquals(new String[]{"Nitrogenio", ""}, CRFosforo.nutrientesAdicionais(TiposDeFontesDeFosforo.DAP));
        Assert.assertArrayEquals(new String[]{"Calcio", "Magnesio"}, CRFosforo.nutrientesAdicionais(TiposDeFontesDeFosforo.YOORIN));
        Assert.assertArrayEquals(new String[]{"Calcio", ""}, CRFosforo.nutrientesAdicionais(TiposDeFontesDeFosforo.FOSFATO_ARAD));
        Assert.assertArrayEquals(new String[]{"Calcio", ""}, CRFosforo.nutrientesAdicionais(TiposDeFontesDeFosforo.FOSFATO_GAFSA));
        Assert.assertArrayEquals(new String[]{"Calcio", ""}, CRFosforo.nutrientesAdicionais(TiposDeFontesDeFosforo.FOSFATO_DAOUI));
        Assert.assertArrayEquals(new String[]{"Calcio", ""}, CRFosforo.nutrientesAdicionais(TiposDeFontesDeFosforo.FOSFATO_PATOS_MINAS));
        Assert.assertArrayEquals(new String[]{"Calcio", ""}, CRFosforo.nutrientesAdicionais(TiposDeFontesDeFosforo.ESCORIA_DE_THOMAS));
        Assert.assertArrayEquals(new String[]{"", ""}, CRFosforo.nutrientesAdicionais(TiposDeFontesDeFosforo.ACIDO_FOSFORICO));
        Assert.assertArrayEquals(new String[]{"Calcio", "Enxofre"}, CRFosforo.nutrientesAdicionais(TiposDeFontesDeFosforo.MULTIF_MAGNESIANO)); 
    }
    
    @Test
    public void testCalculoDoCustoDaFonteUtilizarPorHectare(){
        assertEquals(24.790158730158733, CRFosforo.calculoDoCustoDaFonteUtilizarPorHectare(
                                         "SUPERFOSFATO_SIMPLES", CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.SUPERFOSFATO_SIMPLES), 200), 0.0);
        
        assertEquals(156.178, CRFosforo.calculoDoCustoDaFonteUtilizarPorHectare( 
                              "SUPERFOSFATO_SIMPLES",CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.SUPERFOSFATO_SIMPLES), 1260), 0.0);
    }
    
}
