/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipopila;

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author ms324
 */
public class TipoPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pila[] = new int[10];
        int opc;
        PilaVector objPilaVector = new PilaVector();
        int dato;

        String res = JOptionPane.showInputDialog("¿INCICIAR LA PILA? \n SI/NO");
        if (res.equalsIgnoreCase("SI")) {
            do {

                opc = Integer.parseInt(JOptionPane.showInputDialog("OPERACION A REALIZARr \n1) INSERTAR \n2) RETIRAR \n"
                        + "3)PILA VACIA \n4) CIMA PILA \n5)LIMPIAR TABLA \n6) SALIR"));
                switch (opc) {
                    case 1:
                        dato = Integer.parseInt(JOptionPane.showInputDialog("ESCRIBE LO QUE DESEA  INSERTAR"));
                        objPilaVector.insertar(dato);
                        break;
                    case 2:
                        objPilaVector.quitar();
                        break;
                    case 3:
                        objPilaVector.pilaVacia();
                        break;
                    case 4:
                        objPilaVector.cimaPila();
                    case 5:
                        objPilaVector.limpiarPila();
                        break;
                    case 6:
                        System.exit(0);
                }
            } while (res != String.valueOf(6));
        } else {
            System.exit(0);
        }

    }

}

