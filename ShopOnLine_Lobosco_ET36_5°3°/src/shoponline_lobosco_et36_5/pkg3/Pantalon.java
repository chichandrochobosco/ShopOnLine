/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shoponline_lobosco_et36_5.pkg3;

/**
 *
 * @author Licha
 */
public class Pantalon extends Producto{
    private int talle;

    public Pantalon(int talle, String desc, double precio) {
        super(desc, precio);
        this.talle = talle;
    }

    @Override
    public String toString() {
        return "Pantalon{" + "talle=" + talle + '}';
    }

    public double getPrecio() {
        return precio;
    }
    
    
}
