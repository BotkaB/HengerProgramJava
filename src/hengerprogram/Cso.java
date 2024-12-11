/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hengerprogram;

/**
 *
 * @author BiankaBotka
 */
public class Cso extends TomorHenger {
   private double falvastagsag;

    public Cso(double sugar, double magassag, double fajsuly, double falvastagsag) throws Exception {
        super(sugar, magassag, fajsuly);
          if (falvastagsag <= 0) {
            throw new Exception("A falvastagság 0-nál nagyobb szám.");
        }
        this.falvastagsag=falvastagsag;
    }
    
    public Cso(double sugar, double magassag,double falvastagsag) throws Exception{
     this(sugar, magassag, 1, falvastagsag);
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }
    
    
  @Override
   public double terfogat(){
       
       //Az eredeti térfogatból ki kell vonni a "lukas részt." De a térfogat az ősben van.
       //A lukas rész köre a sugár-falvastagság. De a sugár az ősben van.
       //Innen már ugyanaz, mint a Hengerben van, de a magasság is az ősben van.
        return super.terfogat()-(Math.pow((super.getSugar()-falvastagsag),2)*Math.PI*super.getMagassag());
    }
   
    @Override
    public String toString() {
        return "Cso{"+ "sugar=" + super.getSugar() + ", magassag=" + super.getMagassag()  + ", fajsuly=" + super.getFajsuly()  + ", falvastagsag=" + falvastagsag + "}";
    }

  
   
}
