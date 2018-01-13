import java.util.ArrayList;

public class TrainComposition {
    public ArrayList<Integer> composition = new ArrayList<>();

    public TrainComposition() {
        this.composition = new ArrayList<>();
    }

    public void attachWagonFromLeft(int wagonId) {
        this.composition.add(0, wagonId);
    }

    public void attachWagonFromRight(int wagonId) {
        this.composition.add(wagonId);
    }

    public int detachWagonFromLeft() {
        return this.composition.remove(0);
    }

    public int detachWagonFromRight() {
        return this.composition.remove(this.composition.size() - 1);
    }

    public static void main(String[] args) {
        TrainComposition tree = new TrainComposition();
        tree.attachWagonFromLeft(7);
        tree.attachWagonFromLeft(13);
        System.out.println(tree.detachWagonFromRight()); // 7
        System.out.println(tree.detachWagonFromLeft()); // 13
    }
}