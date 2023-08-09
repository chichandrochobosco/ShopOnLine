
package shoponline_lobosco_et36_5.pkg3;

/**
 *
 * @author Licha
 */
public class Remera extends Producto{
    private String talle;

    public Remera(String talle, String desc, double precio, int cod) {
        super(desc, precio, cod);
        this.talle = talle;
    }

    @Override
    public String toString() {
        return "Remera: "+"talle = "+talle;
    }

    public double getPrecio() {
        double precioFinal=0;
        if(talle=="S"){
            precioFinal=precio+(precio*5/100);
        }else if(talle=="M"){
            precioFinal=precio+(precio*10/100);
        }
        else if(talle=="L"){
            precioFinal=precio+(precio*15/100);
        }else if(talle=="XL"){
            precioFinal=precio+(precio*20/100);
        }

        return precioFinal;
    }
    
    
    
    
}
