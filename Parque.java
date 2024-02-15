import javax.swing.JOptionPane;

public class Parque {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Ingresa tu edad:");
        int edad = Integer.parseInt(input);


        if (edad >= 18) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, este parque de diversiones es solo para mayores de edad.");
        } else if (edad < 10) {
            JOptionPane.showMessageDialog(null, "Edad no permitida para este juego");
        } else {
            JOptionPane.showMessageDialog(null, "Bienvenido al juego");
        }


    }
}