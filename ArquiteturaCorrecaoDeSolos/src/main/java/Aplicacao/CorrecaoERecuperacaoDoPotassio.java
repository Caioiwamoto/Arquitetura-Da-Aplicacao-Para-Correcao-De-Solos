
package Aplicacao;


public class CorrecaoERecuperacaoDoPotassio {
    private double quantDePotassioNoSolo;
    private double quantDeCalcioNoSolo;
    private double quantDeMagnseioNoSolo;
    private double quantDeAluminioHidrogenioNoSolo;
    private double participacaoPercentualDesejadaDoPotassioNaCTC;
    
    public CorrecaoERecuperacaoDoPotassio(
        double quantDePotassioNoSolo, 
        double quantDeCalcioNoSolo,
        double quantDeMagnseioNoSolo,
        double quantDeAluminioHidrogenioNoSolo,
        double participacaoPercentualDesejadaDoPotassioNaCTC){
            
           this.quantDeAluminioHidrogenioNoSolo = quantDeAluminioHidrogenioNoSolo;
           this.quantDeCalcioNoSolo = quantDeCalcioNoSolo;
           this.quantDeMagnseioNoSolo = quantDeMagnseioNoSolo;
           this.quantDePotassioNoSolo = quantDePotassioNoSolo;
           this.participacaoPercentualDesejadaDoPotassioNaCTC = participacaoPercentualDesejadaDoPotassioNaCTC;
    }
    
    double somaDeTodosNutrientesDoSolo(){
        return this.quantDePotassioNoSolo + 
               this.quantDeMagnseioNoSolo + 
               this.quantDeCalcioNoSolo +
               this.quantDeAluminioHidrogenioNoSolo;
    }
    
    double participacaoPercentualAtualDoPotassioNaCTCSolo(){
        if(this.quantDePotassioNoSolo == 0 || somaDeTodosNutrientesDoSolo() == 0){
            return 0.0;
        }else{
            return quantDePotassioNoSolo / somaDeTodosNutrientesDoSolo()*100;
        }
    }
    
    double participacaoPercentualPotassioNaCTCPosCorrecao(){
        if(this.participacaoPercentualDesejadaDoPotassioNaCTC > 0.001){
            return this.participacaoPercentualDesejadaDoPotassioNaCTC;
        }
        return 0.0;
    }
    
    double participacaoPercentualIdealDoPotassioNaCTC(int texturaDoSolo){
        if(texturaDoSolo == 1 || texturaDoSolo == 2){
            return 3.0;
        }
        return 0.0;
    }
    
    double calculoDaNescessidadeDePotassioAdiconar(){
        if (this.quantDePotassioNoSolo == 0 || this.participacaoPercentualDesejadaDoPotassioNaCTC == 0){
            return 0.0;
        }
        else{
            return (this.quantDePotassioNoSolo * this.participacaoPercentualDesejadaDoPotassioNaCTC) / 
                    (participacaoPercentualAtualDoPotassioNaCTCSolo() - this.quantDePotassioNoSolo);
        }
    }
    
    double quantidadeDePotassioAplicar(int fonteDePotassioUsar){
        if (calculoDaNescessidadeDePotassioAdiconar() < 0.001){
            return 0.0;
        }
        else{
            switch (fonteDePotassioUsar){
                case 1:
                    return ((calculoDaNescessidadeDePotassioAdiconar()* 39.1 * 10 * 2 * 1.2 * 100)/ (85/100)) * 100/58;
                case 2:
                    return ((calculoDaNescessidadeDePotassioAdiconar()* 39.1 * 10 * 2 * 1.2 * 100)/ (85/100)) * 100/52;
                case 3:
                    return ((calculoDaNescessidadeDePotassioAdiconar()* 39.1 * 10 * 2 * 1.2 * 100)/ (85/100)) * 100/22;
                case 4:
                    return ((calculoDaNescessidadeDePotassioAdiconar()* 39.1 * 10 * 2 * 1.2 * 100)/ (85/100)) * 100/44;
            }       
        }
        return 0.0;
    }
}
