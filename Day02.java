//part 1
package org.thehuglio;

import javax.swing.*;
import java.io.File;
import java.util.List;

public class Main {

    private static final List<String> data = new Reader(new File("data.txt")).data;


    public static void main(String[] args) {
        int horizontal = 0;
        int depth = 0;
        for (String d : data) {
            String[] split = d.split(" ");
            if (split[0].equals("forward")) {
                horizontal += Integer.parseInt(split[1]);
            } else if (split[0].equals("down")) {
                depth -= Integer.parseInt(split[1]);
            } else if (split[0].equals("up")) {
                depth += Integer.parseInt(split[1]);
            }
            System.out.println(depth);
            System.out.println(horizontal);
            System.out.println();
        }
        System.out.println(horizontal * -depth);
    }
}
//part 2
package org.thehuglio;

import javax.swing.*;
import java.io.File;
import java.util.List;

public class Main {

    private static final List<String> data = new Reader(new File("data.txt")).data;


    public static void main(String[] args) {
        int horizontal = 0;
        int aim = 0;
        int depth = 0;
        for (String d : data) {
            String[] split = d.split(" ");
            int number = Integer.parseInt(split[1]);
            if (split[0].equals("forward")) {
                horizontal += number;
                depth += number * aim;
            } else if (split[0].equals("down")) {
                aim += number;
            } else if (split[0].equals("up")) {
                aim -= number;
            }
            System.out.println(depth);
            System.out.println(horizontal);
            System.out.println();
        }
        System.out.println(horizontal * depth);
    }
}
