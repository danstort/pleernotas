/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pleernotas;

import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class PLeerNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int nota, ap, sus;
        ap = 0;
        sus = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println("Introduce una nota numérica (0-10)");
            nota = tec.nextInt();
            if (nota < 5) {
                sus++;
            } else {
                ap++;
            }

        }

        System.out.println("Hay " + sus + " suspensos y " + ap + " aprobados");
    }

}
