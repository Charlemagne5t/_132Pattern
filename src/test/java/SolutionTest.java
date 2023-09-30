import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void find132patternTest1(){
        int[] nums = {1,2,3,4};
        boolean actual = new Solution().find132pattern(nums);

        Assert.assertFalse(actual);
    }

    @Test
    public void find132patternTest2(){
        int[] nums = {3,1,4,2};
        boolean actual = new Solution().find132pattern(nums);

        Assert.assertTrue(actual);
    }

    @Test
    public void find132patternTest3(){
        int[] nums = {-1,3,2,0};
        boolean actual = new Solution().find132pattern(nums);

        Assert.assertTrue(actual);
    }
}
