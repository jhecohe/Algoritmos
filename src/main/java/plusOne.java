import java.util.Arrays;

public class plusOne {

    // https://leetcode.com/problems/plus-one/
    public static int[] plus(int[] digits) {

        int size = digits.length-1;

        for (int i = size; i >=0 ; i--) {
            digits[i]++;
            if(digits[i] == 10){
                digits[i]=0;
            } else {
                return digits;
            }
        }

        int[] res = new int[size+2];
        res[0]=1;
        return res;
    }

    public static void main(String[] args) {
        int[] res = plus(new int[]{9,9,9});

        System.out.println(Arrays.toString(res));
    }
}
