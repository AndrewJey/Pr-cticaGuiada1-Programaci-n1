/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Definición de Paquetes
package practicaguiadaprogra; //Paquete de practicaguiadaprogra
/**
 *
 * @author Andrés J. Jiménez Leandro 
 * Created: 2015-11-09 Lunes
 *
 */
//Clase Cuadrado Hereda de la clase Figuras Geometricas dentro del paquete Figuras
public class Cuadrado extends Figuras.FigurasGeometricas {
    //Método Constructor Vacío, de la Clase Cuadrado
    public Cuadrado() {}
    //Método Constructor con la Herencia de la clase Figuras Geométricas
    public Cuadrado(int lal, int bal) { //Variables propias del Constructor para que usen los métodos en esta clase las variables de la clase padre (fg)
        //super es la llamada de herencia, para usar las variables heredadas de la clase padre (Figuras Geometricas)
        super(lal, bal); 
    } //Cierre del Método Constructor
    /**
     * Método Perímetro
     * @return lado*4
     */
    public float Perimetro () {
        return lal*4;
    }  
    /**
     * Método Área
     * @return lado * lado
     */
    public float Area () {
        return lal*lal;
    }
     /**
     * Método toString()
     * @return Perimetro() y Area()
     */
    @Override //SobreEscritura para dar resultados
    public String toString(){
        return ("El Perímetro de un Cuadrado es: " + this.Perimetro() + ", y su Área es: " + this.Area());
    }
}