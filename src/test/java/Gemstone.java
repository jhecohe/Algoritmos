import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.Test;

public class Gemstone {
	
	@Test
	void validateNumberOfGems() {
		List<String> rocks = List.of("abcdde", "baccd", "eeabg");
		
		if(rocks.size() < 2) {
			System.out.println(rocks.get(0).length());
		}
		
		HashMap<Character, Integer> lista = new HashMap<Character, Integer>();
		for (int i = 0; i < rocks.size(); i++) {
			char[] letters = rocks.get(i).toCharArray();
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < letters.length; j++) {
				if(sb.indexOf(letters[j]+"") == -1) {
					sb.append(letters[j]);
					if(lista.containsKey(letters[j])) {
						lista.put(letters[j], lista.get(letters[j])+1);
					} else {
						lista.put(letters[j], 1);
					}
				}
			}
			
		}
		
		int counter = 0;
		
		for (Integer sum : lista.values()) {
			if(sum == rocks.size()) {
				counter++;
			}
		}	
		
		System.out.println(counter);
	}
}
