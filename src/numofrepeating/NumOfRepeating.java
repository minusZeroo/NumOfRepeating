/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numofrepeating;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author caniksea
 */
public class NumOfRepeating {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic he

        Scanner input = new Scanner(System.in);

        System.out.println("Enter sentence: "); //I am hungry
        String enteredSentence = input.nextLine().toLowerCase();

        String words[] = enteredSentence.split(" ");  // ["I", "am", "hungry"]

        Map<String, Integer> hold = new HashMap<>();

        for (String word : words) {
            char as[] = word.toCharArray();
            for (char a : as) {
                int count = 1;
                String c = Character.toString(a);
                if (hold.containsKey(c)) {
                    count = hold.get(c) + 1;
                }
                hold.put(c, count);
            }
        }

        System.out.println(hold);

        hold.entrySet().forEach((entry) -> {
            int value = entry.getValue();
            if (value > 1) {
                System.out.println("Character " + entry.getKey() + " occurred " + value + " times");
            }
        });

    }

}
