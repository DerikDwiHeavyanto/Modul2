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
public class Bus {
    public int penumpang;
    public int maxpenumpang;
    public double berat;   
    
    public Bus(int maxPenumpang){
        this.maxpenumpang=maxPenumpang;
       this.maxpenumpang=maxpenumpang;
        penumpang=0;
        this.berat=0;        
    }
      
    public void addPenumpang(int penumpang,int berat){
        int temp;
        temp = this.penumpang+penumpang;
     if (temp >= maxpenumpang){
            System.out.println("Penumpang melebihi kouta");
            
        }else {
            this.penumpang = temp;
            this.berat=this.berat + berat;
        }
    
    }
    public double getAverage(){
       return  this.berat / this.penumpang;
       
        
        
    }
    public void getpasword(int pasword){
        if (pasword == 27){
            System.out.println("pasword benar");
            
        }else{
            System.out.println("pasword salah");
        }
    }
    
    
    
    
    public void cetak(){
        System.out.println("Penumpang Bus sekarang adalah : "+penumpang);
        System.out.println("Penumpang maksimum seeharusnya adalah : "+maxpenumpang);
        System.out.println("Rata-rata berat penumpang awal "+getAverage());
    
    
    
    }

        
    
    }
    

