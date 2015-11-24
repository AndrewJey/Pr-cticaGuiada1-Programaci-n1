/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu_ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author Andrés J. Jiménez Leandro Created: 2015-11-23 Lunes
 */
public class Menu_Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VARIABLES
        int opcN = 0; //opcN = opción numérica
        char opcL = 'a'; //opcL = opción de letra
        //VARIABLES DE LAS CLASES:
        int numero = 1;
        String pregunta = "B";
        //SOLICITUD DE DATOS EN VARIABLE:
        String respuesta = JOptionPane.showInputDialog("¿Desea usar letras (L) o números (N)?");
        //Primer Menú:
        switch (respuesta) {
            case "L":
                JOptionPane.showMessageDialog(null, "ESCOGISTES LETRAS", "Menú Seleccionado", JOptionPane.WARNING_MESSAGE);
                opcL = JOptionPane.showInputDialog("¿Qué opción deseas? a, b ó c").charAt(0);
                switch (opcL) {
                    case 'a':
                        System.out.println("Opción A");
                        break;
                    case 'b':
                        System.out.println("Opción B");
                        break;
                    case 'c':
                        System.out.println("Opción C");
                        break;
                    case 'A':
                        System.out.println("Opción A");
                        break;
                    case 'B':
                        System.out.println("Opción B");
                        break;
                    case 'C':
                        System.out.println("Opción C");
                        break;
                    default:
                        System.out.println("No es una Opción");
                        break;
                }
                break;
            case "N":
                JOptionPane.showMessageDialog(null, "ESCOGISTES NÚMEROS", "Menú Seleccionado", JOptionPane.WARNING_MESSAGE);
                opcN = Integer.parseInt(JOptionPane.showInputDialog("¿Qué opción deseas? 1, 2 ó 3"));
                switch (opcN) {
                    case 1:
                        System.out.println("Opción 1");
                        break;
                    case 2:
                        System.out.println("Opción 2");
                        break;
                    case 3:
                        System.out.println("Opción 3");
                        break;
                    default:
                        System.out.println("No es una Opción");
                        break;
                }
                break;
            case "l": //Escoge l minúscula
                JOptionPane.showMessageDialog(null, "ESCOGISTES LETRAS", "Menú Seleccionado", JOptionPane.WARNING_MESSAGE);
                opcL = JOptionPane.showInputDialog("¿Qué opción deseas? a, b ó c").charAt(0);
                switch (opcL) {
                    case 'a':
                        System.out.println("Opción A");
                        break;
                    case 'b':
                        System.out.println("Opción B");
                        break;
                    case 'c':
                        System.out.println("Opción C");
                        break;
                    case 'A':
                        System.out.println("Opción A");
                        break;
                    case 'B':
                        System.out.println("Opción B");
                        break;
                    case 'C':
                        System.out.println("Opción C");
                        break;
                    default:
                        System.out.println("No es una Opción");
                        break;
                }
                break;
            case "n": //Escoge n minúscula
                JOptionPane.showMessageDialog(null, "ESCOGISTES NÚMEROS", "Menú Seleccionado", JOptionPane.WARNING_MESSAGE);
                opcN = Integer.parseInt(JOptionPane.showInputDialog("¿Qué opción deseas? 1, 2 ó 3"));
                                switch (opcN) {
                    case 1:
                        System.out.println("Opción 1");
                        break;
                    case 2:
                        System.out.println("Opción 2");
                        break;
                    case 3:
                        System.out.println("Opción 3");
                        break;
                    default:
                        System.out.println("No es una Opción");
                        break;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "NO ES UNA OPCIÓN", "ERROR DE SELECCIÓN", JOptionPane.ERROR_MESSAGE);
                break;
        }
      //INSTANCIA DE LA CLASE:
        Condicionales cond = Condicionales(pregunta, numero);
        cond.cIfElse(pregunta);
        cond.cIfElseIf(numero);
        cond.cIfElseElse(numero);    
      //IMPRESIONES:
        System.out.println(cond.toString());
        System.out.println(cond.cIfElse(pregunta));
        System.out.println(cond.cIfElseIf(numero));
        System.out.println(cond.cIfElseElse(numero));
    }
}