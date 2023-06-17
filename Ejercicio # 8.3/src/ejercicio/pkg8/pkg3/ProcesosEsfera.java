/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg8.pkg3;

/**
 *
 * @author 57302
 */
public class ProcesosEsfera extends Figuras{
    private double radio;
    public ProcesosEsfera(double radio){
        this.radio = radio;   
    }

    @Override
    protected Double volumen() {
        return (superficie()*this.radio)/3;
    }

    @Override
    protected Double superficie() {
        return 4*Math.PI*Math.pow(this.radio,2);
    }
    
}
