import java.util.Arrays;

public class IndexPairforTargetSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 6};
        int target = 7;
        IndexPairforTargetSum solver = new IndexPairforTargetSum();
        int[] result = solver.twoSum(nums, target);

        System.out.println("Indices: " + Arrays.toString(result));
    }
}
