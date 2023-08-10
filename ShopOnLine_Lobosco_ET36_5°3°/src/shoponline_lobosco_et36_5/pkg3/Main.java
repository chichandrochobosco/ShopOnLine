
package shoponline_lobosco_et36_5.pkg3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Licha
 */
public class Main {
    private static ArrayList<Producto> prod = new ArrayList();

    public static void ingresarProductos(){
        Scanner in = new Scanner(System.in);
        int ingresar=0, op;
        
        do{
            double  precio;
            String  desc;
            int cod;
            System.out.println("Ingrese que producto va a cargar: 1-accesorio 2-remera 3-pantalon"); 
            op = in.nextInt();
            in.nextLine();
            if(op==1){
                double peso;
                String metal;
                
                System.out.println("Ingrese el peso: ");
                peso = in.nextDouble();
                in.nextLine();
                System.out.println("Ingrese el metal: (Acero, Plata, Oro)");
                metal = in.nextLine();
                System.out.println("Ingrese descripcion: ");
                desc = in.nextLine();
                System.out.println("Ingrese precio: ");
                precio = in.nextDouble();
                in.nextLine();
                System.out.println("Ingrese codigo: ");
                cod = in.nextInt();
                in.nextLine();
                Producto p = new Accesorio(peso, metal, desc, precio, cod);
                prod.add(p);
            }else if(op==2){
                String talle;
                System.out.println("Ingrese el talle: (S, M, L, XL)");
                talle = in.nextLine();
                System.out.println("Ingrese descripcion: ");
                desc = in.nextLine();
                System.out.println("Ingrese precio: ");
                precio = in.nextDouble();
                in.nextLine();
                System.out.println("Ingrese codigo: ");
                cod = in.nextInt();
                in.nextLine();
                Producto p = new Remera(talle, desc, precio, cod);
                prod.add(p);
            }else if(op==3){
                int talle;
                System.out.println("Ingrese el talle: (numero)");
                talle = in.nextInt();
                in.nextLine();
                System.out.println("Ingrese descripcion: (Oxford, Skinny, Recto)");
                desc = in.nextLine();
                System.out.println("Ingrese precio: ");
                precio = in.nextDouble();
                in.nextLine();
                System.out.println("Ingrese codigo: ");
                cod = in.nextInt();
                in.nextLine();
                Producto p = new Pantalon(talle, desc, precio, cod);
                prod.add(p);
            }
            System.out.println("Para seguir cargando, ingrese 0, para salir, cualquier otro numero: ");
            ingresar = in.nextInt();
            in.nextLine();
            
        }while(ingresar==0);
        for(int i=0; i<prod.size();i++){
                System.out.println(prod.get(i));
            }
    }
    public static void venta(){
        Scanner in = new Scanner(System.in);
        int ingresar=0, op, codC;
        String nombre;
        ArrayList<Producto> ven = new ArrayList();
        
        
        do{
            System.out.println("Ingrese nombre: ");
            nombre = in.nextLine();
            Cliente c = new Cliente(nombre);
            Venta venta = new Venta(LocalDate.now(), c);
            System.out.println("Productos: ");
            for(int i=0; i<prod.size();i++){
                System.out.println(prod.get(i));
            }
            System.out.println("Ingrese codigo de producto a comprar: ");
            codC = in.nextInt();
            in.nextLine();
            
            System.out.println("Por entrar al for");
            for(Producto p: prod){
                System.out.println("Entro al for de prodcuto en venta, el codigo del producto es: "+p.getCod());
                if(p.getCod() == codC){
                    System.out.println("se entro a la condicion"+p.getPrecio());
                    venta.agregarProducto(p);
                    venta.calcularImporteTotal();
                    
                    // eliminae de array prod
                    //prod.remove(codC);
                }
            }
            
            System.out.println("0-continuar compra otro numero-terminar compra: ");
            ingresar = in.nextInt();
            in.nextLine();
            if(ingresar!=0){
               
               venta.imprimirFactura(); 
            }
        }while(ingresar==0);
        
    }
    
    public static void main(String[] args) {
        ingresarProductos();
        venta();
        /**/
        LocalDate fecha = LocalDate.now();
        Remera p = new Remera("L", "Remera L", 100, 12);
        Cliente c = new Cliente("Carlos");
        //Venta v = new Venta(fecha, c );
        
        //v.agregarProducto(p);
       // v.imprimirFactura();
        
        Venta v2 = new Venta(fecha, c);
        v2.agregarProducto(p);
        v2.imprimirFactura();
        
    }
    
}
