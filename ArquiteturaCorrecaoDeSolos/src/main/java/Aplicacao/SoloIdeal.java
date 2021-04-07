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
        
        public SoloIdeal(int texturaDoSolo){
            switch (texturaDoSolo) {
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
                    this.fosforo = 0.0;
                    this.potassio = 0.0;
                    this.calcio = 0.0;
                    this.magnesio = 0.0;
                    this.enxofre = 0.0;
                    this.aluminio = 0.0;
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
