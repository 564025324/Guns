package com.stylefeng.guns.base;

import org.apache.commons.lang.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;

public class JavaMethodTest {

    public static void main(String[] args) {
        String a = "9->11->12->14";
        String[] list = a.split("->");
        System.out.println(Arrays.toString(list));
        // 打印结果：[9, 11, 12, 14]
        String b = "";
        b = StringUtils.join(list,"?");
        System.out.println(b);
        // 打印结果: 9?11?12?14
    }
}
