public class SortedSearch {

    static int findIndex(int[] list, int value) {
        double index = list.length / 2;
        int start, finish;
        if (value <= list[(int) index]) {
            start = (int) index;
            finish = 0;
        } else {
            start = list.length;
            finish = (int) index;
        }
        for (int i = start - 1; i >= finish; i--) {
            if (value > list[i]) {
                return i + (int) index - 1;
            }
        }
        return 0;
    }

    public static int countNumbers(int[] sortedArray, int lessThan) {
        return findIndex(sortedArray, lessThan);
    }

    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers(new int[]{0, 3, 7, 8}, 0));
    }
}