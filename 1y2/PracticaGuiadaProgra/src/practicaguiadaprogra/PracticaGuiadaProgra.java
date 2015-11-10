/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//PAQUETES DE LA CLASE:
package practicaguiadaprogra; //Paquete al que pertenece la clase
//IMPORTACIONES(IMPORTES) DE LA CLASE:
import javax.swing.JOptionPane; //Usando librería de JOptionPane
//import javax.swing.*; //Usando todas las librerías en Javax.Swing
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
        int lal = 0; //Variable lal de tipo entero
        int lab = 0; //Variable lab de tipo entero
        //INSTANCIAS
        //nombredelpaquete.NombreDeLaClase nombreDeLaInstancia = new nombredelpaquete.NombreDeLaClase(tipoVariable nombreVariable);
        Figuras.FigurasGeometricas fg = new Figuras.FigurasGeometricas(lal, lab);        
        //NombreDeLaClase nombreDeLaInstancia = new NombreDeLaClase(variables);
      
        //IMPRESIONES
      
    }      
}