
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author jhecohe
 */
public class MinimumSwap2 {

    @Test
    void validateSwaps() {
        //Link https://www.hackerrank.com/challenges/minimum-swaps-2/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays

        int[] arr = {7, 1, 3, 2, 4, 5, 6}; //R: 5
        int counter = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] > arr[i + 2]) {
                int temp = arr[i];
                arr[i] = arr[i + 2];
                arr[i + 2] = temp;
                --i;
                counter++;
                for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j]);
            }
            System.out.println(" - ");
                continue;
            }
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                counter++;
                for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j]);
            }
            System.out.println(" - ");
            }
            
        }

        System.out.println("count: " + counter);
//        Assertions.assertEquals(5, count);
    }
}
