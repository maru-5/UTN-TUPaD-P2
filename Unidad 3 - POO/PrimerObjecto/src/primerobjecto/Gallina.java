/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerobjecto;

/**
 *
 * @author marus
 */
public class Gallina {
    private int idGallina;
    public int edad;
    public int huevosPuestos = 0;
    
    public void ponerhuevo(){
        this.huevosPuestos += 1;
    };
    public void envejecer(){
        this.edad += 1;
    };
    public void mostrarestado(){
        System.out.println("Huevos puestos: " + this.huevosPuestos);
        System.out.println("Edad: " + this.edad);
    };
}
