package Aplicacao;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


public class Tests {
      
    @Test
    public void testeTabelaTeoresDoSolo(){
        EquilibrioECorrecaoCTC EqCrCTC = new EquilibrioECorrecaoCTC(0.15,5.76,1.63,5.35,30.7);
        // Teste dos calulos do solo
        assertEquals(7.54, EqCrCTC.calculoSCmol(), 0);
        assertEquals(12.89, EqCrCTC.calculoCTCCmol(), 0.0);   
        assertEquals(58.494957331264544, EqCrCTC.calculoVPercentual(), 0.0);   
        assertEquals(3.07, EqCrCTC.calculoMOPercentual(),0.0);   
        assertEquals(17.848837209302324, EqCrCTC.calculoDoCarbono(), 0.0);
    }

    @Test
    public void testeTabelaFosforoCorrecao(){
        CorrecaoERecuperacaoDoFosforo CRFosforo = new CorrecaoERecuperacaoDoFosforo();
        // Cálculo da quantidade aplicada para cada fonte de fófosro
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
        
        // Teste dos cálculos dos nutrientes adicionais para cada fonte de fósforo
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
        
        // Teste dos cálculos de custo do alqueire para cada fonte de fósforo
        assertEquals(156.178, CRFosforo.calculoDoCustoDaFonteUtilizarPorHectare( 
                              "SUPERFOSFATO_SIMPLES",CRFosforo.calculoDaQuantidadeDaFonteAplicar(12, 8.59, 70, TiposDeFontesDeFosforo.SUPERFOSFATO_SIMPLES), 1260), 0.0);
        assertEquals(68.59946341463414, CRFosforo.calculoDoCustoDaFonteUtilizarPorHectare( 
                              "SUPERFOSFATO_TRIPLO",CRFosforo.calculoDaQuantidadeDaFonteAplicar(70, 8.59, 1260, TiposDeFontesDeFosforo.SUPERFOSFATO_TRIPLO), 1260), 0.0);
        assertEquals(58.595375, CRFosforo.calculoDoCustoDaFonteUtilizarPorHectare( 
                              "MAP",CRFosforo.calculoDaQuantidadeDaFonteAplicar(70, 8.59, 1260, TiposDeFontesDeFosforo.MAP), 1260), 0.0);
        assertEquals(62.50173333333333, CRFosforo.calculoDoCustoDaFonteUtilizarPorHectare( 
                              "DAP",CRFosforo.calculoDaQuantidadeDaFonteAplicar(70, 8.59, 1260, TiposDeFontesDeFosforo.DAP), 1260), 0.0);
        assertEquals(156.25433333333334, CRFosforo.calculoDoCustoDaFonteUtilizarPorHectare( 
                              "YOORIN",CRFosforo.calculoDaQuantidadeDaFonteAplicar(70, 8.59, 1260, TiposDeFontesDeFosforo.YOORIN), 1260), 0.0);
        assertEquals(85.22963636363637, CRFosforo.calculoDoCustoDaFonteUtilizarPorHectare( 
                              "FOSFATO_ARAD",CRFosforo.calculoDaQuantidadeDaFonteAplicar(70, 8.59, 1260, TiposDeFontesDeFosforo.FOSFATO_ARAD), 1260), 0.0);
        assertEquals(96.98544827586205, CRFosforo.calculoDoCustoDaFonteUtilizarPorHectare( 
                              "FOSFATO_GAFSA",CRFosforo.calculoDaQuantidadeDaFonteAplicar(70, 8.59, 1260, TiposDeFontesDeFosforo.FOSFATO_GAFSA), 1260), 0.0);
        assertEquals(87.8930625, CRFosforo.calculoDoCustoDaFonteUtilizarPorHectare( 
                              "FOSFATO_DAOUI",CRFosforo.calculoDaQuantidadeDaFonteAplicar(70, 8.59, 1260, TiposDeFontesDeFosforo.FOSFATO_DAOUI), 1260), 0.0);
        assertEquals(117.19075, CRFosforo.calculoDoCustoDaFonteUtilizarPorHectare( 
                              "FOSFATO_PATOS_MINAS",CRFosforo.calculoDaQuantidadeDaFonteAplicar(70, 8.59, 1260, TiposDeFontesDeFosforo.FOSFATO_PATOS_MINAS), 1260), 0.0);
        assertEquals(152.03124324324324, CRFosforo.calculoDoCustoDaFonteUtilizarPorHectare( 
                              "ESCORIA_DE_THOMAS",CRFosforo.calculoDaQuantidadeDaFonteAplicar(70, 8.59, 1260, TiposDeFontesDeFosforo.ESCORIA_DE_THOMAS), 1260), 0.0);
        assertEquals(54.08803846153846, CRFosforo.calculoDoCustoDaFonteUtilizarPorHectare( 
                              "ACIDO_FOSFORICO",CRFosforo.calculoDaQuantidadeDaFonteAplicar(70, 8.59, 1260, TiposDeFontesDeFosforo.ACIDO_FOSFORICO), 1260), 0.0);
        assertEquals(156.25433333333334, CRFosforo.calculoDoCustoDaFonteUtilizarPorHectare( 
                              "MULTIF_MAGNESIANO",CRFosforo.calculoDaQuantidadeDaFonteAplicar(70, 8.59, 1260, TiposDeFontesDeFosforo.MULTIF_MAGNESIANO), 1260), 0.0);
    }
    
  
    @Test
    public void testeTabelaPotassioCorrecao(){
        CorrecaoERecuperacaoDoPotassio CRPostassio =  new CorrecaoERecuperacaoDoPotassio();
        
        // Teste da participação do potássio atual
        assertEquals(1.1636927851047323, CRPostassio.participacaoPercentualAtualDoPotassioNaCTCSolo(0.15), 0.0);
        
        // Teste da participação do potássio na CTC após correção
        assertEquals(3.0, CRPostassio.participacaoPercentualPotassioNaCTCPosCorrecao(3.0), 0.0);
        
        // Teste da participação do potássio na CTC desejada
        assertEquals(3.0, CRPostassio.participacaoPercentualIdealDoPotassioNaCTC(1), 0.0);
        
        // Teste necessidade do potassio
        assertEquals(0.2367, CRPostassio.calculoDaNescessidadeDePotassioAdiconar(0.15,3.0), 0);
        
        // Teste da quantidade aplicar do potássio
        assertEquals(450.5462068965517, CRPostassio.calculoDaQuantidadeDaFonteAplicar(1,0.15,3.0), 0.0);
        assertEquals(502.5323076923077, CRPostassio.calculoDaQuantidadeDaFonteAplicar(2,0.15,3.0), 0.0);
        assertEquals(1187.8036363636363, CRPostassio.calculoDaQuantidadeDaFonteAplicar(3,0.15,3.0), 0.0);
        assertEquals(593.9018181818182, CRPostassio.calculoDaQuantidadeDaFonteAplicar(4,0.15,3.0), 0.0);
        
        // Teste de custo do alqueire
        assertEquals(1126.3655172413794, CRPostassio.calculoDoCustoDaFonteUtilizarPorHectare(1, 2500.00, 
                                                        CRPostassio.calculoDaQuantidadeDaFonteAplicar(1,0.15,3.0), 1), 0.0); 
        assertEquals(1256.3307692307694, CRPostassio.calculoDoCustoDaFonteUtilizarPorHectare(2, 2500.00, 
                                                        CRPostassio.calculoDaQuantidadeDaFonteAplicar(2,0.15,3.0), 1), 0.0);
        assertEquals(2969.509090909091, CRPostassio.calculoDoCustoDaFonteUtilizarPorHectare(3, 2500.00, 
                                                        CRPostassio.calculoDaQuantidadeDaFonteAplicar(3,0.15,3.0), 1), 0.0);
        assertEquals(0.4157312727272727, CRPostassio.calculoDoCustoDaFonteUtilizarPorHectare(4, 2500.00, 
                                                        CRPostassio.calculoDaQuantidadeDaFonteAplicar(4,0.15,3.0), 1), 0.0);
        assertEquals(0.2969509090909091, CRPostassio.calculoDoCustoDaFonteUtilizarPorHectare(4, 2500.00, 
                                                        CRPostassio.calculoDaQuantidadeDaFonteAplicar(4,0.15,3.0), 2), 0.0);
    }    
}
