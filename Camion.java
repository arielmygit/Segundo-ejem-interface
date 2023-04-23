package org.example.ejemplo2;

public class Camion implements Vehiculo{
    private String combustible;
    private Double peso;

    public Camion(String combustible, Double peso) {
        this.combustible = combustible;
        this.peso = peso;
    }

    public Camion() {
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "combustible='" + combustible + '\'' +
                ", peso=" + peso +
                '}';
    }

    public void transportar(){
        System.out.println("Transportando algo...");

    }

    @Override
    public boolean encender() {
        System.out.println("Encenciendo el camion de combustible: "+this.combustible);
        return Math.random() >=0.2;
    }

    @Override
    public boolean apagar() {
        System.out.println("Apagando el camion de combustible: "+this.combustible);
        return Math.random() >=0.05;
    }

    @Override
    public void avanzar() {
        System.out.println("El camion esta avanzando");

    }

    @Override
    public void frenar() {
        System.out.println("Frenando");
    }
}
