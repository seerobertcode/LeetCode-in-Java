import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

    public static void main(String[] args) {
        int[] inputArray = {4, 1, 2, 1, 2};
        System.out.println(singleNumberBruteForce(inputArray));
        System.out.println(singleNumberConstantComplexity(inputArray));
    }

    //4 - 0100
    //1 - 0001
    //2 - 0010
    //1 - 0001
    //2 - 0010
    public static int singleNumberConstantComplexity(int[] nums) {
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }

    public static int singleNumberBruteForce(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Set<Integer> newSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (newSet.contains(nums[i])) {
                newSet.remove(nums[i]);
            } else {
                newSet.add(nums[i]);
            }
        }
        return newSet.iterator().next();
    }
}

