/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;
/**
 *
 * @author Andrés J. Jiménez Leandro
 * Created: 2015-11-16 LUNES
 */
public class Rectangulo extends Figuras.FigurasGeometricas {
     //Método Constructor Vacío
    public Rectangulo() { }     
    /**
     * Método Constructor de la Clase Rectángulo
     * @param lal -Heredada-
     * @param bal -Heredada-
     */
    public Rectangulo(int lal, int bal) {
        super(lal, bal);
    }
     /**
     * Método Perímetro
     * @return ((bal*2)+(lal*2))
     */
    public float Perimetro () {
        return ((lal*2)+(bal*2));
    }  
    /**
     * Método Área
     * @return base * alto
     */
    public float Area () {
        return lal*bal;
    }
     /**
     * Método toString()
     * @return Perimetro() y Area()
     */
    @Override //SobreEscritura para dar resultados
    public String toString(){
        return ("El Perímetro de un Rectángulo es: " + this.Perimetro() + ", y su Área es: " + this.Area());
    }
}