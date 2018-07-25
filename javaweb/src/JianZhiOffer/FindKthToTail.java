/**
 * Copyright (C),2018, 宜信
 * FileName: FindKthToTail
 * Author:   FuJianXin
 * Date:     2018/7/24 19:26
 * Description: 链表中倒数第k个结点
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package JianZhiOffer;

/**
 *〈一句话功能简述〉<br>
 *〈链表中倒数第k个结点〉
 *
 * @author FuJianXin
 * @create 2018/7/24
 * @since 1.0.0
 */
public class FindKthToTail {

    /**
     * 功能描述: <br>
     * 〈〉
     *
     * @param：node
     * @return:
     * @since: 1.0.0
     * @Author:FuJianXin
     * @Date: 2018/7/24 19:28
     */

    public ListNode method1(ListNode node,int k){
        //代码的鲁棒性
        if (node == null){
            return null;
        }
        //计数器
        int count = 0;
        ListNode cur = node;
        while (cur != null){
            cur = cur.next;
            count++;
        }
        //排除特殊情况k > 链表长度
        if (k > count){
            return null;
        }
        //找到第n-k+1个结点
        for(int i = 0;i<count-k;i++){
            node = node.next;
        }
        return node;

    }

    public ListNode method2(ListNode node,int k){
        //代码的鲁棒性
        if (node == null){
            return null;
        }
        //计数器
        int count = 0;
        ListNode cur = node;
        while (cur != null){
            cur = cur.next;
            count++;
        }
        //排除特殊情况k > 链表长度
        if (k > count){
            return null;
        }
        //定义新的指针
        ListNode pre = node;
        while (pre != null){
            if (k != 0){
                k--;
            }else {
                node = node.next;
            }
            pre = pre.next;
        }
        return node;

    }

}


/**<br>
 * 功能描述:
 *〈自定义ListNode结点类〉
 * @since: 1.0.0
 * @Author:FuJianXin
 * @Date: 2018/7/24 19:29
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
