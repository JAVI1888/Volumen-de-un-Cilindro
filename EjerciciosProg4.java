
package ejerciciosprog1;

import javax.swing.JOptionPane;

public class EjerciciosProg4 {
    public static void main(String args[]){
        byte radio=0;
        byte h=0;
        float volumen;
        byte c;
        float area;
        radio=Byte.parseByte(JOptionPane.showInputDialog("Ingresa el radio del cilindro"));
        h=Byte.parseByte(JOptionPane.showInputDialog("Ingresa la altura del cilindro"));
       c=(byte) (radio*radio);
       volumen=(float) (3.1416*c*h);
       area=(float) (2*3.1416*c*h);
        System.out.println("El volumen del cilindro es ="+"--"+volumen);
        System.out.println("El area del cilindro es ="+"--"+area);
    }
    
}
