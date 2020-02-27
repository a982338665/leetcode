package $2冒泡排序;

import java.util.Arrays;

/**
 * 交换元素，逐渐上浮
 */
public class MaoPaoTest {

    public static void main(String[] args) {
        int[] x = new int[]{12, 3, 4, 555, 2,3,3,2,1,33,333};
        int[] asc = asc(x);
        System.err.println(Arrays.toString(asc));
        int[] desc = desc(x);
        System.err.println(Arrays.toString(desc));

    }


    /**
     * 升序
     *
     * @param x
     * @return
     */
    public static int[] asc(int[] x) {
        int temp = 0;//临时交换元素
        //第一个元素
        for (int i = 0; i < x.length; i++) {
            //第一个元素后的所有元素
            for (int j = i + 1; j < x.length; j++) {
                //拿当前元素，与其之后的所有元素作比较，如果当前元素比较大，则交换位置
                if (x[i] > x[j]) {
                    //交换位置
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
        return x;
    }

    /**
     * 降序
     *
     * @param x
     * @return
     */
    public static int[] desc(int[] x) {
        int temp = 0;//临时交换元素
        //第一个元素
        for (int i = 0; i < x.length; i++) {
            //第一个元素后的所有元素
            for (int j = i + 1; j < x.length; j++) {
                //拿当前元素，与其之后的所有元素作比较，如果当前元素比较大，则交换位置
                if (x[i] < x[j]) {
                    //交换位置
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
        return x;
    }
}
