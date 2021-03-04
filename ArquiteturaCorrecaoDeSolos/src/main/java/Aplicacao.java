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
    
    public void valoresideaisdosolo(){
       Soloideal soloideal = new Soloideal();
       
       if(getTexturadosolo() == 1){
           soloideal.setFosforo(9.0);
           soloideal.setPotassio(0.35);
           soloideal.setCalcio(6.0);
           soloideal.setMagnesio(1.5);
           soloideal.setEnxofre(9.0);
           soloideal.setAluminio(0.0);
       }
        if(getTexturadosolo() == 2){
           soloideal.setFosforo(12.0);
           soloideal.setPotassio(0.25);
           soloideal.setCalcio(4.0);
           soloideal.setMagnesio(1.0);
           soloideal.setEnxofre(6.0);
           soloideal.setAluminio(0.0);
       }
        else{
            System.out.println("valor da textura do solo incorreto");
        }
   }
}
    
  
