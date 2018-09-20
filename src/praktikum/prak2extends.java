/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author Farrel
 */
public class prak2extends extends prak1{
    public String jenisbuku;
    public prak2extends (int ikodebuku, String inamabuku, int ijumlahhalaman, String ijenisbuku){
        super(ikodebuku,inamabuku,ijumlahhalaman);
        jenisbuku = ijenisbuku;
    }
    public void setjenis(String valuebaru){
        jenisbuku =valuebaru;   
    }
    public String getjenis(){
        return jenisbuku;
    }
    public void tampilinfo(){
        super.tampilprak1();
        System.out.println("Jenis buku :"+ getjenis());
    }
}
