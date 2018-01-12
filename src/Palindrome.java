public class Palindrome {
    public static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < (n/2); ++i) {
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(n - i - 1))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}