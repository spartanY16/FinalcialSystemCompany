/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inandoutdata;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JONPC
 */
public class InAndOutDataClass {

    BufferedWriter createCalendar(BufferedWriter bw, int monthDay, String day) throws IOException {

        List<String> days = new ArrayList<>();
        days.add("L");
        days.add("M");
        days.add("Z");
        days.add("J");
        days.add("V");
        days.add("S");
        days.add("D");

        int start;

        switch (day) {
            case "L":
                start = 0;
                break;
            case "M":
                start = 1;
                break;
            case "Z":
                start = 2;
                break;
            case "J":
                start = 3;
                break;
            case "V":
                start = 4;
                break;
            case "S":
                start = 5;
                break;
            case "D":
                start = 6;
                break;
            default:
                start = 0;
                break;

        }

        String monthString;
        int daysOfMonth;
        switch (monthDay) {
            case 1:
                monthString = "January";
                daysOfMonth = 31;
                break;
            case 2:
                monthString = "February";
                daysOfMonth = 29;
                break;
            case 3:
                monthString = "March";
                daysOfMonth = 31;
                break;
            case 4:
                monthString = "April";
                daysOfMonth = 30;
                break;
            case 5:
                monthString = "May";
                daysOfMonth = 31;
                break;
            case 6:
                monthString = "June";
                daysOfMonth = 30;
                break;
            case 7:
                monthString = "July";
                daysOfMonth = 31;
                break;
            case 8:
                monthString = "August";
                daysOfMonth = 31;
                break;
            case 9:
                monthString = "September";
                daysOfMonth = 30;
                break;
            case 10:
                monthString = "October";
                daysOfMonth = 31;
                break;
            case 11:
                monthString = "November";
                daysOfMonth = 30;
                break;
            case 12:
                monthString = "December";
                daysOfMonth = 31;
                break;
            default:
                monthString = "Invalid month";
                daysOfMonth = 0;
                break;
        }

        bw.write("          " + monthString);
        bw.newLine();

        for (String dayVal : days) {

            bw.write(dayVal + "   ");

        }

        bw.newLine();

        if (start != 0) {

            for (int i = 0; i < start; i++) {

                bw.write("    ");

            }

        }

        for (Integer i = 0; i < daysOfMonth; i++) {

            if (i != 0) {

                if (!days.get(start).equals("D")) {
                    if (i < 10) {
                        bw.write(i.toString() + "   ");
                    } else {
                        bw.write(i.toString() + "  ");
                    }
                    start++;
                } else {
                    if (i < 10) {
                        bw.write(i.toString() + "   ");
                    } else {
                        bw.write(i.toString() + "  ");
                    }
                    bw.newLine();
                    start = 0;
                }

            }

        }

        return bw;

    }

}
