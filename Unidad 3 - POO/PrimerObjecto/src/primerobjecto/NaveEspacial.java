/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerobjecto;

/**
 *
 * @author marus
 */
public class NaveEspacial {
    public String nombre;
    public int combustible;
    
    public void setNuevaNave(String nuevoNombre, int unidades){
        this.nombre = nuevoNombre;
        this.combustible = unidades;
    };
    
    public void despegar(){
        System.out.println("Despegando");
    };
    public void avanzar(int distancia){
        if(this.combustible <= 50){
            System.out.println("No es posible avanzar. Debe recargar combustible");
        } else {
            System.out.println("Avanzando " + distancia + "Km");
        }
    };
    public void recargarCombustible(int cantidad){
        if((this.combustible + cantidad)> 100){
            System.out.println("Demasiado combustible");
        } else {
            this.combustible += cantidad;
            System.out.println("Combustible cargado");
        }
    };
    public void mostrarEstado(){
        System.out.println("Nave " + this.nombre + " posee " + this.combustible + " unidades de combustible");
    };
}
