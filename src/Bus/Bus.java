/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bus;

/**
 *
 * @author ASUS
 */
public class Bus {
    private int penumpang;
    private int maxpenumpang;
    
    //konstruktor kelas bus
    public Bus(int maxpenumpang){
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    
    //method mutator untuk menambahkan penumpang
    public void addPenumpang(int penumpang){
        int temp;
        temp = this.penumpang+penumpang;
        if (temp >= maxpenumpang){
            System.out.println("Penumpang melebihi kouta");
            
        }else {
            this.penumpang = temp;
        }
    }
    public void cetak(){
        System.out.println("Penumpang Bus sekarang adalah : "+penumpang);
        System.out.println("Penumpang maksimum seeharusnya adalah : "+maxpenumpang);
    }
    
}
