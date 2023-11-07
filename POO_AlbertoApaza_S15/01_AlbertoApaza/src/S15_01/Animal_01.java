/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S15_01;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario15
 */
public class Animal_01 {
   
    String especie;
    String color;
    double peso;

    public void mostrarInformacion() {
        String informacion = "Especie: " + especie + "\n"
                + "Color: " + color + "\n"
                + "Peso: " + peso + " kg";
        JOptionPane.showMessageDialog(null, informacion, "Información del Animal", JOptionPane.INFORMATION_MESSAGE);
    }

    public void emitirSonido() {
        JOptionPane.showMessageDialog(null, "El animal emite un sonido característico");
    }

    public void mover() {
        JOptionPane.showMessageDialog(null, "El animal se está moviendo");
    }

    public void preguntar() {
        especie = JOptionPane.showInputDialog("Ingrese la especie del animal:");
        color = JOptionPane.showInputDialog("Ingrese el color del animal:");
        String pesoStr = JOptionPane.showInputDialog("Ingrese el peso del animal en kg:");
        peso = Double.parseDouble(pesoStr);
    }


}
