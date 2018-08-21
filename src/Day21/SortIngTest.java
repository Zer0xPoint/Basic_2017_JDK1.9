package Day21;

import java.util.Arrays;

public class SortIngTest {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 5, 4};
        int[] numsBubbleSort = bubbleSort(nums);
        show(numsBubbleSort);
        int[] numsSelectSort = selectSort(nums);
        show(numsSelectSort);

        binarySearch(nums, 0, nums.length - 1, 3);
        System.out.println(Arrays.toString(nums));
        /*
        public static String toString ( int[] a){
            if (a == null)
                return "null";
            int iMax = a.length - 1;
            if (iMax == -1)
                return "[]";

            StringBuilder b = new StringBuilder();
            b.append('[');
            for (int i = 0; ; i++) {
                b.append(a[i]);
                if (i == iMax)
                    return b.append(']').toString();
                b.append(", ");
            }
        }
        */
        System.out.println(Arrays.binarySearch(nums, 3));//二分查找
        /*
        public static int binarySearch ( int[] a, int fromIndex, int toIndex,
        int key){
            rangeCheck(a.length, fromIndex, toIndex);
            return binarySearch0(a, fromIndex, toIndex, key);
        }

        // Like public version, but without range checks.
        private static int binarySearch0 ( int[] a, int fromIndex, int toIndex,
        int key){
            int low = fromIndex;
            int high = toIndex - 1;

            while (low <= high) {
                int mid = (low + high) >>> 1;
                int midVal = a[mid];

                if (midVal < key)
                    low = mid + 1;
                else if (midVal > key)
                    high = mid - 1;
                else
                    return mid; // key found
            }
            return -(low + 1);  // key not found.
        }
        */
    }

    // TODO: 2018/8/13 MergeSort,HeapSort,QuickSort,etc

    static int[] bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {//最大索引之后都已经排序完成
                if (nums[j + 1] < nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }

    static int[] selectSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    static void binarySearch(int[] nums, int left, int right, int target) {
        int mid = left - (left - right) / 2;
        if (nums[mid] == target) {
            System.out.println(mid);
        } else if (nums[mid] > target) {
            binarySearch(nums, left, mid - 1, target);
        } else if (nums[mid] < target) {
            binarySearch(nums, mid + 1, right, target);
        } else {
            System.out.println(-1);
        }
    }

    static void show(int[] nums) {
        for (int num : nums) {
            System.out.print(num);
        }
        System.out.println("\n");
    }
}
