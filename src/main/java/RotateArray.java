import java.util.Arrays;

public class RotateArray {

    /*
    You may have been using Java for a while. Do you think a simple Java array question
    can be a challenge? Let’s use the following problem to test.
    Problem: Rotate an array of n elements to the right by k steps. For example, with n
    = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]. How many different
    ways do you know to solve this problem?
     */

    public static int[] rotate(int n, int k) {
        int[] array = createArray(n);
        int[] result = new int[n];
        int rotatedIt = 0;

        for(int i = 0; i < array.length; i++) {
            if(k != 0) {
                result[i] = array[array.length - k];
                k--;
            }
            else {
               result[i] =  array[rotatedIt];
               rotatedIt++;
            }
        }

        return result;
    }

    public static int[] createArray(int n) {
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            int element = i + 1;
            array[i] = element;
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = rotate(7, 3);
        System.out.println(Arrays.toString(array));
    }
}
