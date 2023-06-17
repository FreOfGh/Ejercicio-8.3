/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg8.pkg3;

import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Diseño extends JFrame implements ActionListener{
    private JComboBox listaFiguras;
    private int item;
    private JTable tablaFiguras;
    private boolean statusCilindro, statusTriangulo,statusEsfera;
    private JButton buttonCalcular,buttonCambiarColor;
    private JTextField  textFieldRadioEsfera, textFieldApotemaTriangulo, textFieldAlturaTriangulo, textFieldBaseTriangulo, textFieldAlturaCilindro, textFieldRadioCilindro; 
    private JLabel labelRadioEsfera, labelApotemaTriangulo, labelAlturaTriangulo, labelBaseTriangulo, labelAlturaCilindro,labelRadioCilindro;
    private Container contenedorEsfera, contenedorTriangulo, contenedorCilindro, contenedorGeneral;  
    public JLabel imagenes;
    public Diseño(){
         this.setLayout(null);
         this.setTitle("Figuras");
         this.setBackground(Color.blue);
         this.setSize(800, 530);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
    }
         
        

         
    
    
    
    public void diseñogeneral(){
        
        

        
        this.listaFiguras = new JComboBox();
        this.listaFiguras.addItem("Esfera");
        this.listaFiguras.addItem("Triangulo");
        this.listaFiguras.addItem("Cilindro");
        this.listaFiguras.setBounds(100,50,600,50);
        this.listaFiguras.addActionListener(this);
        
        this.contenedorGeneral =getContentPane();
        this.contenedorGeneral.setLayout(null);
        
        
        this.buttonCalcular =  new JButton("Calcular");
        this.buttonCalcular.addActionListener(this);

        this.buttonCalcular.setBounds(550, 440, 200, 20);
        
        this.buttonCambiarColor =  new JButton("Cambiar color");
        this.buttonCambiarColor.addActionListener(this);

        this.buttonCambiarColor.setBounds(100, 440, 200, 20);
        
        
        Object[][] data = {
            {"Esfera", "Superficie",0 },
            {"Esfera", "Volumen",0},
            {"Piramide", "Superficie",0},
            {"Piramide", "Volumen",0},
            {"Cilindro","Superficie",0},    
            { "Cilindro","Volumen",0}
        };

        String[] columnNames = {"Figura","Tipo", "Valor"};

        this.tablaFiguras = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(this.tablaFiguras);
        this.tablaFiguras.setFillsViewportHeight(true);

        scrollPane.setBounds(100, 310, 600, 100);
        this.contenedorGeneral.add(scrollPane);
        this.contenedorGeneral.add(this.buttonCambiarColor);

        this.contenedorGeneral.add(buttonCalcular);
        this.contenedorGeneral.add(listaFiguras);
        
        
        
        
        this.setVisible(true);
    }

    public void CambiarColor(){
        JColorChooser ventanaDeColores =new JColorChooser();
        Color color = ventanaDeColores.showDialog(null, "Seleccione un Color", Color.gray);
        this.contenedorGeneral.setBackground(color);
    
    }    
    public void DiseñoEsfera(){
        
        
        
        this.contenedorEsfera =getContentPane(); 
        this.contenedorEsfera.setLayout(null);
        
        
        this.labelRadioEsfera =  new JLabel("Radio de la esfera");
        this.labelRadioEsfera.setBounds(300, 100 , 400,100);
        
        
        this.textFieldRadioEsfera =  new JTextField();
        this.textFieldRadioEsfera.setBounds(100, 170, 600, 20);
        this.contenedorEsfera.add(labelRadioEsfera);
        this.contenedorEsfera.add(textFieldRadioEsfera);
                
        
        this.statusEsfera = true;  
        
        if (this.statusCilindro == true) {
             this.OcultarCilindro();
        }

        if (this.statusTriangulo == true) {
             this.OcultartTriangulo();
        }
        this.contenedorEsfera.setVisible(true);
        
        this.item =0 ;
                
        
    
    }
    
    
    public void OcultarEsfera(){
        this.contenedorEsfera.setVisible(false);
        this.labelRadioEsfera.setVisible(false);
        this.textFieldRadioEsfera.setVisible(false);
        this.statusEsfera = false;
        
    }
   
    public void OcultartTriangulo(){
        this.contenedorTriangulo.setVisible(false);
        this.labelAlturaTriangulo.setVisible(false);
        this.labelApotemaTriangulo.setVisible(false);
        this.labelBaseTriangulo.setVisible(false);
        this.textFieldAlturaTriangulo.setVisible(false);
        this.textFieldBaseTriangulo.setVisible(false);
        this.textFieldApotemaTriangulo.setVisible(false);
    }
    
    public void OcultarCilindro(){
        
        this.contenedorCilindro.setVisible(false);
        this.labelAlturaCilindro.setVisible(false);
        this.labelRadioCilindro.setVisible(false);
        this.textFieldAlturaCilindro.setVisible(false);
        this.textFieldRadioCilindro.setVisible(false);
    
    }
    public void DiseñoTriangulo() {
    this.contenedorTriangulo = getContentPane();
    this.contenedorTriangulo.setLayout(null);

    this.labelAlturaTriangulo = new JLabel("Altura del triángulo");
    this.labelAlturaTriangulo.setBounds(300, 100, 400, 50);

    this.textFieldAlturaTriangulo = new JTextField();
    this.textFieldAlturaTriangulo.setBounds(100, 150, 600, 20);

    this.labelBaseTriangulo = new JLabel("Base del triángulo");
    this.labelBaseTriangulo.setBounds(300, 170, 400, 50);

    this.textFieldBaseTriangulo = new JTextField();
    this.textFieldBaseTriangulo.setBounds(100, 220, 600, 20);

    this.labelApotemaTriangulo = new JLabel("Apotema del triángulo");
    this.labelApotemaTriangulo.setBounds(300, 240, 400, 50);

    this.textFieldApotemaTriangulo = new JTextField();
    this.textFieldApotemaTriangulo.setBounds(100, 280, 600, 20);

    this.contenedorGeneral.add(this.labelAlturaTriangulo);
    this.contenedorGeneral.add(this.textFieldAlturaTriangulo);
    this.contenedorGeneral.add(this.labelBaseTriangulo);
    this.contenedorGeneral.add(this.textFieldBaseTriangulo);
    this.contenedorGeneral.add(this.labelApotemaTriangulo);
    this.contenedorGeneral.add(this.textFieldApotemaTriangulo);
    this.statusTriangulo = true;
    if (this.statusCilindro == true) {
        this.OcultarCilindro();
    }
    this.OcultarEsfera();

    this.contenedorTriangulo.setVisible(true);

    this.item= 1;
}
        
        
    
  
      public void DiseñoCilindro() {
    this.contenedorCilindro = getContentPane();
    this.contenedorCilindro.setLayout(null);

    this.labelAlturaCilindro = new JLabel("Altura del cilindro");
    this.labelAlturaCilindro.setBounds(300, 100, 400, 50);

    this.textFieldAlturaCilindro = new JTextField();
    this.textFieldAlturaCilindro.setBounds(100, 150, 600, 20);

    this.labelRadioCilindro = new JLabel("Radio del cilindro");
    this.labelRadioCilindro.setBounds(300, 170, 400, 50);

    this.textFieldRadioCilindro = new JTextField();
    this.textFieldRadioCilindro.setBounds(100, 220, 600, 20);

    this.contenedorCilindro.add(this.labelAlturaCilindro);
    this.contenedorCilindro.add(this.textFieldAlturaCilindro);
    this.contenedorCilindro.add(this.labelRadioCilindro);
    this.contenedorCilindro.add(this.textFieldRadioCilindro);
    this.statusCilindro = true;
    if (this.statusTriangulo == true) {
        this.OcultartTriangulo();
    }
    this.OcultarEsfera();

    this.contenedorCilindro.setVisible(true);

   this.item=2;
}

    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() ==  this.buttonCalcular){
           
            switch (this.listaFiguras.getSelectedIndex()) {
                case 0:
                    if (this.textFieldRadioEsfera.getText().isEmpty()){
                        JOptionPane.showMessageDialog(rootPane, "Porfavor complete los datos", "campo vacío", JOptionPane.ERROR_MESSAGE);
                         }
                    else if  (textFieldRadioEsfera.getText().matches("\\d+(\\.\\d+)?")){                       
                        ProcesosEsfera Esfera = new ProcesosEsfera(Double.valueOf(this.textFieldRadioEsfera.getText()));  
                        this.tablaFiguras.setValueAt(Esfera.superficie(), 0, 2);
                        this.tablaFiguras.setValueAt(Esfera.volumen(), 1, 2);              
                         }
                    else{JOptionPane.showMessageDialog(rootPane, "Porfavor ingrese una valor valido", "entrada invalida", JOptionPane.ERROR_MESSAGE); }    
             break;
                case 1:
                    if (this.textFieldAlturaTriangulo.getText().isEmpty() || this.textFieldApotemaTriangulo.getText().isEmpty() || this.textFieldBaseTriangulo.getText().isEmpty()){
                        JOptionPane.showMessageDialog(rootPane, "Porfavor complete los datos", "campo vacío", JOptionPane.ERROR_MESSAGE);
                         }
                    else if  (this.textFieldBaseTriangulo.getText().matches("\\d+(\\.\\d+)?") &&this.textFieldAlturaTriangulo.getText().matches("\\d+(\\.\\d+)?") && this.textFieldApotemaTriangulo.getText().matches("\\d+(\\.\\d+)?")){                       
                        ProcesosPiramide piramide = new ProcesosPiramide(Double.valueOf(this.textFieldApotemaTriangulo.getText()),Double.valueOf(this.textFieldAlturaTriangulo.getText()),Double.valueOf(this.textFieldBaseTriangulo.getText()));  
                        this.tablaFiguras.setValueAt(piramide.superficie(), 2, 2);
                        this.tablaFiguras.setValueAt(piramide.volumen(), 3, 2);              
                         }
                    else{JOptionPane.showMessageDialog(rootPane, "Porfavor ingrese una valor valido", "entrada invalida", JOptionPane.ERROR_MESSAGE); }    
             break;
                    
                    
                    
                case 2:
                    if (this.textFieldRadioCilindro.getText().isEmpty() || this.textFieldAlturaCilindro.getText().isEmpty()){
                        JOptionPane.showMessageDialog(rootPane, "Porfavor complete los datos", "campo vacío", JOptionPane.ERROR_MESSAGE);
                         }
                    else if  (this.textFieldRadioCilindro.getText().matches("\\d+(\\.\\d+)?") && this.textFieldAlturaCilindro.getText().matches("\\d+(\\.\\d+)?")){                       
                        ProcesosCilindro cilindro = new ProcesosCilindro(Double.valueOf(this.textFieldAlturaCilindro.getText()),Double.valueOf(this.textFieldRadioCilindro.getText()));
                        this.tablaFiguras.setValueAt(cilindro.superficie(), 4, 2);
                        this.tablaFiguras.setValueAt(cilindro.volumen(), 5, 2);
                                
                         }
                    else{JOptionPane.showMessageDialog(rootPane, "Porfavor ingrese una valor valido", "entrada invalida", JOptionPane.ERROR_MESSAGE); }    
                     break;
                    
                    
                
               
                default:
                    break;
            }
        }
        if(e.getSource() == listaFiguras){
            if(listaFiguras.getSelectedIndex() == 0 && this.listaFiguras.getSelectedIndex() != this.item){
                
                this.DiseñoEsfera();
                
            } 
            if(listaFiguras.getSelectedIndex() == 1 && this.listaFiguras.getSelectedIndex() != this.item){
            
                
                this.DiseñoTriangulo();
            } 
            if(listaFiguras.getSelectedIndex() == 2 && this.listaFiguras.getSelectedIndex() != this.item){
                
              
                this.DiseñoCilindro();
            } 
            
            
        }
        if(e.getSource() == this.buttonCambiarColor){
                this.CambiarColor();
                
            }
    }
    
}  

