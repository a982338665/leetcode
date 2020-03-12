package $4插入排序;

import java.util.Arrays;

public class InsertTest {

    public static void main(String[] args) {
        int[] desc = desc(new int[]{1, 23, 4, 5, 6, 7777, 87, 7777});
        System.err.println(Arrays.toString(desc));
        int[] desc2 = insertionSort(new int[]{1, 23, 4, 5, 6, 7777, 87, 7777});
        System.err.println(Arrays.toString(desc2));
    }

    /**
     * 算比较-选择排序
     * @param x
     * @return
     */
    public static int[] desc(int[] x) {
        for (int i = 1; i < x.length; i++) {
            for (int j = 0; j < i ; j++) {
                //第0个位置为x[j] 第一个位置为x[i]
                //依次比较判断，总是把大的插在最前面,并假设前面的数据已经排好序
                //则通过比较，将值插入
                if (x[j]<x[i]){//第一个位置大于第二个位置，则交换，为逆序
                    //交换位置
                    int temp = x[j];
                    x[j] = x[i];
                    x[i] = temp;
                }
            }
        }
        return x;
    }


    /**
     * 插入排序
     * @param array
     * @return
     */
    public static int[] insertionSort(int[] array) {
        if (array.length < 2)
            return array;
        int current;
        for (int i = 0; i < array.length - 1; i++) {
            //当前索引对应的值
            current = array[i + 1];
            int preIndex = i;
            //当前的值比前一个值小时，将数组中的元素进行后移操作，给插入元素腾出空间
            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            //插入到腾好的空间，把当前值
            array[preIndex + 1] = current;
        }
        return array;
    }
}
