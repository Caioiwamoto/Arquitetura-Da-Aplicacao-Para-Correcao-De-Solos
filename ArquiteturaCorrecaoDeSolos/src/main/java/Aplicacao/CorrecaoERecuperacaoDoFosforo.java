
package Aplicacao;


public class CorrecaoERecuperacaoDoFosforo {
    
    double calculoDaQuantidadeFosforoAplicar(
        double teorDeFosforoAtingir, 
        double quantFosforoNoSolo,
        double eficienciaDoFosforo,
        int fonteDeFosforoUtilizar){

            double quantFosforoFaltante = teorDeFosforoAtingir - quantFosforoNoSolo;
            if(quantFosforoFaltante < 0.01){
                return 0;
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
    
    double calculoDoEnxofre(){
        return 0.0;
    }
}
