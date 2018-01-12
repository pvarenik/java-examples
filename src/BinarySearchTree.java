public class BinarySearchTree {

    public static int cmp(int a, int b) {
        int res = 0;
        if (a < b) res = 1;
        if (a == b) res = 0;
        if (a > b) res = -1;
        return res;
    }

    static boolean contains(Node root, int value) {
        if (root == null) {
            return false;
        }
        int compare = cmp(root.value, value);
        if (compare == 0) {
            return true;
        }
        if (compare == -1) {
            return contains(root.left, value);
        }
        if (compare == 1) {
            return contains(root.right, value);
        } else {
            return false;
        }
    }

//    static boolean contains(Node root, int key) {
//        if (root == null) {
//            return false;
//        }
//        if (root.value == key)
//            return true;
//        if (key < root.value)
//            return contains(root.left, key);
//        else
//            return contains(root.right, key);
//    }

    public static void main(String[] args) {
        Node n1 = new Node(1, null, null);
        Node n3 = new Node(3, null, null);
        Node n2 = new Node(2, n1, n3);

        System.out.println(contains(n2, 3));
    }
}
