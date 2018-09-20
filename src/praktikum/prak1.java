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
public class prak1 {
public int kodebuku;
public String namabuku;
public int jumlahhalaman;

public prak1(int ikodebuku, String inamabuku, int ijumlahhalaman){
kodebuku = ikodebuku;
namabuku = inamabuku;
jumlahhalaman = ijumlahhalaman;
}
public void setkode(int valuebaru){
    kodebuku = valuebaru;
}
public int getkode(){
    return kodebuku;
}
public void setnama(String valuebaru){
    namabuku = valuebaru;
}
public String getnama(){
    return namabuku;
}
public void sethalaman(int valuebaru){
    jumlahhalaman=valuebaru;
}
public int gethalaman(){
    return jumlahhalaman;
}
public void tampilprak1(){
    System.out.println("Nama buku :"+getnama());
    System.out.println("Kode buku :"+getkode());
    System.out.println("Jumlah halaman :"+gethalaman());
}
}