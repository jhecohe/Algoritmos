public class PasswordSecurity {

    // isSecure(int n) gets the first and last digit of the number.
    // If both digits are equal, the number is considered unsafe.
    // countSecureNumbers(left, right) checks every number in the interval and
    // counts the secure ones.
    public static boolean isSecure(int n) {
        n = Math.abs(n);

        if (n < 10) {
            return false; // single-digit numbers are usually treated as unsafe
        }

        int lastDigit = n % 10;
        int firstDigit = n;

        while (firstDigit >= 10) {
            firstDigit /= 10;
        }

        return firstDigit != lastDigit;
    }

    public static int countSecureNumbers(int left, int right) {
        if (left > right) {
            int temp = left;
            left = right;
            right = temp;
        }

        int count = 0;
        for (int i = left; i <= right; i++) {
            if (isSecure(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int left = 10;
        int right = 25;

        System.out.println(countSecureNumbers(left, right));
    }
}
