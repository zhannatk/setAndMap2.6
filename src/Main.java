import java.util.*;

public class Main {


    public static void main(String[] args) {
        ArrayList<Integer> numsLIST = new ArrayList<>(List.of(30, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        LinkedList<Integer> numsLinkedLIST = new LinkedList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        HashSet<Integer> numsSET = new HashSet<>(List.of(1, 2, 3, 4, 5, 6, 7));
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

        System.out.println("ЗАДАНИЕ 1");
        checkOdd(numsLIST);
        checkOdd(numsLinkedLIST);
        checkOdd(numsSET);

        System.out.println("ЗАДАНИЕ 2");
        checkEven(numsLIST);

        System.out.println("ЗАДАНИЕ 3");
        checkUnique(strings);
        checkUnique("мама мыла раму очень грязную раму");


        System.out.println("ЗАДАНИЕ 4");
        checkOdd(numsSET);
        countDuplicate(strings);

/*
        ArrayList<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.print(num);
                System.out.println();
            }
        }


        List<Integer> nums2 = new ArrayList<>(List.of(10, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> uniqueEvens = new TreeSet<>();

        for (int num : nums2) {
            if (num % 2 == 0) {
                uniqueEvens.add(num);
            }
        }

        for (int even : uniqueEvens) {
            System.out.print(even);
        }*/

    }

    public static void checkOdd(Collection<Integer> collectionOfInt) {
        System.out.print("Collection is: ");
        System.out.print(collectionOfInt.getClass() + " :  ");
        System.out.println(collectionOfInt);

        for (Integer i : collectionOfInt) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }


    public static void checkUnique(String text) {
        checkUnique(List.of(text.split(" ")));
    }

    public static void checkUnique(Collection<String> collectionOfString) {
        System.out.print("Collection is: ");
        System.out.print(collectionOfString.getClass() + " :  ");
        System.out.println(collectionOfString);

        HashSet<String> str = new HashSet<>(collectionOfString);
        System.out.println(str);
    }


    public static void checkEven(ArrayList<Integer> listOfInt) {
        System.out.print("Collection is: ");
        System.out.print(listOfInt.getClass() + " :  ");
        System.out.println(listOfInt);
        Set<Integer> tmp = new TreeSet<>(listOfInt);

        for (Integer i : tmp) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
 /*       for (int outerIndex=0;outerIndex<listOfInt.size();outerIndex++) {
            boolean was = false;
            for (int indexInner = 0; indexInner < listOfInt.size(); indexInner++) {
                if (indexInner!=outerIndex && listOfInt.get(outerIndex).equals(listOfInt.get(indexInner))) {was = true; break;}
            }
            if (!was) System.out.println(listOfInt.get(outerIndex));


        }
*/

    }

    public static void countDuplicate(Collection<String> collection) {
        System.out.print("Collection is: ");
        System.out.print(collection.getClass() + " :  ");
        System.out.println(collection);

        Map<String, Integer> map = new HashMap<>();
        for (String s : collection) {
            if (map.containsKey(s)) {
                int count = map.get(s);
                map.put(s, count + 1);
            } else {
                map.put(s, 1);
            }
        }
        System.out.println(map);
    }
}

