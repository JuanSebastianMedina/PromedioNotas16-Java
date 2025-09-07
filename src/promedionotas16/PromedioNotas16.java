/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promedionotas16;
/**
 * @author juanse
 * Fecha creación:
 * Requerimientos: Pide al usuario N (cantidad de notas). 
 * Con un while, solicita cada nota (0–5). 
 * Si una nota es inválida, vuelve a pedirla sin contarla. Al final muestra el promedio.
 */
import javax.swing.JOptionPane;
public class PromedioNotas16 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO
        int cantidadNotas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de notas"));
        int i = 1;
        float notaAcumulada = 0;
        while ( i<=cantidadNotas ) {
            float nota = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota número " + i));
            if (nota>=0 && nota<=5) {
                notaAcumulada = notaAcumulada + nota;
                i++;
            } else {
                JOptionPane.showMessageDialog(null, "Nota invalida, vuelva a intentarlo.");
            }
        }        
        float promedio = notaAcumulada/cantidadNotas;
        JOptionPane.showMessageDialog(null, "El promedio es de: " + promedio);
    }
}
