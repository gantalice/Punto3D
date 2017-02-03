package com.mycompany.punto3d;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.web.WebView;
import javax.swing.JOptionPane;

public class FXMLController implements Initializable {
    
    LinkedList <Punto3D> listapuntos = new LinkedList<>();
    
    @FXML
    private WebView tabla;
    
    @FXML
    private MenuBar menu;
    
    @FXML
    private Menu arc;
    
    @FXML
    private Menu opr;
    
    @FXML
    private Menu ayu;
    
    @FXML
    private MenuItem insertarP;
    
    @FXML
    private MenuItem insertarf;
    
    @FXML
    private MenuItem borrarP;
    
    @FXML
    private MenuItem borrarf;
    
    @FXML
    private MenuItem invlista;
    
    @FXML
    private MenuItem autor;
    
    
    
    @FXML
    private void insertarprimero(ActionEvent event){
        
        int x= Integer.parseInt(JOptionPane.showInputDialog("agregar x"));
        
        int y= Integer.parseInt(JOptionPane.showInputDialog("agregar y"));
        
        int z= Integer.parseInt(JOptionPane.showInputDialog("agregar z"));
        Punto3D objeto1 = new Punto3D(x, y, z);
        listapuntos.addFirst(objeto1);
        String d1 = "";
        String d2 = "";
        String d3 = "";
        String tabla1 = "";
        listapuntos.addLast(objeto1);
        for(int i =0; i < listapuntos.size()-1; i++){
            d1 = Double.toString( listapuntos.get(i).x);
            d2 = Double.toString(listapuntos.get(i).y);
            d3 = Double.toString(listapuntos.get(i).z);
            
            tabla1 += "<TR>\n" +
		"<TH>"+  d1    +"</TH><TH>"+     d2    +"</TH> <TH>" +  d3    + "</TH>\n" +
      	"</TR>\n" ; 
            
            tabla.getEngine().loadContent(" <html>\n" +
"<head><title> beta </title></head>\n" +
"<body>\n" +
"                <TABLE BORDER>\n" +
"	<TR>\n" +
"		<TH>x</TH> <TH>y</TH> <TH>z</TH>\n" +
"	</TR>\n" + tabla1 +
                
                
"        </TABLE>\n" +
"                        </body>\n" +
"    </html> " );
        }
    }
    
    @FXML
    private void insertarfinal(ActionEvent event){
                double x= Double.parseDouble(JOptionPane.showInputDialog("agregar x"));
        
        double y= Double.parseDouble(JOptionPane.showInputDialog("agregar y"));
        
        double z= Double.parseDouble(JOptionPane.showInputDialog("agregar z"));
        Punto3D objeto2 = new Punto3D(x, y, z);
        String d1 = "";
        String d2 = "";
        String d3 = "";
        String tabla1 = "";
        listapuntos.addLast(objeto2);for(int i =0; i < listapuntos.size()-1; i++){
            d1 = Double.toString( listapuntos.get(i).x);
            d2 = Double.toString(listapuntos.get(i).y);
            d3 = Double.toString(listapuntos.get(i).z);
            
            tabla1 += "<TR>\n" +
		"<TH>"+  d1    +"</TH><TH>"+     d2    +"</TH> <TH>" +  d3    + "</TH>\n" +
      	"</TR>\n" ; 
            tabla.getEngine().loadContent(" <html>\n" +
"<head><title> beta </title></head>\n" +
"<body>\n" +
"                <TABLE BORDER>\n" +
"	<TR>\n" +
"		<TH>x</TH> <TH>y</TH> <TH>z</TH>\n" +
"	</TR>\n" + tabla1 +
                
                
"        </TABLE>\n" +
"                        </body>\n" +
"    </html> " );
            
        }
    }
    
    @FXML
    private void borrarinicio(ActionEvent event){
       listapuntos.removeFirst();
       for(int i =0; i < listapuntos.size()-1; i++){
            d1 = Double.toString( listapuntos.get(i).x);
            d2 = Double.toString(listapuntos.get(i).y);
            d3 = Double.toString(listapuntos.get(i).z);
            
            tabla1 += "<TR>\n" +
		"<TH>"+  d1    +"</TH><TH>"+     d2    +"</TH> <TH>" +  d3    + "</TH>\n" +
      	"</TR>\n" ; 
            
            tabla.getEngine().loadContent(" <html>\n" +
"<head><title> beta </title></head>\n" +
"<body>\n" +
"                <TABLE BORDER>\n" +
"	<TR>\n" +
"		<TH>x</TH> <TH>y</TH> <TH>z</TH>\n" +
"	</TR>\n" + tabla1 +
                
                
"        </TABLE>\n" +
"                        </body>\n" +
"    </html> " );}
    }
    
    @FXML
    private void borrarfinal(ActionEvent event){
        listapuntos.removeLast();
        for(int i =0; i < listapuntos.size()-1; i++){
            d1 = Double.toString( listapuntos.get(i).x);
            d2 = Double.toString(listapuntos.get(i).y);
            d3 = Double.toString(listapuntos.get(i).z);
            
            tabla1 += "<TR>\n" +
		"<TH>"+  d1    +"</TH><TH>"+     d2    +"</TH> <TH>" +  d3    + "</TH>\n" +
      	"</TR>\n" ; 
            
            tabla.getEngine().loadContent(" <html>\n" +
"<head><title> beta </title></head>\n" +
"<body>\n" +
"                <TABLE BORDER>\n" +
"	<TR>\n" +
"		<TH>x</TH> <TH>y</TH> <TH>z</TH>\n" +
"	</TR>\n" + tabla1 +
                
                
"        </TABLE>\n" +
"                        </body>\n" +
"    </html> " );}
    }
    
    @FXML
    private void invertir(ActionEvent event){
         for(int i=0; i<listapuntos.size() / 2;i++){
        }
    }
    
    @FXML
    private void autores(ActionEvent event){
    }
    
    
    
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) { 
        String tabla1 = "";
       tabla.getEngine().loadContent(" <html>\n" +
"<head><title> beta </title></head>\n" +
"<body>\n" +
"                <TABLE BORDER>\n" +
"	<TR>\n" +
"		<TH>x</TH> <TH>y</TH> <TH>z</TH>\n" +
"	</TR>\n" + tabla1 +
                
                
"        </TABLE>\n" +
"                        </body>\n" +
"    </html> " );
       
        
    }    
}
