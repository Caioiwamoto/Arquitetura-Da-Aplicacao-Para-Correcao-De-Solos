package Aplicacao;

public class CorrecaoERecuperacaoDoPotassio {
    
    EquilibrioECorrecaoCTC ECCTC = new EquilibrioECorrecaoCTC(0.15,5.76,1.63,5.35,30.7);
    
    double participacaoPercentualAtualDoPotassioNaCTCSolo(double quantDePotassioNoSolo){
        if(quantDePotassioNoSolo > 0 && ECCTC.calculoCTCCmol() > 0){
            return quantDePotassioNoSolo / ECCTC.calculoCTCCmol()*100;
        }
        return 0.0;
    }
    
    double participacaoPercentualPotassioNaCTCPosCorrecao(double participacaoPercentualDesejadaDoPotassioNaCTC){
        if(participacaoPercentualDesejadaDoPotassioNaCTC > 0.001){
            return participacaoPercentualDesejadaDoPotassioNaCTC;
        }
        return 0.0;
    }
    
    double participacaoPercentualIdealDoPotassioNaCTC(int texturaDoSolo){
        if(texturaDoSolo == 1 || texturaDoSolo == 2){
            return 3.0;
        }
        return 0.0;
    }
    
    double calculoDaNescessidadeDePotassioAdiconar(double quantDePotassioNoSolo, double participacaoPercentualDesejadaDoPotassioNaCTC){
        if (quantDePotassioNoSolo > 0 && 
            participacaoPercentualAtualDoPotassioNaCTCSolo(quantDePotassioNoSolo) > quantDePotassioNoSolo){
    
            return quantDePotassioNoSolo * participacaoPercentualDesejadaDoPotassioNaCTC / 
                    participacaoPercentualAtualDoPotassioNaCTCSolo(quantDePotassioNoSolo) - quantDePotassioNoSolo;
        } 
        return 0.0;
    }
    
    double calculoDaQuantidadeDaFonteAplicar(int fonteDePotassioUsar, double quantDePotassioNoSolo, double participacaoPercentualDesejadaDoPotassioNaCTC ){
        if (calculoDaNescessidadeDePotassioAdiconar(quantDePotassioNoSolo,participacaoPercentualDesejadaDoPotassioNaCTC) > 0.001){
            switch (fonteDePotassioUsar){
                case 1 : {return (calculoDaNescessidadeDePotassioAdiconar(quantDePotassioNoSolo,participacaoPercentualDesejadaDoPotassioNaCTC)* 39.1 * 10 * 2 * 1.2 * 100/85 * 100/58.0);}
                case 2 : {return (calculoDaNescessidadeDePotassioAdiconar(quantDePotassioNoSolo,participacaoPercentualDesejadaDoPotassioNaCTC)* 39.1* 10 * 2 * 1.2 * 100/85 * 100/52.0);}
                case 3 : {return (calculoDaNescessidadeDePotassioAdiconar(quantDePotassioNoSolo,participacaoPercentualDesejadaDoPotassioNaCTC)* 39.1 * 10 * 2 * 1.2 * 100/85 * 100/22.0);}
                case 4 : {return (calculoDaNescessidadeDePotassioAdiconar(quantDePotassioNoSolo,participacaoPercentualDesejadaDoPotassioNaCTC)* 39.1 * 10 * 2 * 1.2 * 100/85 * 100/44.0);}
            }      
        }
        return 0.0;
    }
    
    double calculoDoCustoDaFonteUtilizarPorHectare(
            int fonteDePotassioUsar, 
            double valorPorTonelada,
            double calculoDaQuantidadeDaFonteAplicar,
            int texturaSolo){
        
        if(fonteDePotassioUsar >= 1 && fonteDePotassioUsar <= 3){
            return (calculoDaQuantidadeDaFonteAplicar/1000) * valorPorTonelada;
        }
        if(fonteDePotassioUsar == 4){
            switch (texturaSolo) {
                case 1 :{return 0.7*calculoDaQuantidadeDaFonteAplicar/1000;}
                case 2 :{return 0.5*calculoDaQuantidadeDaFonteAplicar/1000;}
                default :{return 0.0;}
            }
        }
        return 0.0;
    }
}
