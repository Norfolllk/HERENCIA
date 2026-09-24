package com.krakedev.herencia;
 
public class Hija extends Padre {
 
    private int munecas;
 
    public Hija() {
        super();
    }
 
    public Hija(int virtudes, int defectos, String nombre, int munecas) {
        super(virtudes, nombre, defectos);
        this.munecas = munecas;
    }
 
    public int getMunecas() { 
    	return munecas; 
    }
    
    public void setMunecas(int munecas) { 
    	this.munecas = munecas; 
    }
 
    @Override
    public void imprimir() {
        System.out.println("Virtudes: " + getVirtudes() + ". Defectos: " + getDefectos() + ". Munecas: " + munecas);
    }
 
    @Override
    public String toString() {
        return "Hija [munecas=" + munecas + "]" + super.toString();
    }
 
    @Override
    public void cantar() {
        System.out.println("Cantando ...");
    }
}