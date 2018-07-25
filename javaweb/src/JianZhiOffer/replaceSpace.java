/**
 * Copyright (C),2018, 宜信
 * FileName: replaceSpace
 * Author:   FuJianXin
 * Date:     2018/7/26 0:35
 * Description: 替换空格
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package JianZhiOffer;

/**
 * 〈一句话功能简述〉<br>
 * 〈替换空格〉
 *
 * @author FuJianXin
 * @create 2018/7/26
 * @since 1.0.0
 */
public class replaceSpace {

    public String method(StringBuffer str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                str.append("  ");
            }
        }
        int oldIndex = length - 1;
        int newIndex = str.length() - 1;
        while (newIndex > oldIndex && oldIndex >= 0) {
            if (str.charAt(oldIndex) == ' ') {
                str.setCharAt(newIndex--, '0');
                str.setCharAt(newIndex--, '2');
                str.setCharAt(newIndex--, '%');
            } else {
                str.setCharAt(newIndex--, str.charAt(oldIndex));
            }
            oldIndex--;
        }
        return str.toString();
    }

}
