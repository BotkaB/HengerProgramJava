/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hengerprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author BiankaBotka
 */
public class HengerProgram {

    private List<Henger> hengerek;



    public HengerProgram() throws Exception{
        hengerek=new ArrayList<>();
        hengerek.add(new Henger(5, 5));
        hengerek.add(new TomorHenger(3, 7));
        hengerek.add(new TomorHenger(5, 8, 5.2));
        hengerek.add(new Cso(3.9, 6.7, 2.8, 4.3));
    }

    private double atlagTerfogat() {
        double osszeg = 0;
        for (Henger henger : lista()) {
            osszeg += henger.terfogat();
        }
        return osszeg / Henger.getHengerDarab();
    }

    private double csovekSulya() {
        double suly = 0;
        for (Henger cso : lista()) {
            if (cso instanceof Cso) {
                suly += ((Cso) cso).suly();
            }
        }
        return suly;
    }

     private List<Henger> lista() {
        return Collections.unmodifiableList(hengerek);
    }

    public void run() {
        System.out.println("Átlag térfogat="+atlagTerfogat());
        System.out.println("Csövek súlya="+csovekSulya());
        //System.out.println("Hengerek lista:"+lista());
        System.out.println("Hengerek lista:");
        for(int i=0; i<Henger.getHengerDarab();i++){
            System.out.println(lista().get(i));
        }
        
            
    }

  
}
