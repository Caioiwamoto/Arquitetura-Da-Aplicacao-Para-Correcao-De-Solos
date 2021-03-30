
public class  EquilibrioCorrecaoCTC {
    public double potassio;
    public double calcio;
    public double magnesio;
    public double fosforo;
    public double enxofre;
    public double aluminio;
    
    public void soloIdeal(int texturaSolo){
        switch (texturaSolo) {
            case 1:
                this.fosforo = 9.0;
                this.potassio = 0.35;
                this.calcio = 6.0;
                this.magnesio = 1.5;
                this.enxofre = 9.0;
                this.aluminio = 0.0;
                break;
            case 2:
                this.fosforo = 12.0;
                this.potassio = 0.25;
                this.calcio = 4.0;
                this.magnesio = 1.0;
                this.enxofre = 6.0;
                this.aluminio = 0.0;
                break;
            default:
                System.out.println("valor da textura do solo incorreto");
                break;
        }
    }
    
    double calculoSCmol(double potassio, double calcio, double magnesio) {
        return potassio + calcio + magnesio;
    }

    double calculoCTCCmol(double potassio,double calcio,double magnesio, double HAl) {
        return potassio + calcio + magnesio + HAl;
    }
    
    double calculoVPercentual(double Scmol, double CTCcmol) {
        if (Scmol > 0 && CTCcmol > 0) {
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
