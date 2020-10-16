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
public class FinonacciMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FibonacciClass fibonacci = new FibonacciClass();
        
        System.out.println(fibonacci.fibonacciRecursive(10)); // Ingresar el i-ésimo de la serie
        System.out.println(fibonacci.fibonacciIterative(10)); // Ingresar el i-ésimo de la serie
        
    }
    
}
