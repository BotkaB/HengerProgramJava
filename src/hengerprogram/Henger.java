/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hengerprogram;

/**
 *
 * @author BiankaBotka
 */
public class Henger {
    
      
    private static int hengerDarab=0;
    private double sugar;
    private double magassag;

    public Henger(double sugar, double magassag) throws Exception {
       if(sugar<=0 || magassag<=0){
       throw new  Exception("a magasság és a sugár is 0-nál nagyobb szám.");
               }
        this.sugar = sugar;
        this.magassag = magassag;
        hengerDarab++;
    }

    public static int getHengerDarab() {
        return hengerDarab;
    }

    public double getSugar() {
        return sugar;
    }

    public double getMagassag() {
        return magassag;
    }
    
    public double terfogat(){
//        A henger térfogatát úgy számoljuk ki, hogy az alapterületének a nagyságát szorozzuk a henger magasságával
//        Mivel a henger alapja egy kör, ezért:
//        V=r*r*PI*magasság
        
       return Math.pow(sugar, 2)*Math.PI*magassag;  
    
    }
    
     @Override
    public String toString() {
        return "Henger{" + "sugar=" + sugar + ", magassag=" + magassag + "}" ; 
    }
    
}
