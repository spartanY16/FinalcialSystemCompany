/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finonacci;

/**
 *
 * @author JONPC
 */
public class FibonacciClass {

    int fibonacciRecursive(int i) {
        if (i > 1) {
            return fibonacciRecursive(i - 1) + fibonacciRecursive(i - 2);
        } else if (i == 1) {
            return 1;
        } else if (i == 0) {
            return 0;
        } else {
            System.out.println("Es necesario ingresar un número mayor o igual a 1");
            return -1;
        }
    }

    int fibonacciIterative(int i) {
        if (i > 1) {
            int siguiente = 1, current = 0, temporary = 0;
            for (int x = 1; x <= i; x++) {
                temporary = current;
                current = siguiente;
                siguiente = siguiente + temporary;
            }
            return current;
        } else {
            System.out.println("Es necesario ingresar un número mayor o igual a 1");
            return -1;
        }
    }

}
