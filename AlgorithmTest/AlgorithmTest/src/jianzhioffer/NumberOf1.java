package jianzhioffer;

/**
 *〈一句话功能简述〉<br>
 *〈二进制数中1的个数〉
 * 题目描述：
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 *
 * @author 一个鲁肃
 * @create 2018/7/5
 * @since 1.0.0
 */

public class NumberOf1 {

    /**
     * 功能描述: <br>
     *〈该函数计算二进制数中1的个数〉
     * @return: int
     * @since: 1.0.0
     * @Author: 一个鲁肃
     * @Date: 2018/7/5 18:29
     */
    public int method1(int num) {
        int count = 0;
        while(num != 0){
            if((num & 1) == 1){
                count++;
            }
            num = num >> 1;
        }
        return count;

    }

    /**
     * 功能描述: <br>
     * 〈该函数计算二进制数中1的个数〉
     * @return: int
     * @since: 1.0.0
     * @Author: 一个鲁肃
     * @Date: 2018/7/5 18:29
     */
    public int method2(int num) {
        int count = 0;
        int flag = 1;
        while (flag != 0){
            if ((num & flag) == 1){
                count++;
            }
            flag = flag << 1;
        }
        return count;

    }

    /**
     * 功能描述: <br>
     * 〈该函数计算二进制数中1的个数〉
     * @return: int
     * @since: 1.0.0
     * @Author: 一个鲁肃
     * @Date: 2018/7/5 18:29
     */
    public int method3(int num) {
        int count = 0;
        while (num != 0){
            count++;
            num = num & (num-1);
        }
        return count;

    }

}
