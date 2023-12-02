//part 1
package org.thehuglio;

import java.io.File;
import java.util.List;

public class Main {

    private static final List<String> data = new Reader(new File("data.txt")).data;


    public static void main(String[] args) {
        int depth = 10000000;
        int tot = 0;
        for (String d : data) {
            if (Integer.parseInt(d) > depth) {
                tot++;
            }
            depth = Integer.parseInt(d);
        }
        System.out.println(tot);
    }
}
