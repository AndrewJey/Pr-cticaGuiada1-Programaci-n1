/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//PAQUETES DE LA CLASE:
package practicaguiadaprogra; //Paquete al que pertenece la clase
//IMPORTACIONES(IMPORTES) DE LA CLASE:
//import javax.swing.JOptionPane; //Usando librería de JOptionPane
import javax.swing.*; //Usando todas las librerías en Javax.Swing
import Figuras.*; //Importando todas las clases dentro del paquete Figuras
/**
 *
 * @author Andrés J. Jiménez Leandro
 * Created: 2015-11-09 Lunes
 **/
public class PracticaGuiadaProgra extends Object {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VARIABLES (en main deben estar inicializadas)
        int lal = Integer.parseInt(JOptionPane.showInputDialog("Digite su Lado-Alto-Largo: ")); //Variable lal de tipo entero
        //Se parsea a integer la variable, porque el ingreso de datos del usuario, siempre es en String
        int lab = Integer.parseInt(JOptionPane.showInputDialog("Digite su Lado-Base-Ancho: ")); //Variable lab de tipo entero        
        //INSTANCIAS       
        //nombredelpaquete.NombreDeLaClase nombreDeLaInstancia = new nombredelpaquete.NombreDeLaClase(tipoVariable nombreVariable);
        Figuras.FigurasGeometricas fg = new Figuras.FigurasGeometricas(lal, lab);        
        Figuras.Rectangulo r1 = new Rectangulo();
        //Cómo paquete "Figuras" está importado, no requiero poner el nombreDelPaquete antes de la clase instanciada        
        Rectangulo r2 = new Rectangulo(lal, lab);        
        //NombreDeLaClase nombreDeLaInstancia = new NombreDeLaClase(variables);
        Cuadrado c1 = new Cuadrado(lal, lab);
        //Poner el paquete NO afecta en nada, si está importado o si está, en el mismo paquete
        practicaguiadaprogra.TrianguloE t1 = new practicaguiadaprogra.TrianguloE(lal, lab);        
        //USO DE SET Y GET:
        fg.setLal(lal);
        fg.getLal();
        fg.setBal(lab);
        fg.getBal();
        //IMPRESIONES:
        //Impresión por Cuadro de Mensaje Emergente:
        //JOptionPane.mostrarDialogoDeMensaje(componente-enEsteCasoNulo-, String de Impresión, "Título del Recuadro", Tipo de JOptionPane);
        JOptionPane.showMessageDialog(null, fg.toString(), "Figuras Geométricas", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, c1.toString(), "Cuadrado", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, r2.toString(), "Rectángulo Lleno", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, t1.toString(), "Triángulo Equilátero", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, r1.toString(), "Rectángulo Vacío", JOptionPane.PLAIN_MESSAGE);      
        //Impresión por Consola:
        System.out.println("El Lado-Alto-Largo digitado, fue de: " + fg.getLal() + ", y su Lado-Base-Ancho fue de: " + fg.getBal());        
        //OTRA SECCIÓN: -----.-----.---
        Cuadrado c2 = new Cuadrado(fg.getBal(), fg.getLal());
        System.out.println("El LAL del Cuadrado es: " + '\n' + fg.getLal()); //'\n' Sentencia de Escape para saltar una linea (equivale a un "enter")                
    }          
}