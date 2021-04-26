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
    
    double[] calculaValoresDosNutrientesAdicionais(TiposDeFontesDeFosforo fonteDeFosforoUtilizar, double calculoDaQuantidadeDaFonteAplicar){
        double valoresNutrientes[] = fonteDeFosforoUtilizar.valoresNutrientesAdicionais();
        if(calculoDaQuantidadeDaFonteAplicar > 0 ){
            valoresNutrientes[0] = valoresNutrientes[0]*calculoDaQuantidadeDaFonteAplicar;
            valoresNutrientes[1] = valoresNutrientes[1]*calculoDaQuantidadeDaFonteAplicar;
            return valoresNutrientes;
               
        } 
        return valoresNutrientes;
    }
    
    String[] nutrientesAdicionais(TiposDeFontesDeFosforo fonteDeFosforoUtilizar){
        return fonteDeFosforoUtilizar.nutrientesAdicionais();
    }

    double calculoDoCustoDaFonteUtilizarPorHectare(String fonteDeFosforoUtilizar, double calculoDaQuantidadeDaFonteAplicar, double valorPorTonelada){
        if(TiposDeFontesDeFosforo.verificaFonte(fonteDeFosforoUtilizar) != false)
            return (calculoDaQuantidadeDaFonteAplicar/1000) * valorPorTonelada;
        return 0.0;
    }
}
