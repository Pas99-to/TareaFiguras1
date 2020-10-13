package Tarea_Figuras;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

//Clase dinde se oonstruye el panel y se hacen las figuras 
public class Panel_Figuras extends JPanel {

@SuppressWarnings({"LeakingThisInConstructor",
    "OverridableMethodCallInConstructor"})
//Constructor Panel
public Panel_Figuras(){
Ventana_Figuras ventana= new Ventana_Figuras(905,500);//clase Ventana_Figuras  
this.setBackground(Color.BLACK);
this.setLayout(null);
addEventos();
ventana.add(this);
}
//metodo para hacer figuras graficas y mucho mas 
    @Override
    public void paint(Graphics g) {
       super.paint(g);
    Graphics2D figura= (Graphics2D) g;//graficos 2D
    Color color = new Color(4,161,156);//color RGB
    Poligono poligono=new Poligono();//Clase poligono
    
    //rectangulo  principal   
    figura.setStroke(new BasicStroke(4));//Grosor de Linea 
    figura.setColor(color);
    figura.drawRect(30,30,840,410);//Rectangulo Grande 
   
    //Rectangulos secudarios 
     figura.drawRect(50,45,250,170);//|
     figura.drawRect(325,45,250,170);//2
     figura.drawRect(600,45,250,170);//3
     figura.drawRect(50,255,250,170);//4
     figura.drawRect(325,255,250,170);//5
     figura.drawRect(600,255,250,170);//6
     
     //Dibujo Casa 
     figura.drawRect(80,100,160,70);//Marco Rectangulo Casa-1
     figura.drawPolygon(poligono.xgetPolygonCasa(),
     poligono.ygetPolygonCasa(),3);//Techo triangulo Casa-1
     figura.drawRect(130,126,30,40);//Puerta Casa 
     figura.drawLine(130,166,90,185);//recta paralela1 Casa
     figura.drawLine(160,166,125,185);//recta paralela2 Casa 
     figura.drawString("Casa",125,200);//String Casa
     
     //Figura Wifi
     int anchoR=20, largoR=45,xR=360,yR=125;//Variables clave Wifi
     figura.drawRect(xR,yR,anchoR,largoR);//Rectangulo wifi chico-1
     figura.drawRect(xR+34,yR-15,anchoR,largoR+15);//Rectangulo wifi chico-2
     figura.drawRect(xR+68,yR-30,anchoR,largoR+30);//Rectangulo wifi medio-3
     figura.drawRect(xR+102,yR-50,anchoR,largoR+50);//Rectangulo wifi mediano-4
     figura.drawRect(xR+136,yR-70,anchoR-5,largoR+70);//Rectangulo grande-5
     figura.drawString("Wifi",xR+34,yR+70);//texto Wifi 
     
     //Ovalos con rectangulos
     //Reutilece las varibales de wifi
     figura.drawRoundRect(xR+340,yR-50,anchoR+30,largoR+60,55,55);//Ovalo-1
     figura.drawRoundRect(xR+310,yR-37,anchoR+90,largoR-10,60,60);//Ovalo-2
     figura.drawRoundRect(xR+259,yR-15,anchoR+185,largoR-5,80,80);//Ovalo-3
     figura.drawString("0valos con Rectangulos",
                                     xR+300,yR+70);//texto Ovalos Rectangulo
      
     //Carita---->emoji
    int xO=99,yO=265;//Variables emoji--->Coordenadas
    figura.drawOval(xO,yO,150,150);//cara
    figura.drawOval(xO+40,yO+35,25,25);//Ojo1
    figura.drawOval(xO+85,yO+35,25,25);//Ojo2
    figura.drawOval(xO+48, yO+75,50,50);//Boca
    figura.fillOval(xO+50,yO+44,9,9);//relleno ojo1
    figura.fillOval(xO+98,yO+44,9,9);//relleno Ojo2
    figura.drawString("Emoji",63,402);
    
    //Ovalos con circulos
   figura.drawOval(415,275,60,120);//Ovalo-1 ancho
   figura.drawOval(380,292,130,45);//Ovalo-2 largo
   figura.drawOval(344,317,205,45);//Ovalo-3 largo
   figura.drawString("0valos con circulos",344,415);//String Ovalo
    
    // tiangulos
    figura.drawPolygon(poligono.xTrianguloFigura4_1(),
     poligono.yTrianguloFigura4_1(),3);//triangulo uno
    figura.drawPolygon(poligono.xTrianguloFigura4_2(),
     poligono.yTrianguloFigura4_2(),3);//triangulo dos
    figura.drawLine(634,284,624,334 );//punto uno del trinagulo separado
    figura.drawLine(634,284,668,298);//punto dos del trinagulo separado
    figura.drawLine(668,298,624,334);//punto dos del trinagulo separado
    figura.drawString("Triangulos",675  ,398);
    //Termina triangulos 
    
    }
    
 

//Añadiendo evento para saaber coordenada 
public void addEventos(){
this.addMouseListener(new MouseAdapter(){
@Override
public void mouseClicked(MouseEvent evento){
System.out.println(evento.getPoint());
}
});
}

    
    
}
