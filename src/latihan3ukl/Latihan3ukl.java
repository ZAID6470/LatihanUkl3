/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3ukl;

/**
 *
 * @author MOKLET-2
 */
public class Latihan3ukl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 10;
        int selisih = 5;
        int nilaiterakhir = 80;
        int updatenilai;
        int totalnilai = 0;
        
        System.out.println("Deret Aritmatika");
        
        for(int i=0; i<3; ++i){
            
            for(int j = 0; j < 5; ++j){
                
                updatenilai = a;
                a += selisih;
                totalnilai += updatenilai;
                        
                System.out.print(" "+updatenilai);
            }
            System.out.println("");
        }
        System.out.println("Hasil = " +totalnilai);
    }
    
}
