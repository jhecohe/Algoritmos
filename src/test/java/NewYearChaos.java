
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 *
 * @author jhecohe
 */
public class NewYearChaos {
    
    //Link https://www.hackerrank.com/challenges/new-year-chaos/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
    
    @Test
    void validateBribes(){
//        List<Integer> q = List.of(5,1,2,3,7,8,6,4); //R:Too chaotic
//        List<Integer> q = List.of(1,2,5,3,7,8,6,4); //R:7
          List<Integer> q = new ArrayList<>();
          q.add(1);
          q.add(2);
          q.add(5);
          q.add(3);
          q.add(7);
          q.add(8);
          q.add(6);
          q.add(4);
          
        boolean chaotic = false;
        int count = 0;
        
        for(int i = q.size(); i > 0; i-- ){
            int c = i - 1;
            int one = i - 2;
            int two = i - 3;
        
            if(i != q.get(c)){
                if(i == q.get(one)){
                    Collections.swap(q, c, one);
                    count++;
                    continue;
                }
                if(i == q.get(two)){
                    Collections.swap(q, c, two);
                    Collections.swap(q, two, one);
                    count += 2;
                    continue;
                }
                chaotic = true;
                break;
            }
        }
        
        if(chaotic){
            System.out.println("Too chaotic");
        } else  {
             System.out.println(count);
        }
        
        Assertions.assertEquals(7, count);
    }   
}
