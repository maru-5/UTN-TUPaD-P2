/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp6;

/**
 *
 * @author marus
 */
public class TP6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Crear al menos cinco productos con diferentes categorías y agregarlos al inventario.
        Producto p1 = new Producto("1", "Notebook",2500.0, 10, CategoriaProducto.ELECTRONICA);
        Producto p2 = new Producto("2", "Arroz",50.0, 10, CategoriaProducto.ALIMENTOS);
        Producto p3 = new Producto("3", "Remera",200.0, 10, CategoriaProducto.ROPA);
        Producto p4 = new Producto("4", "Mesa",1500.0, 10, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("5", "Silla",1000.0, 10, CategoriaProducto.HOGAR);
        
        Inventario inv = new Inventario();
        /*
        inv.agregarProducto(p1);
        inv.agregarProducto(p2);
        inv.agregarProducto(p3);
        inv.agregarProducto(p4);
        inv.agregarProducto(p5);
        
        //2. Listar todos los productos mostrando su información y categoría.
        System.out.println("-------2-------");
        inv.listarProductos();
        //3. Buscar un producto por ID y mostrar su información.
        System.out.println("-------3-------");
        System.out.println(inv.buscarProductoPorId("4"));
        //4. Filtrar y mostrar productos que pertenezcan a una categoría específica.
        System.out.println("-------4-------");
        System.out.println(inv.filtrarPorCategoria(CategoriaProducto.ROPA));
        //5. Eliminar un producto por su ID y listar los productos restantes.
        System.out.println("-------5-------");
        inv.eliminarProducto("1");
        inv.listarProductos();
        //6. Actualizar el stock de un producto existente.
        System.out.println("-------6-------");
        inv.actualizarStock("2", 25);
        //7. Mostrar el total de stock disponible.
        System.out.println("-------7-------");
        System.out.println(inv.buscarProductoPorId("2"));
        //8. Obtener y mostrar el producto con mayor stock.
        System.out.println("-------8-------");
        System.out.println(inv.obtenerProductoConMayorStock());
        //9. Filtrar productos con precios entre $1000 y $3000.
        System.out.println("-------9-------");
        System.out.println(inv.filtrarProductosPorPrecio(1000.0, 3000.0));
        //10. Mostrar las categorías disponibles con sus descripciones
        System.out.println("-------10-------");
        System.out.println(inv.mostrarCategoriasDisponibles());
        
        
        //Ejercicio Propuesto 2: Biblioteca y Libros
        //1. Creamos una biblioteca.
        Biblioteca biblioteca1 = new Biblioteca("Una biblioteca");
        //2. Crear al menos tres autores
        Autor a1 = new Autor("1","Pepe", "Argentino");
        Autor a2 = new Autor("2","Juan", "Chileno");
        Autor a3 = new Autor("3","Carlos", "Venezolano");
        //3. Agregar 5 libros asociados a alguno de los Autores a la biblioteca.
        biblioteca1.agregarLibro("1", 2000, "Libro 1", a1);
        biblioteca1.agregarLibro("2", 2010, "Libro 2",a2);
        biblioteca1.agregarLibro("3", 2020, "Libro 3",a3);
        biblioteca1.agregarLibro("4", 1998, "Libro 4",a1);
        biblioteca1.agregarLibro("5", 2009, "Libro 5",a2);
        
        //4. Listar todos los libros con su información y la del autor.
        System.out.println("-----4-----");
        biblioteca1.listarLibros();
        //5. Buscar un libro por su ISBN y mostrar su información.
        System.out.println("-----5-----");
        System.out.println(biblioteca1.buscarLibroPorIsbn("4"));
        //6. Filtrar y mostrar los libros publicados en un año específico.
        System.out.println("-----6-----");
        System.out.println(biblioteca1.filtrarLibrosPorAnio(2009));
        //7. Eliminar un libro por su ISBN y listar los libros restantes.
        biblioteca1.eliminarLibro("3");
        //8. Mostrar la cantidad total de libros en la biblioteca.
        System.out.println("-----8-----");
        System.out.println(biblioteca1.obtenerCantidadLibros());
        //9. Listar todos los autores de los libros disponibles en la biblioteca.
        System.out.println("-----9-----");
        System.out.println(biblioteca1.mostrarAutoresDisponibles());
*/
        //Universidad, Profesor y Curso (bidireccional 1a N)
        //1. Crear al menos 3 profesores y 5 cursos.
        Profesor profe1 = new Profesor("1", "Pepe", "Programacion");
        Profesor profe2 = new Profesor("2", "Jose", "Estadistica");
        Profesor profe3 = new Profesor("3", "Manuel", "Base de datos");
        
        Curso curso1 = new Curso("qwe","Programacion 1");
        Curso curso2 = new Curso("rty","Programacion 2");
        Curso curso3 = new Curso("asd","Estadistica 1");
        Curso curso4 = new Curso("fgh","Estadistica 1");
        Curso curso5 = new Curso("zxc","Base de datos 1");
        //2. Agregar profesores y cursos a la universidad.
        Universidad uni = new Universidad("unaUni");
        uni.agregarProfesor(profe1);
        uni.agregarProfesor(profe2);
        uni.agregarProfesor(profe3);
        uni.agregarCurso(curso1);
        uni.agregarCurso(curso2);
        uni.agregarCurso(curso3);
        uni.agregarCurso(curso4);
        uni.agregarCurso(curso5);
        //3. Asignar profesores a cursos usando asignarProfesorACurso(...).
        uni.asignarProfesorACurso("qwe", "3");
        uni.asignarProfesorACurso("rty", "2");
        uni.asignarProfesorACurso("asd", "3");
        uni.asignarProfesorACurso("fgh", "1");
        uni.asignarProfesorACurso("zxc", "2");
        //4. Listar cursos con su profesor y profesores con sus cursos.
        System.out.println("------------4-----------");
        System.out.println("------------cursos-----------");
        uni.listarCursos();
        System.out.println("------------profesores-----------");
        uni.listarProfesores();
        //5. Cambiar el profesor de un curso y verificar que ambos lados quedan
        //sincronizados.
        System.out.println("------------5-----------");
        uni.asignarProfesorACurso("zxc", "1");
        System.out.println("------------cursos-----------");
        uni.listarCursos();
        System.out.println("------------profesores-----------");
        uni.listarProfesores();
        //6. Remover un curso y confirmar que ya no aparece en la lista del profesor.
        System.out.println("------------6-----------");
        uni.eliminarCurso("fgh");
        System.out.println("------------cursos-----------");
        uni.listarCursos();
        System.out.println("------------profesores-----------");
        uni.listarProfesores();
        //7. Remover un profesor y dejar profesor = null,
        System.out.println("------------7-----------");
        uni.eliminarProfesor("1");
        System.out.println("------------cursos-----------");
        uni.listarCursos();
        System.out.println("------------profesores-----------");
        uni.listarProfesores();
        //8. Mostrar un reporte: cantidad de cursos por profesor.
        System.out.println("------------8-----------");
        uni.cursosPorProfesor();
    }
      
}