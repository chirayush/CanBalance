import java.util.Arrays;

final class CanBalance {
    static boolean isBalanced(final int[] inputArray) {
        if (inputArray.length <= 1) {
            return false;
        }

        for (int i = 0; i < inputArray.length; i++) {
            if (Arrays.stream(inputArray).limit(i).sum() ==
                    Arrays.stream(inputArray).skip(i).sum()) {
                return true;
            }
        }
        return false;
    }

}
