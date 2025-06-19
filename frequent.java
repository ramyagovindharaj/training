public class Main {
    public static void main(String[] args) {
        String str = "banana";
        int[] count = new int[256];  // ASCII size

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        char maxChar = ' ';
        int max = 0;

        for (int i = 0; i < 256; i++) {
            if (count[i] > max) {
                max = count[i];
                maxChar = (char) i;
            }
        }

        System.out.println("Most frequent character: '" + maxChar + "' -> " + max + " times");
    }
}
