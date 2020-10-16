/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inandoutdata;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author JONPC
 */
public class InAndOutDataMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        String monthDay;
        String day;
        InAndOutDataClass writeClass = new InAndOutDataClass();
        System.out.println("Por favor introduzca el número correspondiente al mes del año:");
        Scanner escanermonth = new Scanner(System.in);
        monthDay = escanermonth.nextLine();
        System.out.println("Por favor introduzca día de la semana (EN MAYUSCULA 'L' 'M' 'Z' 'J' 'V' 'S' 'D')");
        Scanner escanerday = new Scanner(System.in);
        day = escanerday.nextLine();
        
        String regexDay = "^[L|M|Z|J|V|S|D]$";
        String regexMonthDay = "\\b(\\d|1[0-2])\\b";
        
        if (monthDay.matches(regexMonthDay) && day.matches(regexDay)) {
            
            String rute = "C:/java_files";
            File ruteFile = new File(rute);
            
            if (!ruteFile.exists()) {
                ruteFile.mkdirs();
            }
            
            String nameFile = "C:/java_files/InAndOutputData.txt";
            File file = new File(nameFile);
            BufferedWriter bw;
            
            bw = new BufferedWriter(new FileWriter(file));
            bw = writeClass.createCalendar(bw, Integer.parseInt(monthDay), day);
            
            bw.close();
            
        } else {
            
            System.err.println("Error: por favor ingrese los valores como se especifica");
        
        }
        
    }
    
}
