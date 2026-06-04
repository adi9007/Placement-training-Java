public class sumofdigits {
    public static int sumofdigits(int num) {
        if (num ==0) {
            return 0;
        }
        return (num % 10) + sumofdigits(num / 10);
    }
    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Sum of digits = " + sumofdigits(num));
    }
}