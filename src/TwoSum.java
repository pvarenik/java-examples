import java.util.stream.IntStream;

public class TwoSum {

    static int findIndex(int[] list, int value, int start) {
        for(int i = start; i < list.length; i++)
            if(list[i] == value)
                return i;
        return -1;
    }

    private static int find(int[] a, int target, int start) {
        return IntStream.range(start, a.length)
                .filter(i -> target == a[i])
                .findFirst()
                .orElse(-1);
    }

    private static int[] findTwoSum(int[] list, int sum) {
        for(int i = 0; i < list.length; i++) {
//            int index = findIndex(list, sum - list[i], i + 1);
            int index = find(list, sum - list[i], i + 1);
            if(index != -1)
                return new int[] {i, index};
        }
        return null;
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 1, 3, 5, 7, 9 }, 12);
        if (indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        } else {
            System.out.println((Object) null);
        }
    }
}