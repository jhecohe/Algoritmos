import java.util.HashSet;
import java.util.Set;

public class JewelAndStones {

    public static int countJewels(String jewels, String stones) {
        Set<Character> jewelSet = new HashSet<>();

        for (char c : jewels.toCharArray()) {
            jewelSet.add(c);
        }

        int count = 0;
        for (char c : stones.toCharArray()) {
            if (jewelSet.contains(c)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(countJewels(jewels, stones)); // 3
    }
}
