import java.util.Arrays;

public class CreateNumbers {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i]= i+1;
        }

        permute(numbers, 0);
        System.out.println("++++++++++++++++++++++++++");
        Arrays.stream(numbers).forEach(System.out::print);
    }

    public static void permute(int[] nums, int start){

        if(start == nums.length){
            System.out.println(Arrays.toString(nums));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i);
            permute(nums, start+1);
            swap(nums, start, i);
        }
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
