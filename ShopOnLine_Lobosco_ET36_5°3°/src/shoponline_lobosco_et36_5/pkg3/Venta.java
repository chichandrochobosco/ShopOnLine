
package shoponline_lobosco_et36_5.pkg3;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Licha
 */
public class Venta {
    private static int cantVentas = 1090;
    private int nroFact;
    private ArrayList<Producto> listProd;
    private Cliente cliente;
    private LocalDate fecha;
    
    public Venta(LocalDate fecha, Cliente cliente){
        this.fecha = fecha;
        this.cliente = cliente;
        this.listProd = new ArrayList();
    }
    
    public void agregarProducto(){
        
    }
    public double calcularImporteTotal(){
        return 0;
    }
    public void imprimirFactura(){
        
    }
    
}

