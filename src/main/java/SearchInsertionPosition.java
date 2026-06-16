import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class SearchInsertionPosition {

    // https://leetcode.com/problems/search-insert-position/

    public int searchInsert(int[] nums, int target) {
        // Use a hash, we need to validate position so we need to go throught the array
        // We can iterate the array in look up for the target
        // if it is not locate we can return the index

        Map<Integer, Integer> mapa = new HashMap();
        for(int i=0; i< nums.length; i++){
            mapa.put(nums[i], i);
        }

        if (mapa.containsKey(target)) {
            return mapa.get(target);
        }

        for(Map.Entry<Integer, Integer> val :mapa.entrySet()){
            if(val.getKey() > target){
                return val.getValue();
            }
        }
        return nums.length;
    }
}