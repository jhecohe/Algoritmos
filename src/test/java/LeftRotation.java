
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;


/**
 *
 * @author jhecohe
 */
public class LeftRotation {
    
    // Link: https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
    
    @Test
    void streamLeftRotation(){
        int d = 4; // Number the iterations to the left
        List<Integer> a = List.of(1, 2, 3, 4 ,5);
        
        List<Integer> link = new LinkedList<>(a);
        
        int counter =d;
        while(counter > 0){          
            link.add(link.get(0));
            link.remove(0);
            counter--;
        }
        
        System.out.println(link);
        
    }
}
