import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseNumber {

    @Test
    public void validateReverseNumber(){
        Assertions.assertEquals(22, reverse(22));
    }

    private static int reverse(int number){
        int reverse = 0;

        while(number != 0){
            int tMod =number%10;
            reverse = reverse*10 + tMod;
            number = number/10;
        }

        return reverse;
    }
}
