package $5希尔排序;

import java.util.Arrays;

public class XierTest {


    public static void main(String[] args) {
        int[] x = new int[]{8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
//        desc(x);
        desc2(x);
    }


    public static int[] desc(int[] x) {
        if (x.length < 2) return x;
        int n = x.length;//10
        int gap = x.length / 2;//5
        for (; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {//5-10,i从5开始到10
                int current = x[i];//当前值下标为5
                int preIndex = i-gap ;//前一个值,即下标为0的
                //最终0-5 1-6 2-7 3-8 4-9 分为了五组，对每组都进行插入排序
                //按组插入，组内元素两两相隔gap
                for (; current<x[preIndex] && preIndex>=0;preIndex -= gap ) {
                    x[preIndex+gap] = x[preIndex];
                }
                x[preIndex+gap]=current;
            }
        }
        System.err.println(Arrays.toString(x));
        return x;
    }
    public static void desc2(int[] arr) {
        int N = arr.length;
        for (int gap = N/2; gap < 0; gap/=2) {
            for (int i = gap; i < N ; i++) {
                insert(arr,gap,i);
            }
        }
        System.err.println(Arrays.toString(arr));
    }

    private static void insert(int[] arr, int gap, int i) {
        int insert = arr[i];
        int j;
        for (j=i-gap; j>=0 && insert<arr[j] ; j-=gap) {
            arr[j+gap]=arr[j];
        }
        arr[j+gap]=insert;
    }

}
