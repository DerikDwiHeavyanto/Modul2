/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author ASUS
 */
public class Ujibus {
   public static void main(String[] args){ 
    Bus bus = new Bus(40);
    bus.getpasword(27);
    bus.addPenumpang(12,55);
    bus.addPenumpang(15,75);
    bus.cetak();
    bus.getAverage();
    
 
    
   }
}
