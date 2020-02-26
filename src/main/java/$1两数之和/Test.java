package $1两数之和;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，
 * 并返回他们的数组下标。是否存在-只找一个即可
 */
public class Test {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 6, 5, 1, 6};
        int target = 9;
        int[] ints = twoSum(nums, target);
        int[] ints2 = twoSum1(nums, target);
        int[] ints3 = twoSum2(nums, target);
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(ints2));
        System.out.println(Arrays.toString(ints3));
    }

    /**
     * 暴力破解：
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     * 对于每个元素，我们试图通过遍历数组的其余部分来寻找它所对应的目标元素，这将耗费 O(n)O(n) 的时间。因此时间复杂度为 O(n^2)
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    /**
     * 两遍Hash：拿空间换时间
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum1(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        //第一遍存值：这就是额外空间
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            //取差值
            int val = target-nums[i];
            //判断该差值下标，与hash表下标不等的数据
            if(map.containsKey(val) && map.get(val)!=i){
                return new int[]{i,map.get(val)};
            }
        }
        return null;
    }
    /**
     * 1遍Hash：拿空间换时间
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        //第一遍存值：这就是额外空间
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }

        return null;
    }

}
