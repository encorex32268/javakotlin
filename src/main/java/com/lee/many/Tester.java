package com.lee.many;

import java.util.*;

public class Tester {
    public static void main(String[] args) {

//        hashmap();
//        set();
//        arryInt();
//        list();
    }

    private static void hashmap() {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("book","書");
        hashMap.put("apple","蘋果");
        hashMap.put("cat","貓");
        hashMap.put("dog","狗");
        for (String key : hashMap.keySet()){
            System.out.println(key);
        }
        System.out.println(hashMap.get("book"));
    }

    private static void set() {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(5);
        hashSet.add(3);
        hashSet.add(2);
        hashSet.add(4);
        System.out.println(hashSet);
    }

    private static void arryInt() {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 66;
        numbers[2] = 3;
        numbers[3] = 50;
        numbers[4] = 22;
        System.out.println(numbers);
        for (int i : numbers){
            System.out.println(i);
        }
    }

    private static void list() {
        List<Integer> integers = new ArrayList<Integer>();
        integers.add(1);
        integers.add(3);
        integers.add(7);
        integers.add(5);
        System.out.println(integers);
        for (int integer : integers){
            System.out.println(integer);
        }
    }
}
