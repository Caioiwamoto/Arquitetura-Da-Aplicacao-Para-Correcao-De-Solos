package Aplicacao;

public class  EquilibrioECorrecaoCTC {
    private final double potassio;
    private final double calcio;
    private final double magnesio;
    private final double hidrogenioAluminio;
    private final double MO;
    
    public EquilibrioECorrecaoCTC (double potassio, double calcio, double magnesio, double hidrogenioAluminio, double MO){
        this.potassio = potassio;
        this.calcio = calcio;
        this.magnesio = magnesio;
        this.hidrogenioAluminio = hidrogenioAluminio;
        this.MO = MO;
    }
    
    double calculoSCmol() {
        return this.potassio + this.calcio + this.magnesio;
    }

    double calculoCTCCmol() {
        return this.potassio + this.calcio + this.magnesio + this.hidrogenioAluminio;
    }
    
    double calculoVPercentual() {
        if (calculoSCmol() > 0 && calculoCTCCmol() > 0) {
            return calculoSCmol() / calculoCTCCmol() * 100;
        } 
        return 0.0;
    }

    double calculoMOPercentual() {
        if (this.MO > 0) {
            return this.MO / 10;
        }
        return 0.0;
    }

    double calculoDoCarbono() {
        if (calculoMOPercentual() > 0) {
            return calculoMOPercentual() / 1.72 * 10;
        }
        return 0.0;
    }
    
}
