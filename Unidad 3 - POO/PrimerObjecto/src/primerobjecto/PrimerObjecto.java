/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerobjecto;

/**
 *
 * @author marus
 */
public class PrimerObjecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Estudiante e1 = new Estudiante();
//        e1.nombre = "Carlos";
//        e1.apellido = "Garcia";
//        e1.curso = "A1";
//        e1.calificacion = 10;
//        
//        e1.mostrarInfo();
//        e1.subirCalificacion(2);
//        e1.bajarCalificacion(4);
//          Mascota m1 = new Mascota();
//          m1.nombre = "Pelusa";
//          m1.especie="gato";
//          m1.edad=5;
//          
//          m1.mostrarInfo();
//          m1.cumplirAnios();
//          m1.mostrarInfo();

//        Libro l1 = new Libro();
//        System.out.println(l1.getAnioPublicacion());
//        l1.setAnoPub(2027);
//        System.out.println(l1.getAnioPublicacion());
//        l1.setAnoPub(2024);
//        System.out.println(l1.getAnioPublicacion());

//        Gallina g1 = new Gallina();
//        Gallina g2 = new Gallina();
//        
//        g1.envejecer();
//        g1.envejecer();
//        g1.ponerhuevo();
//        g2.envejecer();
//        g2.envejecer();
//        g2.envejecer();
//        g2.ponerhuevo();
//        g2.ponerhuevo();
//        g1.mostrarestado();
//        g2.mostrarestado();

    NaveEspacial n1 = new NaveEspacial();
    n1.setNuevaNave( "WW1", 50);
    n1.avanzar(60);
    n1.recargarCombustible(20);
    n1.avanzar(60); 
    n1.mostrarEstado();
        
    }
    
}
