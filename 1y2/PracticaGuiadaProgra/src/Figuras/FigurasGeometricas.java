/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras; //Paquete al que pertenece la clase
/**
 *
 * @author Andrés J. Jiménez Leandro 
 * Created: 2015-11-09 Lunes
 */                       //Hereda de la clase Objeto (de Java)
public class FigurasGeometricas extends Object { //Clase FigurasGeométricas
    //VARIABLES:
    public int lal; //Lado-Alto-Largo
    public int bal; //Base-Ancho-Lado
    /**
     * CONTRUCTOR (LLENO): public NombreDeLaClase(tipoDeVariable variable) {
     * this.variableClase = variableConstructor; }
    *
     */
    public FigurasGeometricas(int lal, int bal) {
        this.lal = lal;
        this.bal = bal;
    }
    //CONTRUCTOR VACÍO: --poner llaves en misma línea para ahorrar memoria--
    public FigurasGeometricas() {}
    //MÉTODOS:    
    /**
     * Metodo Set para asignar la variable
     * @param lal
     * no hay returno
     **/
    public void /*vacío*/ setLal(int lal) {
        //this.variableConstructor = variableSet;
        this.lal = lal;        
    } //Cierre del Método Set
    /**
     * Método Get para obtener la variable
     * @return lal
     **/
    public int /*siempre se usa el mismo tipo de la variable por obtener*/ getLal(/*nunca tiene variables el get*/){
       //retorna el lal del setLal
        return this.lal; 
    }
    /**
     * Metodo set para variable:
     * @param bal
     **/
    public void setBal(int bal) {
        //this.variableConstructor = variableSet;
        this.bal = bal;                
    }
    /**
     * Método Get para variable:
     * @return bal
     **/
    public int getBal() {
        //retorna el bal del setBal
        return this.bal;
    }
     /**
     * Metodo set para variable:
     * @variable lal; bal;
     * @return toString(lal y bal)
     **/ 
    @Override //"SobreEscribir": Da los resultados obtenidos, de las variables que se establecen
    public String toString() {
        return ("La Clase Figuras Geometricas tiene un Lado-Alto-Largo de: " + lal + ", y un Lado-Base-Ancho de: " + bal + '\n');
    // '\n' es una sentencia de escape, para brincar a la linea siguiente; equivale a un "enter"
    }        
}