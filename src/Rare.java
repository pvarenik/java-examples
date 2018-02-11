import java.util.*;

/*
Write a method that finds n-th most rare element in a list.

For example, nthMostRare(new int[] { 5, 4, 3, 2, 1, 5, 4, 3, 2, 5, 4, 3, 5, 4, 5 }, 2) should return 2. In the array, element 1 occurs once, 2 twice, 3 three times, 4 four times, and 5 five times, making element 1 the most rare element in the list and 2 the second most rare element.

Submit	Remaining time for this question: 46min 48sec
Java SE 8 Copy to IDE   Show starting code

 */

public class Rare {
//    public static int nthMostRare(int[] elements, int n) {
//        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//        for (int i : elements) {
//            Integer count = map.get(i);
//            map.put(i, count != null ? count+1 : 1);
//        }
//        if (map.get(n) == null) {
//            return 0;
//        }
//        return map.get(n);
//    }

    public static int nthMostRare(int[] elements, int n) {
        int count = 0;
        for (int i : elements) {
            if (i == n) count += 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int x = nthMostRare(new int[]{5, 4, 3, 2, 1, 5, 4, 3, 2, 5, 4, 3, 5, 4, 5}, 5);
        System.out.println(x);
    }
}