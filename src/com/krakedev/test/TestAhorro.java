package com.krakedev.test;

import com.krakedev.herencia.Hija;
import com.krakedev.herencia.Hijo;
import com.krakedev.herencia.Padre;

public class TestAhorro {
    public static void main(String[] args) {
        Padre padre = new Padre(5, "Omar", 4);
        Hija hija = new Hija(4, 2, "Juana", 1);
        Hijo hijo = new Hijo(3, 2, "Alex", 2);

        padre.ahorrar(3.9);
        hija.ahorrar(3.9);
        hijo.ahorrar(3.9);

        System.out.println(padre);
        System.out.println(hija);
        System.out.println(hijo);
    }
}