/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author JONPC
 */
public class ScannerMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ScannerClass scannerValidator = new ScannerClass();
        List<Integer> accumulated = new ArrayList<>();
        int repeat = 0;
        int maxValueRepeat = 0;
        boolean flag;
        System.out.println("Bienvenido:");
        String keyboardInput;

        try {

            do {

                System.out.println("Por favor introduzca un valor a acumular:");
                Scanner escanerInput = new Scanner(System.in);
                keyboardInput = escanerInput.nextLine();
                accumulated.add(Integer.parseInt(keyboardInput));
                flag = scannerValidator.accumulated(accumulated);

                if (accumulated.size() > 1 && Objects.equals(accumulated.get(accumulated.size() - 1),
                        accumulated.get(accumulated.size() - 2))) {
                    repeat++;
                } else {
                    repeat = 0;
                }

                if (repeat > maxValueRepeat) {
                    maxValueRepeat = repeat;
                }

            } while (!flag);

            flag = scannerValidator.structure(accumulated);

            if (flag && maxValueRepeat >= 7) {
                System.out.println("La suma se realizó de manera satisfactoria");
            } else {
                System.err.println("La estructura en cuanto a los valores ingresados no es la correcta.");
            }

        } catch (Exception e) {

            System.err.println("Error: No olvide ingresar únicamente valores enteros.");

        }

    }

}
