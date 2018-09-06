import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class CanBalanceTest {
    @Test
    public void isBalancedShouldReturnFalseForSingleItemInArray() {
        assertFalse(CanBalance.isBalanced(new int[] {1}));
    }

    @Test
    public void isBalancedShouldReturnTrueForBalancedArray() {
        assertTrue(CanBalance.isBalanced(new int[] {2, 2}));
    }

    @Test
    public void isBalancedShouldReturnFalseForUnbalancedArrayOf2() {
        assertFalse(CanBalance.isBalanced(new int[] {3, 1}));
    }

    @Test
    public void isBalancedShouldReturnTrueBalancedArrayOf3() {
        assertTrue(CanBalance.isBalanced(new int[] {1, 2, 3}));
    }

    @Test
    public void codingBatTest1() {
        assertTrue(CanBalance.isBalanced(new int[] {1, 1, 1, 2, 1}));
    }

    @Test
    public void codingBatTest2() {
        assertFalse(CanBalance.isBalanced(new int[] {2, 1, 1, 2, 1}));
    }

    @Test
    public void codingBatTest3() {
        assertTrue(CanBalance.isBalanced(new int[] {10, 10}));
    }
}
