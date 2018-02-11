import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class Branches {
    public static int count(int[] tree) {
        int[] noDuplicates = IntStream.of(tree).distinct().toArray();
        return noDuplicates.length - 1;
    }

    public static void main(String[] args) {
        System.out.println(Branches.count(new int[]{1, 3, 1, -1, 3}));
    }
}