import java.util.Arrays;

public class GenerateNumbers {

    // Given two numbers generate all numbers in that interval and wich ones are secure
    // A number is unsafe if the first digit is equlas to the last digit

    public static boolean validatePassword(int left, int right) {
        int[] nums = new int[right - left + 1];
        for(int i = 0; i < right-left+1; i++) {
            nums[i] = i + 1;
        }
        permute(nums, left); // se envia el arreglo y el numero con el que empieza la serie
        // Arrays.stream(nums).forEach(System.out::print);
        return false;
    }

    public static void permute(int[] nums, int start){
        if(start == nums.length){
            System.out.println(Arrays.toString(nums));
            String num = Arrays.toString(nums);
            if(num.charAt(0) == num.charAt(nums.length)){
                System.out.println("Insecure");
            }

            return;
        }

        for(int i = start; i < nums.length; i++){
            swap(nums, start, i); // Se envia el arreglo, right o el numero con el que empieza el numero, y la posicion del ciclo
            permute(nums, start + 1);
            swap(nums, start, i);
        }
    }

    private static void swap(int[] nums, int start, int i) {
        int temp = nums[start];
        nums[start] = nums[i];
        nums[i] = temp;
    }

    public static void main(String[] args) {
        int left = 1;
        int right = 4;
        boolean isValid = validatePassword(left, right);
        System.out.println("Is the password valid? " + isValid);
    }
}
