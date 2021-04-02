
package Aplicacao;

import org.junit.Test;
import static org.junit.Assert.*;


public class CorrecaoERecuperacaoDoPotassioTest {
        CorrecaoERecuperacaoDoPotassio CRPostassio =  new CorrecaoERecuperacaoDoPotassio(0.15,5.76,1.63,5.35,3.0);
        
        @Test
        public void testParticipacaoPercentualAtualDoPotassioNaCTCSolo(){
            assertEquals(1.1636927851047323, CRPostassio.participacaoPercentualAtualDoPotassioNaCTCSolo(), 0.0);
        }
        
        @Test
        public void testParticipacaoPercentualPotassioNaCTCPosCorrecao(){
            assertEquals(3.0, CRPostassio.participacaoPercentualPotassioNaCTCPosCorrecao(), 0.0);
        }
        
        @Test
        public void testParticipacaoPercentualIdealDoPotassioNaCTC(){
            assertEquals(3.0, CRPostassio.participacaoPercentualIdealDoPotassioNaCTC(1), 0.0);
            assertEquals(3.0, CRPostassio.participacaoPercentualIdealDoPotassioNaCTC(2), 0.0);
        }
        
        @Test
        public void testCalculoDaNescessidadeDePotassioAdiconar(){
            assertEquals(0.2367, CRPostassio.calculoDaNescessidadeDePotassioAdiconar(), 0);
        }
        
        @Test
        public void testQuantidadeDaFonteAplicar(){
            assertEquals(450.5462068965517, CRPostassio.calculoDaQuantidadeDaFonteAplicar(1), 0.0);
            assertEquals(502.5323076923077, CRPostassio.calculoDaQuantidadeDaFonteAplicar(2), 0.0);
            assertEquals(1187.8036363636363, CRPostassio.calculoDaQuantidadeDaFonteAplicar(3), 0.0);
            assertEquals(593.9018181818182, CRPostassio.calculoDaQuantidadeDaFonteAplicar(4), 0.0);
        }
       
        @Test
        public void testCalculoDoCustoDaFonteUtilizarPorHectare(){
            
            assertEquals(1126.3655172413794, CRPostassio.calculoDoCustoDaFonteUtilizarPorHectare(1, 2500.00, 
                                                        CRPostassio.calculoDaQuantidadeDaFonteAplicar(1), 1), 0.0);
                      
            assertEquals(1256.3307692307694, CRPostassio.calculoDoCustoDaFonteUtilizarPorHectare(2, 2500.00, 
                                                        CRPostassio.calculoDaQuantidadeDaFonteAplicar(2), 1), 0.0);
            
            assertEquals(2969.509090909091, CRPostassio.calculoDoCustoDaFonteUtilizarPorHectare(3, 2500.00, 
                                                        CRPostassio.calculoDaQuantidadeDaFonteAplicar(3), 1), 0.0);
            
            assertEquals(0.4157312727272727, CRPostassio.calculoDoCustoDaFonteUtilizarPorHectare(4, 2500.00, 
                                                        CRPostassio.calculoDaQuantidadeDaFonteAplicar(4), 1), 0.0);
            
            assertEquals(0.3, CRPostassio.calculoDoCustoDaFonteUtilizarPorHectare(4, 2500.00, 
                                                        CRPostassio.calculoDaQuantidadeDaFonteAplicar(4), 2), 0.0);
        }
}
