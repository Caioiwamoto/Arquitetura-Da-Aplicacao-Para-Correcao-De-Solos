/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacao;

public class SoloIdeal {
        private double potassio;
        private double calcio;
        private double magnesio;
        private double fosforo;
        private double enxofre;
        private double aluminio;
        
        public SoloIdeal(int testuraDoSolo){
            switch (testuraDoSolo) {
                case 1:
                    fosforo = 9.0;
                    potassio = 0.35;
                    calcio = 6.0;
                    magnesio = 1.5;
                    enxofre = 9.0;
                    aluminio = 0.0;
                    break;
                case 2:
                    fosforo = 12.0;
                    potassio = 0.25;
                    calcio = 4.0;
                    magnesio = 1.0;
                    enxofre = 6.0;
                    aluminio = 0.0;
                break;
                default:
                    System.out.println("valor da textura do solo incorreto");
                    break;
            }
        }

    public double getPotassio() {
        return potassio;
    }

    public double getCalcio() {
        return calcio;
    }

    public double getMagnesio() {
        return magnesio;
    }

    public double getFosforo() {
        return fosforo;
    }

    public double getEnxofre() {
        return enxofre;
    }

    public double getAluminio() {
        return aluminio;
    }
        
}
