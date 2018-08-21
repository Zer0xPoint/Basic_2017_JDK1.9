package Day16;

import java.util.Scanner;

public class AddNumToList {
    public static void main(String[] args) {
        int[] ints = new int[10];
//        boolean flag = true;
        while (true) {
            int i = new Scanner(System.in).nextInt();
            if (i != 0) {
                if (find(ints, i) == 10) {
                    int res = insert(ints, i);
                    if (res == 10) {
//                        flag = false;
                        break;
                    }
                } else {
                    System.out.println("重复 重新输入");
                }
            } else {
                System.out.println("0重新输入");
            }
        }
    }
    static int find(int[] ints, int i) {
        heapSort(ints);
        int low = 0;
        int high = ints.length - 1;
        int mid = ints.length / 2;
        if (i == ints[mid]) {
            return mid - 1;
        }
        while (low < high) {
            mid = low + (high - low) / 2;
            if (ints[mid] == i)
                return mid;
            else if (ints[mid] < i)
                low = mid + 1;
            else high = mid - 1;
        }
        return 10;
    }
    static int insert(int[] ints, int i) {
        for (int j = 0; j < ints.length; j++) {
            if (ints[j] == 0) {
                ints[j] = i;
                return j;
            }
        }
        return 10;
    }

    static void adjustHeap(int[] a, int i, int len) {
        int temp, j;
        temp = a[i];
        for (j = 2 * i; j < len; j *= 2) {
            if (a[j] < a[j + 1])
                ++j;
            if (temp >= a[j])
                break;
            a[i] = a[j];
            i = j;
        }
        a[i] = temp;
    }

    static void heapSort(int[] a) {
        int i;
        for (i = a.length / 2 - 1; i >= 0; i--) {
            adjustHeap(a, i, a.length - 1);
        }
        for (i = a.length - 1; i >= 0; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            adjustHeap(a, 0, i - 1);
        }
    }
}
