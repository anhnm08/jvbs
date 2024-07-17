package javabasic.learn_collection;

import java.util.*;

public class VdCollection {
    public static void main(String[]args){

        List<String> arrayList = new ArrayList<String>();// Arraylist lưu theo thứ tự
        arrayList.add("PHP");
        arrayList.add("Python");
        arrayList.add("Java");
        arrayList.add("C++");
        System.out.println("Các phần tử của ArrayList");
        System.out.print("\t" + arrayList + "\n");


        List<String> linkedList = new LinkedList<String>();
        linkedList.add("PHP");
        linkedList.add("Python");
        linkedList.add("Java");
        linkedList.add("C++");
        System.out.println("Các phần tử của LinkedList");
        System.out.print("\t" + linkedList + "\n");

        Set<Integer> integerSet = new HashSet<>(); //HashSet thì lưu ngẫu nhiên, không theo thứ tự input
        integerSet.add(17);
        integerSet.add(5);
        integerSet.add(30);
        integerSet.add(100);
        System.out.println("Các phần tử của integerSet" + integerSet);

        Set<Integer> integerTreeSet = new TreeSet<>(); //TreeSet thì sắp xếp theo thứ tự
        integerTreeSet.add(17);
        integerTreeSet.add(5);
        integerTreeSet.add(30);
        integerTreeSet.add(100);
        System.out.println("Các phần tử của integerTreeSet" + integerTreeSet);

        Map<String, String> stringMap = new HashMap();
        stringMap.put("project", "Bank");
        stringMap.put("company", "Viettel");
        System.out.println(stringMap);

        System.out.println(stringMap.get("company"));//truy xuất value cần có key

    }
}
