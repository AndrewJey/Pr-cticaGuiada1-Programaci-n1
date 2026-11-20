/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Paquetes:
package menu_ciclos;
//Importes / Importaciones:
import javax.swing.JOptionPane;
/**
 *
 * @author Andrés J. Jiménez Leandro 
 * Created: 2015-11-23 Lunes
 **/
public class Condicionales {
    //VARIABLES INICIALIZADAS:
    private String pregunta = "";
    private int numero = 0;
    //CONSTRUCTOR VACÍO:
    public Condicionales() { }
    //CONSTRUCTOR LLENO:
    public Condicionales(String pregunta, int numero) {
        this.pregunta = pregunta;
        this.numero = numero;
    }
    //Método set para variable Número
    public void setNumero(int numero) {
        this.numero = numero;
    }
    //Método get para variable Número
    public int getNumero() {
        return numero;
    }
    //Método set para variable Pregunta
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
    //Método get para variable Pregunta
    public String getPregunta() {
        return pregunta;
    }
    //Método de Condicional if-else
    public String cIfElse(String pregunta1) {

        //¿Es la variable pregunta1 igual a "B"
        if ("B".equals(pregunta1)) { //Si la variable pregunta1, sí es igual a "B", entonces:            
            System.out.println("Si es igual a B");
        } else { //Si la variable pregunta1, NO es igual a "B", entonces:            
            System.out.println("No es igual a B");
        }
        this.pregunta = pregunta1;
        return pregunta;
    }
    //Método de Condicional if-else-if
    public int cIfElseIf(int numero1) {
        int respuesta;

        //¿Es la variable numero1 igual a "1"
        if (numero1 == 1) { //Si la variable numero1, SÍ es igual a 1, entonces:            
            System.out.println("Si es igual a 1");
        } else { //Si la variable numero1, NO es igual a 1, entonces:            
            System.out.println("No es igual a 1");
        } if (numero1 == 0) { //Si la variable numero1, es igual a 0, entonces:            
            System.out.println("Es igual a 0");
        }
        this.numero = numero1;        
        respuesta = this.numero;
        return respuesta;        
    }
    //Método de Condicional if-else-else
    public int cIfElseElse(int numero2) {

        //¿Es la variable numero2 igual a "1"
        if (numero2 == 1) { //Si la variable numero2, SÍ es igual a 1, entonces:            
            System.out.println("Si es igual a 1");
        } else { //Si la variable numero2, NO es igual a 1, entonces:            
            System.out.println("No es igual a 1");
        } if (numero2 == 0) {
            System.out.println("Si es igual a 0");
        } else {
            System.out.println("No es igual a 0");    
        }
        this.numero = numero2;
        return numero;
    }
    //ToString de la Clase
    @Override
    public String toString() {
        return "Condicionales{pregunta=" + pregunta + ", numero=" + numero + "}";
    }
}