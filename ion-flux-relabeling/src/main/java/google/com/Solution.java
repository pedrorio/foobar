package google.com;

public class Solution {

    public static int[] solution(int depth, int[] indexes) {

        int head = (int) Math.pow(2, depth) - 1;
        int[] result = new int[indexes.length];

        for (int i = 0; i < indexes.length; i++) {
            if (indexes[i] < head && indexes[i] >= 1) {
                result[i] = locate(head, indexes[i], head - 1);
            } else {
                result[i] = -1;
            }
        }

        return result;
    }

    public static int locate(int head, int target, int under) {

        under /= 2;

        int right = head - 1;
        int left = head - 1 - under;

        if (right == target || left == target)
            return head;
        else {
            if (target <= left)
                return locate(left, target, under - 1);
            else
                return locate(right, target, under - 1);
        }
    }


}