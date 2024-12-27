/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hengerprogram;

/**
 *
 * @author BiankaBotka
 */
public class TomorHenger extends Henger {

    private double fajsuly;

    public TomorHenger(double sugar, double magassag, double fajsuly) throws Exception {
        super(sugar, magassag);
        if (fajsuly <= 0) {
            throw new Exception("A fajsúly 0-nál nagyobb szám.");
        }

        this.fajsuly = fajsuly;
    }

    public TomorHenger(double sugar, double magassag) throws Exception {
        this(sugar, magassag, 1);
    }

    public double getFajsuly() {
        return fajsuly;
    }

    public double suly()throws Exception  {

//       A fajsúly (jele: γ – görög: gamma, SI mértékegysége: N / m³) az adott térfogategység súlyának mértéke. 
        return super.terfogat() * fajsuly;
    }

    @Override
    public String toString() {
        return "TomorHenger{" + "sugar=" + super.getSugar() + ", magassag=" + super.getMagassag() + ", fajsuly=" + fajsuly + "}";
    }
}
