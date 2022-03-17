package Task2;

import java.util.*;

public class Collection {
    public static void main(String[] args) {

        int[] nums = new int[10];

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Cat");
        list1.add("Dog");
        list1.add("Fox");
        list1.add("Bear");
        list1.add("Parrot");
        list1.add("Owl");

        System.out.println("Коллекция 1:");
        list1.forEach(s -> System.out.println(s));
        list1.stream().filter(s -> s=="Parrot"||s=="Owl").forEach(s -> System.out.println("Животное является птицей: " + s));

        HashMap<String,String> map1 = new HashMap<>();
        map1.put("1", "x1");
        map1.put("2", "x2");
        map1.put("3", "x3");
        map1.put("4", "x1");

        for (Map.Entry<String,String> m :map1.entrySet()) {
            System.out.println("Key= "+ m.getKey());
            System.out.println("Value= "+ m.getValue());
        }

        Collections.sort(list1);
        System.out.println("Сортировка:");
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, 4, 8, 10, 3, 4, 6));

        System.out.println("Коллекция 2:");
        list2.forEach(s -> System.out.println(s));
        list2.stream().filter(s -> s>5).forEach(s -> System.out.println("Число больше 5: " + s));

        System.out.println("Максимальный элемент:" + Collections.max(list2));
        System.out.println("Минимальный элемент:" + Collections.min(list2));

        HashMap<Integer,Integer> map2 = new HashMap<>();
        map2.put(11, 1190);
        map2.put(22, 2340);
        map2.put(33, 102);
        map2.put(33, 451);

        for (Map.Entry<Integer,Integer> m :map2.entrySet()) {
            System.out.println("Key= "+ m.getKey());
            System.out.println("Value= "+ m.getValue());
        }


    }
}
