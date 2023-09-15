
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 *
 * @author jhecohe
 */
public class MinimumSwap2 {
    
    @Test
    void validateSwaps(){
        //Link https://www.hackerrank.com/challenges/minimum-swaps-2/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
        
        
        int[] arr = {7, 1, 3, 2, 4, 5, 6}; //R: 5
        
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            
            int c=i+1;
            int index = i;
            
            while (c == arr[c] || index > 3) {                
                if(arr[c] < arr[index]){
                    break;
                }
                index++;
            }
            if(index != 1){
                int temp = arr[c];
                arr[c] = arr[index];
                arr[index] = temp;
                count++;
            }
            
        }
        
        System.out.println(count);
//        Assertions.assertEquals(5, count);
    }
    
}
