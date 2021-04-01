
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
        public void testQuantidadeDePotassioAplicar(){
            assertEquals(450.5462068965517, CRPostassio.quantidadeDePotassioAplicar(1), 0.0);
            assertEquals(502.5323076923077, CRPostassio.quantidadeDePotassioAplicar(2), 0.0);
            assertEquals(1187.8036363636363, CRPostassio.quantidadeDePotassioAplicar(3), 0.0);
            assertEquals(593.9018181818182, CRPostassio.quantidadeDePotassioAplicar(4), 0.0);
        }
        
}
