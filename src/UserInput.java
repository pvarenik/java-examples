public class UserInput {

    public static class TextInput {
        public String v = "";
        void add(char c) {
            v += c;
        }
        String getValue() {
            return v;
        }
    }

    public static class NumericInput extends TextInput {
        void add(char c) {
            if(Character.isDigit(c)) {
                v += c;
            }
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}
