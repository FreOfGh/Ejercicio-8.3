/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg8.pkg3;


public class ProcesosCilindro extends Figuras {
    private double altura,radio;
    
    public ProcesosCilindro(double altura, double radio){
        this.altura= altura;
        this.radio= radio;
    
    }
    

    @Override
    protected Double volumen() {
                return Math.pow(this.radio,2)*Math.PI;

    }

    @Override
    protected Double superficie() {
                  return volumen()*this.altura;

    }
    
}
