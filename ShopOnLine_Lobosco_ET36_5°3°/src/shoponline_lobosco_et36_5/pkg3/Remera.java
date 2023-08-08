
package shoponline_lobosco_et36_5.pkg3;

/**
 *
 * @author Licha
 */
public class Remera extends Producto{
    private char talle;

    public Remera(char talle, String desc, double precio) {
        super(desc, precio);
        this.talle = talle;
    }

    @Override
    public String toString() {
        return "Remera{" + "talle=" + talle + '}';
    }

    public double getPrecio() {
        return precio;
    }
    
    
    
    
}
