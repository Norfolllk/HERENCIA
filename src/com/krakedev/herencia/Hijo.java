package com.krakedev.herencia;
 
public class Hijo extends Padre {
 
    private int juguetes;
 
    public Hijo(int virtudes, int defectos, int juguetes) {
        super(virtudes, defectos);
        this.juguetes = juguetes;
    }
 
    public int getJuguetes() {
        return juguetes;
    }
 
    public void setJuguetes(int juguetes) {
        this.juguetes = juguetes;
    }
 
    @Override
    public String toString() {
        return "Hijo [juguetes=" + juguetes + "]" + super.toString();
    }
}
