/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;

/**
 *
 * @author ASUS
 */
public class UjiBus {
    public static void main(String[] args){
        //membuat objek busmini dari kelas Bus
        Bus busMini =new Bus();
        //memasukan nilai jumlah penumpang dan penumpang maksimal ke dalam objek
        //busMini
        busMini.penumpang = 5;
        busMini.maxpenumpang = 15 ;
        
        //memanggil method cetak pada kelas Bus
        busMini.cetak();
        
        //menambahkan penumpang pada busMini
        busMini.penumpang =busMini.penumpang + 5;
        //memanggil method cetak pada kelas Bus
        busMini.cetak();
        
        //megurangi penumpang pada busMini
        busMini.penumpang=busMini.penumpang - 2;
        busMini.cetak();
        
        //menambahkan jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang + 8;
        busMini.cetak();
    }
}
