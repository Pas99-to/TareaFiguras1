//EJERCICIO DE FIGURAS 
//ALUMNO:PASTRANO MEZA JUAN JESÚS
//MATERIA: GRAFICACIÓN
//ENTREGA: ANTES DEL JUEVES 12-10-2020
package Tarea_Figuras;

import javax.swing.JFrame;
//VENTANA 
public class Ventana_Figuras extends JFrame{
//Constructor Ventanas 
@SuppressWarnings("OverridableMethodCallInConstructor")
public Ventana_Figuras(int ancho,int altura){
this.setResizable(false);
this.setSize(ancho,altura);
this.setLocationRelativeTo(null);
this.setVisible(true);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}    

}
