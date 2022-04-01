package pro.sky.java.course2;

import java.util.*;

public class Main {

    public static void oddNumbersPrint(List<Integer> list) {
        for (Integer integer : list) {
            if (integer % 2 != 0) {
                System.out.print(integer + " ");
            }
        }
        System.out.println();
    }

    public static void evenNumbersPrint(List<Integer> list) {
        Set<Integer> set = new TreeSet<>(list);
        for (Integer integer : set) {
            if (integer % 2 == 0) {
                System.out.print(integer + " ");
            }
        }
        System.out.println();
    }

    public static void evenStringPrint(List<String> list) {
        Set<String> set = new TreeSet<>(list);
        for (String str : set) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public static void doubleStringPrint(List<String> list) {
        Map<String, Integer> map = new HashMap<>();

        for (String str : list) {
            int count = Collections.frequency(list, str);
            map.put(str, count);
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        List<String> words = new ArrayList<>(List.of("one", "two", "three", "one",
                "one", "three", "four", "five", "five"));

        oddNumbersPrint(nums);
        evenNumbersPrint(nums);
        evenStringPrint(words);
        doubleStringPrint(words);
    }
}
