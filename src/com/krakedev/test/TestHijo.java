package com.krakedev.test;
 
import com.krakedev.herencia.Hijo;
 
public class TestHijo {
 
    public static void main(String[] args) {
        Hijo hijo = new Hijo(3, 2, "Alex", 2);
 
        hijo.imprimir();
        System.out.println(hijo.toString());
        
        hijo.ahorrar(2.5);
        hijo.ahorrar(2.9);
 
        System.out.println(hijo.toString());
    }
}