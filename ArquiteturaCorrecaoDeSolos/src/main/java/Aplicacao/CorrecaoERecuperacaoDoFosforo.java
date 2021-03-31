
package Aplicacao;


public class CorrecaoERecuperacaoDoFosforo {
    private double teorDeFosforoAtingir;
    private double quantFosforoNoSolo;
    private double eficienciaDoFosforo;
    private int fonteDeFosforoUtilizar;
    
    double calculoDaQuantidadeFosforoAplicar(
        double teorDeFosforoAtingir, 
        double quantFosforoNoSolo,
        double eficienciaDoFosforo,
        int fonteDeFosforoUtilizar){
        
            this.teorDeFosforoAtingir = teorDeFosforoAtingir;
            this.quantFosforoNoSolo = quantFosforoNoSolo;
            this.eficienciaDoFosforo = eficienciaDoFosforo;
            this.fonteDeFosforoUtilizar = fonteDeFosforoUtilizar;
      
            double quantFosforoFaltante = teorDeFosforoAtingir - quantFosforoNoSolo;
            
            if(quantFosforoFaltante < 0.01){
                return 0.0;
            }
            else{
                switch(fonteDeFosforoUtilizar){
                    case 1:
                        return ((quantFosforoFaltante*4.58*100)/ (eficienciaDoFosforo/100))/18;
                    case 2:
                        return ((quantFosforoFaltante*4.58*100)/ (eficienciaDoFosforo/100))/41;
                    case 3:
                        return ((quantFosforoFaltante*4.58*100)/ (eficienciaDoFosforo/100))/48;
                    case 4:
                        return ((quantFosforoFaltante*4.58*100)/ (eficienciaDoFosforo/100))/45;
                    case 5:
                        return ((quantFosforoFaltante*4.58*100)/ (eficienciaDoFosforo/100))/18;
                    case 6:
                        return ((quantFosforoFaltante*4.58*100)/ (eficienciaDoFosforo/100))/33;
                    case 7:
                        return ((quantFosforoFaltante*4.58*100)/ (eficienciaDoFosforo/100))/29;
                    case 8:
                        return ((quantFosforoFaltante*4.58*100)/ (eficienciaDoFosforo/100))/32;
                    case 9:
                        return ((quantFosforoFaltante*4.58*100)/ (eficienciaDoFosforo/100))/24;
                    case 10:
                        return ((quantFosforoFaltante*4.58*100)/ (eficienciaDoFosforo/100))/18.5;
                    case 11:
                        return ((quantFosforoFaltante*4.58*100)/ (eficienciaDoFosforo/100))/52;
                    case 12:
                        return ((quantFosforoFaltante*4.58*100)/ (eficienciaDoFosforo/100))/18;
                }
            }
            return 0.0;
    }
    
    double calculoDoCalcioKiloPorHectare(int fonteDeFosforoUtilizar){
        if(calculoDaQuantidadeFosforoAplicar(
                this.teorDeFosforoAtingir,
                this.quantFosforoNoSolo,
                this.eficienciaDoFosforo,
                this.fonteDeFosforoUtilizar) == 0){
                    return 0.0;
        }
        else{
            switch(fonteDeFosforoUtilizar){
                case 1:
                    return calculoDaQuantidadeFosforoAplicar(this.teorDeFosforoAtingir,
                                                             this.quantFosforoNoSolo,
                                                             this.eficienciaDoFosforo,
                                                             this.fonteDeFosforoUtilizar)*0.28;
                case 2:
                    return calculoDaQuantidadeFosforoAplicar(this.teorDeFosforoAtingir,
                                                             this.quantFosforoNoSolo,
                                                             this.eficienciaDoFosforo,
                                                             this.fonteDeFosforoUtilizar)*0.2;
                case 3:
                    return calculoDaQuantidadeFosforoAplicar(this.teorDeFosforoAtingir,
                                                             this.quantFosforoNoSolo,
                                                             this.eficienciaDoFosforo,
                                                             this.fonteDeFosforoUtilizar)*0.09;
                case 4:
                    return calculoDaQuantidadeFosforoAplicar(this.teorDeFosforoAtingir,
                                                             this.quantFosforoNoSolo,
                                                             this.eficienciaDoFosforo,
                                                             this.fonteDeFosforoUtilizar)*0.16;
                case 5:
                    return calculoDaQuantidadeFosforoAplicar(this.teorDeFosforoAtingir,
                                                             this.quantFosforoNoSolo,
                                                             this.eficienciaDoFosforo,
                                                             this.fonteDeFosforoUtilizar)*0.28;
                case 6:
                    return calculoDaQuantidadeFosforoAplicar(this.teorDeFosforoAtingir,
                                                             this.quantFosforoNoSolo,
                                                             this.eficienciaDoFosforo,
                                                             this.fonteDeFosforoUtilizar)*0.52;
                case 7:
                    return calculoDaQuantidadeFosforoAplicar(this.teorDeFosforoAtingir,
                                                             this.quantFosforoNoSolo,
                                                             this.eficienciaDoFosforo,
                                                             this.fonteDeFosforoUtilizar)*0.52;
                case 8:
                    return calculoDaQuantidadeFosforoAplicar(this.teorDeFosforoAtingir,
                                                             this.quantFosforoNoSolo,
                                                             this.eficienciaDoFosforo,
                                                             this.fonteDeFosforoUtilizar)*0.45;
                case 9:
                    return calculoDaQuantidadeFosforoAplicar(this.teorDeFosforoAtingir,
                                                             this.quantFosforoNoSolo,
                                                             this.eficienciaDoFosforo,
                                                             this.fonteDeFosforoUtilizar)*0.28;
                case 10:
                    return calculoDaQuantidadeFosforoAplicar(this.teorDeFosforoAtingir,
                                                             this.quantFosforoNoSolo,
                                                             this.eficienciaDoFosforo,
                                                             this.fonteDeFosforoUtilizar)*0.44;
                case 11:
                    return 0.0;
                case 12:
                    return calculoDaQuantidadeFosforoAplicar(this.teorDeFosforoAtingir,
                                                             this.quantFosforoNoSolo,
                                                             this.eficienciaDoFosforo,
                                                             this.fonteDeFosforoUtilizar)*0.18;
            }
        }
        return 0.0;
    }
    double caluloDoSuperfostatoSimplesKiloPorHectare(){
        return 0.0;
    }
    double calculoDoCustoDoSuperfostatoSimplesPorHectare(){
        return 0.0;
    }
}
