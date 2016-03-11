package boletin20;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author agomezcastro
 */
public class Libros {
    private String titulo;
    private String autor;
    private String ISBN;
    private float prezo;
    private int unidades;
    
    ArrayList <Libros> libro= new ArrayList <Libros>();
    
    public void listaLibros(){
        Libros lb1= new Libros();
        Libros lb2= new Libros();
        Libros lb3= new Libros();
        Libros lb4= new Libros();
        Libros lb5= new Libros();
        
        libro.add(lb1);
        libro.add(lb2);
        libro.add(lb3);
        libro.add(lb4);
        libro.add(lb5);
        
    }
    
    public void engadirLibro(){
        titulo = JOptionPane.showInputDialog("Introduzca titulo do libro");
        autor = JOptionPane.showInputDialog("Introduzca el autor");
        ISBN = JOptionPane.showInputDialog("introduzca el ISBN");
        prezo = Float.parseFloat(JOptionPane.showInputDialog("introduzca el precio"));
        unidades = Integer.parseInt(JOptionPane.showInputDialog("introduzca unidades disponibles"));
        System.out.println("Se ha añadido un libro");
    }
    
    public void venderLibro(){
        libro.remove(this);
        System.out.println("Se ha vendido un libro de la lista");
        for(int i=0; i<libro.size();i++)
            if(unidades==0)
                System.out.println("Se ha eliminado el libro de la lista");
    }
    
    public void amosar(){
        System.out.println(libro);
    }
    
    public void consultarLibro(Libros k){
        JOptionPane.showInputDialog("Introduce o nº do libro que queiras consultar"+ k);
    }
    
}
