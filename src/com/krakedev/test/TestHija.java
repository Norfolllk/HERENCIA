package com.krakedev.test;

import com.krakedev.herencia.Hija;

public class TestHija {
    public static void main(String[] args) {
        Hija hija = new Hija(5, 7, "Juana", 1);

        hija.imprimir();

        hija.setVirtudes(8);
        
        hija.imprimir();

        hija.cantar();
        
        System.out.println(hija.toString());
    }
}