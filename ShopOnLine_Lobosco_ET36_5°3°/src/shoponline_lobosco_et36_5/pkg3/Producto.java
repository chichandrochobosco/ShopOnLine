
package shoponline_lobosco_et36_5.pkg3;

/**
 *
 * @author Licha
 */
public class Producto {
    protected String desc;
    protected int cod;
    protected double precio;
    
    public Producto(String desc, double precio){
        this.desc = desc;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "desc=" + desc + ", cod=" + cod + ", precio=" + precio + '}';
    }

    public double getPrecio() {
        return precio;
    }
    
    
    
}
