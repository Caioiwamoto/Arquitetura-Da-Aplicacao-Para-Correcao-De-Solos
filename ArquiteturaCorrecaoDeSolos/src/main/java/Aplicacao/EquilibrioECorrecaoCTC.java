package Aplicacao;


public class  EquilibrioECorrecaoCTC {
    
    double calculoSCmol(double potassio, double calcio, double magnesio) {
        return potassio + calcio + magnesio;
    }

    double calculoCTCCmol(double potassio,double calcio,double magnesio, double HAl) {
        return potassio + calcio + magnesio + HAl;
    }
    
    double calculoVPercentual(double Scmol, double CTCcmol) {
        if (Scmol > 0 || CTCcmol > 0) {
            return Scmol / CTCcmol * 100;
        } 
        return 0.0;
    }

    double calculoMOPercentual(double MO) {
        if (MO > 0) {
            return MO / 10;
        }
        return 0.0;
    }

    double calculoDoCarbono(double MOPercentual) {
        if (MOPercentual > 0) {
            return MOPercentual / 1.72 * 10;
        }
        return 0.0;
    }
    
}
