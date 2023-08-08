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
        return "Accesorio{" + "peso=" + peso + ", metal=" + metal + '}';
    }

    public double getPrecio() {
        if(metal=="Acero"){
            precio+=(precio*10/100);
        }else if(metal=="Plata"){
            precio+=(precio*15/100);
        }
        else if(metal=="Oro"){
            precio+=(precio*20/100);
        }
        if(peso>=200 ){
            precio+=(precio*10/100);
        }else if(precio>=100 && peso<200){
            precio+=(precio*6/100);
        }else if(precio>=0 && peso<100){
            precio+=(precio*3/100);
        }
            
        return precio;
    }
    
    
}
