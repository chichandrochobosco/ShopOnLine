/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shoponline_lobosco_et36_5.pkg3;

/**
 *
 * @author Licha
 */
public class Accesorio extends Producto{
    private double peso;
    private String metal;

    public Accesorio(double peso, String metal, String desc, double precio) {
        super(desc, precio);
        this.peso = peso;
        this.metal = metal;
    }

    @Override
    public String toString() {
        return "Accesorio{" + "peso=" + peso + ", metal=" + metal + '}';
    }

    public double getPrecio() {
        return precio;
    }
    
    
}
