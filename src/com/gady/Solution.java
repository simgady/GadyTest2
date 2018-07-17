package com.gady;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(new File("in/input.txt"));
        String line = in.nextLine();
        String line2 = in.nextLine();
        DateFormat df = new SimpleDateFormat("dd-MMM-yy");
        Date d = df.parse(line);
        Date d2 = df.parse(line2);
        System.out.println(d.toString());
        long diff = (d2.getTime() - d.getTime()) / (1000 * 60 * 60 * 24);
        System.out.println(diff);
    }

    private int a;

    public Solution(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }


}