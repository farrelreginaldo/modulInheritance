package Latihan1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Farrel
 */
class Pertama {
    private int a = 10;
    protected void terprotek(){
        System.out.println("Method ini hanya umtuk anaknya");
    }
public void info(){
    System.out.println("a = "+a);
    System.out.println("DIpanggil pada = "+ this.getClass().getName());
}
}
