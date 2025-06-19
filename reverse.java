public class Main {
    public static void main(String[] args) {
        String str = "hello";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);  // adds each character from end to start
        }

        System.out.println("Reversed String: " + reversed);
    }
}
