package com.krakedev.herencia;

public class Padre implements Cantante {
    private int virtudes;
    private int defectos;

    public Padre() {}

    public Padre(int virtudes, int defectos) {
        this.virtudes = virtudes;
        this.defectos = defectos;
    }

    public int getVirtudes() {
        return virtudes;
    }

    public void setVirtudes(int virtudes) {
        this.virtudes = virtudes;
    }

    public int getDefectos() {
        return defectos;
    }

    public void setDefectos(int defectos) {
        this.defectos = defectos;
    }

    public void imprimir() {
        System.out.println("Virtudes: " + virtudes);
        System.out.println("Defectos: " + defectos);
    }

    @Override
    public String toString() {
        return "Padre [virtudes=" + virtudes + ", defectos=" + defectos + "]";
    }

    @Override
    public void cantar() {
        System.out.println("Cantando");
    }
}
