/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerobjecto;

/**
 *
 * @author marus
 */
public class Mascota {
    String nombre;
    String especie;
    int edad;
    
    public void mostrarInfo(){
        System.out.println("Nombre " + nombre);
        System.out.println("Especie " + especie);
        System.out.println("Edad " + edad);
    };
    public void cumplirAnios(){
        this.edad += 1;
    };
}
