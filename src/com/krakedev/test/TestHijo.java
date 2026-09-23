package com.krakedev.test;
 
import com.krakedev.herencia.Hijo;
 
public class TestHijo {
 
    public static void main(String[] args) {
        Hijo hijo = new Hijo(3, 2, 2);
 
        hijo.imprimir();
        System.out.println(hijo.toString());
    }
}