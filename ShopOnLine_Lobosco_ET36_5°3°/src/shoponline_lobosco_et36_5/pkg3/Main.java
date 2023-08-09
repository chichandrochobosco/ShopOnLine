/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shoponline_lobosco_et36_5.pkg3;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Licha
 */
public class Main {
    public static void ingresarProductos(){
        Scanner in = new Scanner(System.in);
        int ingresar=0, op;
        
        do{
            System.out.println("Ingrese que producto va a cargar: 1-accesorio 2-remera 3-pantalon"); 
            op = in.nextInt();
            in.nextLine();
            if(op==1){
                
            }
            
        }while(ingresar==0);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ingresarProductos();
        LocalDate fecha = LocalDate.now();
        Remera p = new Remera("L", "Remera L", 100, 12);
        Cliente c = new Cliente("Carlos");
        Venta v = new Venta(fecha, c );
        
        v.agregarProducto(p);
        v.imprimirFactura();
        
        Venta v2 = new Venta(fecha, c);
        v2.agregarProducto(p);
        v2.imprimirFactura();

    }
    
}
