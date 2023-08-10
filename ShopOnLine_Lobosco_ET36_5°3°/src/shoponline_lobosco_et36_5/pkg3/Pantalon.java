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

    public Pantalon(int talle, String desc, double precio, int cod) {
        super(desc, precio, cod);
        this.talle = talle;
    }

    @Override
    public String toString() {
        return "Pantalon: talle: "+talle+", descripcion: "+desc+", precio: "+precio+", codigo: "+cod;
    }

    public double getPrecio() {
        double precioFinal=0;
        if(desc=="Oxford"){
            precioFinal =precio+(precio*15/100);
        }else if(desc=="Skinny"){
            precioFinal =precio+(precio*25/100);
        }
        else if(desc=="Recto"){
            precioFinal =precio-(precio*15/100);
        }

        return precioFinal;
    }
    
    
}
