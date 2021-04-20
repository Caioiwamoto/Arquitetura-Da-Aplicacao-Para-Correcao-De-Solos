package Aplicacao;

public class CorrecaoERecuperacaoDoFosforo {
    
    double calculoDaQuantidadeDaFonteAplicar(
        double teorDeFosforoAtingir, 
        double quantFosforoNoSolo,
        double eficienciaDoFosforo,
        TiposDeFontesDeFosforo fonteDeFosforoUtilizar){
    
        double quantFosforoFaltante = teorDeFosforoAtingir - quantFosforoNoSolo;
            
        if(quantFosforoFaltante > 0.01 && eficienciaDoFosforo > 0){
            switch(fonteDeFosforoUtilizar){
                case SUPERFOSFATO_SIMPLES,
                     YOORIN,
                     MULTIF_MAGNESIANO -> {return ((quantFosforoFaltante*4.58*100)/ (eficienciaDoFosforo/100))/18;}
                case SUPERFOSFATO_TRIPLO -> {return ((quantFosforoFaltante*4.58*100)/ (eficienciaDoFosforo/100))/41;}
                case MAP -> {return ((quantFosforoFaltante*4.58*100)/ (eficienciaDoFosforo/100))/48;}
                case DAP -> {return ((quantFosforoFaltante*4.58*100)/ (eficienciaDoFosforo/100))/45;}
                case FOSFATO_ARAD -> {return ((quantFosforoFaltante*4.58*100)/ (eficienciaDoFosforo/100))/33;}
                case FOSFATO_GAFSA -> {return ((quantFosforoFaltante*4.58*100)/ (eficienciaDoFosforo/100))/29;}
                case FOSFATO_DAOUI-> {return ((quantFosforoFaltante*4.58*100)/ (eficienciaDoFosforo/100))/32;}
                case FOSFATO_PATOS_MINAS-> {return ((quantFosforoFaltante*4.58*100)/ (eficienciaDoFosforo/100))/24;}
                case ESCORIA_DE_THOMAS -> {return ((quantFosforoFaltante*4.58*100)/ (eficienciaDoFosforo/100))/18.5;}
                case ACIDO_FOSFORICO -> {return ((quantFosforoFaltante*4.58*100)/ (eficienciaDoFosforo/100))/52;}
            }
        }
        return 0.0;
    }
    
    double calculoDoCalcioKiloPorHectare(TiposDeFontesDeFosforo fonteDeFosforoUtilizar, double calculoDaQuantidadeDaFonteAplicar){
        if(calculoDaQuantidadeDaFonteAplicar > 0){
            switch(fonteDeFosforoUtilizar){
                case SUPERFOSFATO_SIMPLES, 
                     YOORIN, 
                     FOSFATO_PATOS_MINAS-> {return calculoDaQuantidadeDaFonteAplicar*0.28;}
                case SUPERFOSFATO_TRIPLO -> {return calculoDaQuantidadeDaFonteAplicar*0.2;}
                case MAP -> {return calculoDaQuantidadeDaFonteAplicar*0.09;}
                case DAP -> {return calculoDaQuantidadeDaFonteAplicar*0.16;}
                case FOSFATO_ARAD,
                     FOSFATO_GAFSA -> {return calculoDaQuantidadeDaFonteAplicar*0.52;}
                case FOSFATO_DAOUI-> {return calculoDaQuantidadeDaFonteAplicar*0.45;}
                case ESCORIA_DE_THOMAS-> {return calculoDaQuantidadeDaFonteAplicar*0.44;}
                case ACIDO_FOSFORICO -> {return 0.0;}
                case MULTIF_MAGNESIANO-> {return calculoDaQuantidadeDaFonteAplicar*0.18;}
            }
        }
        return 0.0;
    }
    
    double calculoDoEnxofreKiloPorHectare(TiposDeFontesDeFosforo fonteDeFosforoUtilizar, double calculoDaQuantidadeDaFonteAplicar ){
        if(calculoDaQuantidadeDaFonteAplicar > 0){
            switch(fonteDeFosforoUtilizar){
                case SUPERFOSFATO_SIMPLES -> {return calculoDaQuantidadeDaFonteAplicar*0.1;}
                case YOORIN-> {return calculoDaQuantidadeDaFonteAplicar*0.15;}
                case MULTIF_MAGNESIANO-> {return calculoDaQuantidadeDaFonteAplicar*0.11;}
            }       
        }
        return 0.0;
    }
    
    double calculoDoCustoDaFonteUtilizarPorHectare(int fonteDeFosforoUtilizar, double calculoDaQuantidadeDaFonteAplicar, double valorPorTonelada){
        if(fonteDeFosforoUtilizar >= 1 && fonteDeFosforoUtilizar <= 12){
            return (calculoDaQuantidadeDaFonteAplicar/1000) * valorPorTonelada;
        }
        return 0.0;
    }
}
