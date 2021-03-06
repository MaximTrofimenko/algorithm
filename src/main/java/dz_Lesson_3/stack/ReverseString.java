package dz_Lesson_3.stack;

public class ReverseString {
    static String str = "польская запись";

    public static void main(String[] args) {
        new ReverseString(str).reverse();

        /*//колхозная реализация
        Stack<Character> stack = new StackImpl<>(str.length());
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        while ( !stack.isEmpty()){
            System.out.println(stack.pop());
        }*/
    }

    public ReverseString(String str){
        this.str = str;
    }
    private void reverse(){
        if (str.length() != 0){
            Stack<Character> stack = new StackImpl<>(str.length());
            for (int i = 0; i < str.length(); i++) {
                stack.push(str.charAt(i));
            }
            print(stack);
        }
        else {
            System.out.println("пустая строка");
        }
    }

    private void print(Stack<Character> stack) {
        while ( !stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
