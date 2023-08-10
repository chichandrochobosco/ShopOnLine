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

    public Accesorio(double peso, String metal, String desc, double precio, int cod) {
        super(desc, precio, cod);
        this.peso = peso;
        this.metal = metal;
    }

    @Override
    public String toString() {
        return "Accesorio: peso: "+peso+", metal: "+metal+" , descripcion: "+desc+", precio: "+precio+", codigo: "+cod;
    }

    public double getPrecio() {
        double precioFinal=0;
        if(metal=="Acero"){
            precioFinal=precio+(precio*10/100);
        }else if(metal=="Plata"){
            precioFinal=precio+(precio*15/100);
        }
        else if(metal=="Oro"){
            precioFinal=precio+(precio*20/100);
        }
        if(peso>=200 ){
            precioFinal=precio+(precio*10/100);
        }else if(precio>=100 && peso<200){
            precioFinal=precio+(precio*6/100);
        }else if(precio>=0 && peso<100){
            precioFinal=precio+(precio*3/100);
        }
        return precioFinal;
    }
    
    
}
