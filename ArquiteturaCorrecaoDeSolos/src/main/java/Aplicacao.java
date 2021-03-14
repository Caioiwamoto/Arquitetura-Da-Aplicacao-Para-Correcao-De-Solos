/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leona
 */
public class Aplicacao {
    private int texturadosolo;

    public int getTexturadosolo() {
        return texturadosolo;
    }

    public void setTexturadosolo(int texturadosolo) {
        this.texturadosolo = texturadosolo;
    }
    
    public Soloideal valoresideaisdosolo( ){
       Soloideal soloideal = new Soloideal();

       if(getTexturadosolo() == 1){
           soloideal.fosforo = 9.0;
           soloideal.potassio = 0.35;
           soloideal.calcio = 6.0;
           soloideal.magnesio = 1.5;
           soloideal.enxofre = 9.0;
           soloideal.aluminio = 0.0;
           
       }
       else if(getTexturadosolo() == 2){
           soloideal.fosforo = 12.0;
           soloideal.potassio = 0.25;
           soloideal.calcio = 4.0;
           soloideal.magnesio = 1.0;
           soloideal.enxofre = 6.0;
           soloideal.aluminio = 0.0;
       }
        else{
            System.out.println("valor da textura do solo incorreto");
        }
       return soloideal;
   }
   public static void main (String[] args){
       
       Aplicacao ap = new Aplicacao();
       ap.setTexturadosolo(1);
       
       System.out.println(ap.getTexturadosolo());
       System.out.println(ap.valoresideaisdosolo().calcio);
   }
}
    
  
