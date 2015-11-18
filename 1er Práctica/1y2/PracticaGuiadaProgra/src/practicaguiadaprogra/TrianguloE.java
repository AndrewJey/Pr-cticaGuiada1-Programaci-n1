/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaguiadaprogra;
/**
 *
 * @author Andrés J. Jiménez Leandro 
 * Created: 2015-11-09 Lunes
 */
public class TrianguloE extends Figuras.FigurasGeometricas {
    //Método Constructor de la Clase TrianguloE
    public TrianguloE(int lal, int bal) {
        super(lal, bal);
    }
   /**
     * Método Perímetro
     * @return lado*3
     */
    public float Perimetro () {
        return lal*3;
    }  
    /**
     * Método Área
     * @return lado * lado
     */
    public float Area () {
        //base * altura / 2
        return lal*bal/2;
    }
     /**
     * Método toString()
     * @return Perimetro() y Area()
     */
    @Override //SobreEscritura para dar resultados
    public String toString(){
        return ("El Perímetro de un Triángulo Equilátero es: " + this.Perimetro() + ", y su Área es: " + this.Area());
    }
}