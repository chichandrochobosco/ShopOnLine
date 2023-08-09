
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
    
    public void agregarProducto(Producto producto){
        listProd.add(producto);
    }
    public double calcularImporteTotal(){
        double importe = 0;
        for(int i =0;i<listProd.size(); i++){
        
        importe += listProd.get(i).getPrecio() ;
    }
        return importe;
    }
    public void imprimirFactura(){
        System.out.println("Factura N° "+(cantVentas+1)+" - " + fecha);
        for(int i =0;i<listProd.size(); i++){
        
        System.out.println(listProd.get(i).toString());  
    }
        System.out.println("Total a pagar: .....$"+calcularImporteTotal());
    }
    
}

