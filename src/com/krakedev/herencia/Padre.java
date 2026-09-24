package com.krakedev.herencia;

public class Padre implements Cantante {
    private int virtudes;
    private int defectos;
    private double totalAhorros;
    private String nombre;

    public Padre() {}
    
    public Padre(String nombre){
    	this.nombre = nombre;
    }

    public Padre(int virtudes, String nombre, int defectos) {
        this.virtudes = virtudes;
        this.defectos = defectos;
        this.nombre = nombre;
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
    
    public double getTotalAhorros(){
        return totalAhorros;
    }
    
    public void setTotalAhorros(double totalAhorros) {
        this.totalAhorros = totalAhorros;
    }
    
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void imprimir() {
        System.out.println("Virtudes: " + virtudes);
        System.out.println("Defectos: " + defectos);
    }
	
	@Override
	public String toString() {
		return "Padre [virtudes=" + virtudes + ", defectos=" + defectos + ", totalAhorros=" + totalAhorros + ", nombre="
				+ nombre + "]";
	}

	@Override
    public void cantar() {
        System.out.println("Cantando");
    }
	
	public void ahorrar(double monto) {
        totalAhorros += monto;
    }
}

