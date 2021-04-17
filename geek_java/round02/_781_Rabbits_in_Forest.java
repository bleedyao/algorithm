package round02;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class _781_Rabbits_in_Forest {
    public static void main(String[] args) {
        System.out.println(numRabbits(new int[]{1, 1, 2}));     // 5
        System.out.println(numRabbits(new int[]{10, 10, 10}));  // 11
        System.out.println(numRabbits(new int[]{}));            // 0

        System.out.println(numRabbits1(new int[]{1, 1, 2}));     // 5
        System.out.println(numRabbits1(new int[]{10, 10, 10}));  // 11
        System.out.println(numRabbits1(new int[]{}));            // 0

        System.out.println(numRabbits1(new int[]{10, 10, 10, 10}));
    }

    public static int numRabbits(int[] answers) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int y: answers){
            count.put(y, count.getOrDefault(y, 0) + 1); 
        }
        int result = 0;
        for (Map.Entry<Integer,Integer> entry: count.entrySet()) {
            int m = entry.getKey(), n = entry.getValue();
            result += (m + n) / (m + 1) * (m + 1);
        }
        return result;
    }

    public static int numRabbits1(int[] answers) {
        int[] m = new int[1000];
        int result = 0;
        for (int i : answers) {
            if (m[i] > 0) {
                m[i]--;
            } else {
                m[i] = i;
                result += i + 1;
            }
        }
        return result;
    }
}
