/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shoponline_lobosco_et36_5.pkg3;

import java.time.LocalDate;

/**
 *
 * @author Licha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* TODO code application logic here
        hacer abstract el getprecio, y si el mismo es el utilizado para formar el precio final de cada producto.
        hacer que se cargen por consola los valores de los productos o crear opciones en el programa, o que haya
        al principio una funcion para agregar productos y que dps se vea el listado de los mismos.
        qur funcion cumple cliente.
        */
        LocalDate fecha = LocalDate.now();
        Cliente c = new Cliente("Carlos");
        Venta v = new Venta(fecha, c );
        
        //v.agregarProducto(p);

    }
    
}
