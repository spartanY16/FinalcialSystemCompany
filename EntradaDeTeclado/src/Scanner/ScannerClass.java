package Scanner;

import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JONPC
 */
public class ScannerClass {

    boolean accumulated(List<Integer> list) {

        int total = 0;

        for (Integer value : list) {
            total += value;
        }

        if (total < 100) {
            return false;
        } else {
            return true;
        }

    }

    boolean structure(List<Integer> list) {

        int tree = Collections.frequency(list, 3);
        int two = Collections.frequency(list, 2);

        return tree == 3 && two == 2;
    }

}
