
package shoponline_lobosco_et36_5.pkg3;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Licha
 */
public class Venta {
    private static int cantVentas;
    private int nroFact;
    private ArrayList<Producto> listProd;
    private Cliente cliente;
    private LocalDate fecha;
    
    public Venta(LocalDate fecha){
        this.fecha = fecha;
    }
    
    public void agregarProducto(){
        
    }
    public double calcularImporteTotal(){
        return 0;
    }
    public void imprimirFactura(){
        
    }
    
}

