package Retos;

//Juego en el que el usuario debe adivinar un número aleatorio entre 1 y 10. Tiene 3 oportunidades para adivinar el número.

import javax.swing.*;

public class Jueguito_Con_El_So {

    public static void main(String[] args) {

       JOptionPane.showMessageDialog(null,"Oe cucho, adivine el numero que estoy pensando entre 1 y 10, tiene 3 oportunidades mi ñarria, suerte es que les digo. ");

        int intentos = 0;
        int numero = (int) (Math.random() * 10 + 1);
        int adivinacion = 0;

        do {
            adivinacion = Integer.parseInt(JOptionPane.showInputDialog("Adivine pues el numero: "));
            if (adivinacion == numero) {
                JOptionPane.showMessageDialog(null, "Esta ñarria le atinó, era el: " + numero);
            } else {
                JOptionPane.showMessageDialog(null, "Lleve su puñalada que ese no era.");
                intentos++;
            }
        } while (intentos < 3 && adivinacion != numero);

        JOptionPane.showMessageDialog(null,"No ñaña, no le logro atinar, era el: " + numero);
    }
}