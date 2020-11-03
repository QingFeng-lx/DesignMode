package test;


import org.junit.Test;

import java.util.Arrays;

public class AllTest {
    public void rotate(int[] nums, int k) {
        int[] save = new int[nums.length];
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            save[(i + k) % nums.length] = nums[i];
        }
        System.out.println(Arrays.toString(save));
    }

    @Test
    public void test2() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 1);

    }

    @Test
    public void test() {

    }
}
