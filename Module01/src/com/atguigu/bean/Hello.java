package com.atguigu.bean;

import java.util.ArrayList;

/**
 * @author 潘江东
 * @date 2020/6/3 - 22:42
 */
/*
快捷键的使用
1 执行(run)  alt+r
2 提示补全 (Class Name Completion)    alt+/
3 单行注释       ctrl + /
4 多行注释 ctrl + shift + /
5 向下复制一行 (Duplicate Lines)    ctrl+alt+down
6 删除一行或选中行 (delete line)    ctrl+d
7 向下移动行(move statement down)    alt+down
8 向上移动行(move statement up)     alt+up
9 向下开始新的一行(start new line)    shift+enter
10 向上开始新的一行 (Start New Line before current)      ctrl+shift+enter
11 如何查看源码 (class)     ctrl + 选中指定的结构 或 ctrl + shift + t
12 万能解错/生成返回值变量     alt + enter
13 退回到前一个编辑的页面 (back)    alt + left
14 进入到下一个编辑的页面(针对于上条) (forward)    alt + right
15 查看继承关系(type hierarchy)    F4
 */
public class Hello {

    //模板六 prsf
    private static final Customer cust = new Customer();

    //变形 psf
    public static final int NUMBER=1;
    //psfi
    public static final int NUM2=2;
    //psfs
    public static final String NATION="CHINA";
    //模板一psvm main也可以用
    public static void main(String[] args) {

        //模板二：sout
        System.out.println("hello");
        //变形：soutp打印方法形参 /soutm打印方法名字 /soutv 打印变量值 /xxx.sout
        //模板三 fori
        String[] arr  = new String[]{"hah","heihie","xixi"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        //变形iter
        for (String s : arr) {
            System.out.println(s);
        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

        }
        //模板四 list.for
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        for (Object o : list) {

        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }
    }
    public void method(){
        //模板五：ifn
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        if (list == null) {

        }
        //变形：inn
        if (list != null) {

        }
        //变形 xxx.nn
        if (list != null) {

        }
        if (list == null) {

        }
    }
}
