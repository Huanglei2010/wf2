package com.huanglei.wf2.test;

import java.io.*;
import java.util.ArrayList;

public class FileOper {
    public static void main(String[] args) {

// 使用ArrayList来存储每行读取到的字符串
        ArrayList<String> arrayList = new ArrayList<>();
        String str0 = "";
        try {
            File file = new File("E:\\weiChatFiles\\WeChat Files\\huangleididong\\FileStorage\\File\\2019-11\\总部scope.txt");
            InputStreamReader inputReader = new InputStreamReader(new FileInputStream(file));
            BufferedReader bf = new BufferedReader(inputReader);
            // 按行读取字符串
            String str;
            while ((str = bf.readLine()) != null) {
                str0 += str + ",";
                arrayList.add(str);
            }
            bf.close();
            inputReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 对ArrayList中存储的字符串进行处理
        int length = arrayList.size();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            String s = arrayList.get(i);
            array[i] = Integer.parseInt(s);
        }
        // 返回数组
        System.out.println(str0);

    }
    //取消掉上限
    /*if (kpi.getUnit()!=null &&(kpi.getUnit().equals("ratio")||kpi.getUnit().equals("percent"))){
        kpiValueList.stream().filter(kpiValue -> kpiValue.getValue()!=null).forEach(kpiValue -> {
            if (new BigDecimal(kpiValue.getValue()).compareTo(new BigDecimal(1))==1) {
                kpiValue.setValue("1");
            }
        });
    }
    if (kpi.getUnit()!=null&&kpi.getUnit().equals("point")){
        kpiValueList.forEach(kpiValue -> {
            if (new BigDecimal(kpiValue.getValue()).compareTo(new BigDecimal(100))==1) {
                kpiValue.setValue("100");
            }
        });
    }*/


}
