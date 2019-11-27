package com.huanglei.wf2.test;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import com.google.common.collect.Lists;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test3 {
    public static void main6(String[] args) {

        Integer it = new Integer(11156);
        System.out.println(it==11156);
    }

    public static void main5(String[] args) {
        BigDecimal bigDecimal=new BigDecimal(1);
        BigDecimal.valueOf(1);

    }

    public static void main2(String[] args) {
        List<Integer> nums = Lists.newArrayList(1,1,8,2,3,4,5,6,7,9,10);
        Map<Boolean,List<Integer>> numMap= nums.stream().collect(Collectors.partitioningBy(num -> num > 5));
        System.out.println(numMap);
        String m="month";
        String n="month";
        System.out.println(m==n);
    }
    public static void main4(String[] args) {
        String str="2019-09-01 00:00:00";
        System.out.println(str.substring(0,7));
        System.out.println(str.substring(0,4));

        Date date = new Date();
        DateTime dateTime =DateUtil.parse(str);
        int i = dateTime.year();
        int i2 = dateTime.month();
        System.out.println(i);
        System.out.println(i2);
    }


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("hello1");
        list.add("hello2");
        list.add("hello3");
        list.add("hello4");
        list.add("hello5");
        Test3 test3=new  Test3();
        list.forEach(test3::sayGood);
    }


    public void sayGood(String msg){
        System.out.println("good "+msg );
    }


}