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
public class prakgabungan {
    public static void main(String[] args) {
        prak2extends gab= new prak2extends(0,"",0,"");
        System.out.println("PERPUSTAKAAN SMK TELKOM MALANG");
        gab.setnama("IPA");
        gab.setkode(1);
        gab.sethalaman(90);
        gab.setjenis("buku pleajaran");
        gab.tampilinfo();
        gab.setnama("KOMJARDAS");
        gab.setkode(23);
        gab.sethalaman(159);
        gab.setjenis("buku pelajaran");
        gab.tampilinfo();
    }
}
