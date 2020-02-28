package $3选择排序;

import java.util.Arrays;

/**
 * 选择排序
 */
public class SelectTest {

    public static void main(String[] args) {
        int[] x = new int[]{12, 3, 4, 555, 2, 3, 3, 2, 1, 33, 333};
        int[] asc = asc(x);
//        System.err.println(Arrays.toString(asc));
        int[] desc = asc2(x);
        System.err.println(Arrays.toString(desc));
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

    public static int[] desc(int[] x) {

        for (int i = 0; i < x.length; i++) {
            //最小值下标为min，值为x[min]
            //取出第一个下标为i的元素
            int min = i;
            for (int j = i + 1; j < x.length; j++) {
                //与i+1之后的元素按个比较
                //如果最小值大于之后的j所对应的值
                if(x[min]>x[j]){
                    //则将最小值得索引更新为j，通过不断的比较，最后将min下标更新为最准确地最小值，之后再进行第二轮循环
                    //将次小值挑出来，放在第二个位置
                    min = j;
                }
            }
            //在第一轮中找到了最小值的索引min，把其对应的值赋值给临时变量，交换下标为i和下标为min的位置
            int tmp = x[min];
            x[min] = x[i];
            x[i] = tmp;
        }
        return x;
    }
    public static int[] asc2(int[] x) {

        int[] ints = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            //最小值下标为min，值为x[min]
            //取出第一个下标为i的元素
            int min = i;
            for (int j = i + 1; j < x.length; j++) {
                //与i+1之后的元素按个比较
                //如果最小值大于之后的j所对应的值
                if(x[min]>x[j]){
                    //则将最小值得索引更新为j，通过不断的比较，最后将min下标更新为最准确地最小值，之后再进行第二轮循环
                    //将次小值挑出来，放在第二个位置
                    min = j;
                }
            }
            //将已经跳出的最小值放在最前面
            ints[i] = ints[min];
        }
        return x;
    }
}
