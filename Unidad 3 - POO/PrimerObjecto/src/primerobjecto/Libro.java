/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerobjecto;

/**
 *
 * @author marus
 */
public class Libro {
    private String titulo = "Un titulo";
    private String autor = "Un autor";
    private int anioPublicacion = 2023;
    
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public int getAnioPublicacion(){
        return this.anioPublicacion;
    }
    public void setAnoPub(int nuevoAnio){
        if (nuevoAnio > 0 && nuevoAnio <= 2025){
            this.anioPublicacion = nuevoAnio;
        }
    }
    
}
