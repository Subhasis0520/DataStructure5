package practice;

import java.util.HashSet;

public class RemoveDuplicateElements {
    public static void main(String[] args) {

//        int arr[] ={10,11,10,13,14,16,65,13,44,11};
        char arr[] ={'s','u','b','h','a','s','i','s'};
        HashSet<Character> set = new HashSet<>();

        for (int i =0;i<arr.length;i++){
            char element = arr[i];
            set.add(element);
        }
        for (char i:set) {
            System.out.println(i);
        }

    }
}
