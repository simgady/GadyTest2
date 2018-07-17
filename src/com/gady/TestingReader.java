package com.gady;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by gady.simchovitz on 24/02/2018.
 */
public class TestingReader {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(System.getProperty("user.dir"));
        Scanner s = new Scanner(new File("in/input.txt"));
        System.out.println(s.next());
        System.out.println(s.next());
        System.out.println(s.next());
        System.out.println(s.next());
        return;
    }
}
