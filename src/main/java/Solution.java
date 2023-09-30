import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public boolean find132pattern(int[] nums) {
        if(nums.length < 3){
            return false;
        }
        int left = -1;
        int mid = -1;

        Stack<int[]> pairs = new Stack<>();
        int min = Integer.MAX_VALUE;
        //find first valid pair
        int i = 0;
        for (; i < nums.length; i++) {
            if(nums[i] < min){
                left = i;
                min = nums[i];
            }else if(left != -1 && nums[i] > nums[left]){
                mid = i;
                break;
            }
        }
        if (mid == -1) {
            return false;
        }
        pairs.push(new int[]{nums[left], nums[mid]});
        i++;
        for (; i < nums.length; i++) {
            int current = nums[i];
            if (current < min) {
                pairs.push(new int[]{current, current});
                min = current;
            } else {
                while (!pairs.isEmpty() && pairs.peek()[1] < current)
                    pairs.pop();
            }
            if (!pairs.isEmpty() && current > pairs.peek()[0] && current < pairs.peek()[1]) {
                return true;
            } else {
                pairs.push(new int[]{min, current});
            }

        }

        return false;
    }
}
