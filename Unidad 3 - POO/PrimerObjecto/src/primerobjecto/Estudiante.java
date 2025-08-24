/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerobjecto;

/**
 *
 * @author marus
 */
public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    int calificacion;
    
    public void mostrarInfo(){
        System.out.println("Nombre " + nombre);
        System.out.println("Apellido " + apellido);
        System.out.println("Curso " + curso);
        System.out.println("Calificación " + calificacion);
    };
    public void subirCalificacion(int puntos){
        this.calificacion += puntos;
        System.out.println("Nueva calificación " + calificacion);
    };
    public void bajarCalificacion(int puntos){
        this.calificacion -= puntos;
        System.out.println("Nueva calificación " + calificacion);
    };

}
