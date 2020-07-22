package com.autumn.hotkey;

/**
 * @author xql132@zcsmart.com
 * @date 2020/7/22 15:31
 * @description
 */
public class HotKey2 {
    /**
     * 快捷键: Ctrl+alt+V
     */
    private void hotKey3(){
        // 使用快捷键前
        System.out.println(new String("使用快捷键之前"));
        /**********使用快捷键后***************************/
        // 选中'new String("使用快捷键之前")', 按快捷键Ctrl+alt+V, 就变成下面的代码了
        String s = new String("使用快捷键之前");
        System.out.println(s);


    }
}
