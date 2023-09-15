
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class SherlokandTheValidString {

    @Test
    public void isValid() {
        // Write your code here
        // YES
        BufferedReader br;
        StringBuilder sb = new StringBuilder();
        String s;
        try {
            br = new BufferedReader(new FileReader("src/main/resources/SherlokandTheValidString.txt"));
            sb.append(br.readLine());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SherlokandTheValidString.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SherlokandTheValidString.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        s = sb.toString();
//		YES
//		String s = "abcdefghhgfedecba";
//		NO
//		String s = "aabbccddeefghi";

        String valid = "YES";
        HashMap<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (freq.containsKey(s.charAt(i))) {
                freq.put(s.charAt(i), freq.get(s.charAt(i)) + 1);
            } else {
                freq.put(s.charAt(i), 1);
            }
        }
        System.out.println(freq);

        List<Integer> v = new ArrayList<>(freq.values());
        Collections.sort(v);
        System.out.println(v);
        
        for (int i = 1; i < v.size(); i++) {
            int diff = Math.abs(v.get(i-1) - v.get(i));
            if(v.get(i-1) > 1 && diff > 1) {
                valid = "NO";
                break;
            }
        }

        assertEquals("YES", valid);
//		return valid;
    }

}
