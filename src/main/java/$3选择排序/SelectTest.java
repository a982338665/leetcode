package $3选择排序;

import java.util.Arrays;

/**
 * 选择排序
 */
public class SelectTest {

    public static void main(String[] args) {
        int[] x = new int[]{12, 3, 4, 555, 2, 3, 3, 2, 1, 33, 333};
        int[] asc = asc(x);
        System.err.println(Arrays.toString(asc));
//        int[] desc = desc(x);
//        System.err.println(Arrays.toString(desc));
    }


    public static int[] asc(int[] x) {
        //第一个输入
        for (int i = 0; i < x.length; i++) {
            //假设最小值下标为min
            int min = i;
            //排查之后元素有没有比min还小的
            for (int j = i + 1; j < x.length; j++) {
                //有比最小值还大的
                if (x[min] > x[j]) {
                    //更新最小值索引为j
                    min = j;
                }
            }
            //找到最小值的索引,与原来最小值值交换位置
            //将比较过后的最小值赋值给tmp
            int tmp = x[min];
            //将当前作比较的该位置的值与获取到的最小值交换位置
            x[min] = x[i];
            //将最小值赋给，当前位置
            x[i] = tmp;
        }
        return x;
    }
}
