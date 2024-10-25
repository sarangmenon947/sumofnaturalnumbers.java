public class sumofnaturalnumbers {
    // Recursive Method To Calculate Sum Of Natural Numbers
    public static int sum(int n) {
        if (n <= 1) {
            return n;
        } else {
            return n + sum(n - 1);
    }
    }
    public static void main(String[] args) {
        int number = 10;
        System.out.println("Sum Of Natural Numbers Up To " + number + " Is: " + sum(number));
    }}
