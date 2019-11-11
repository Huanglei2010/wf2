package com.huanglei.wf2.test;


@FunctionalInterface
interface Interface1{
    int doubleNum(int i);

    // 默认方法 有默认实现
    default int add(int x,int y){
        return x + y;
    }
}

@FunctionalInterface
interface Interface2{
    int doubleNum(int i);

    // 默认方法 有默认实现
    default int add(int x,int y){
        return x + y;
    }

}

@FunctionalInterface
interface Interface3 extends Interface2,Interface1{


    @Override
    default int add(int x, int y) {
        return Interface1.super.add(x,y);


    }
}
public class LambdaDemo1 {
    public static void main(String[] args) {
        Interface1 i1=i->i*2;
        Interface1 i2=i->i*2;
        System.out.println( i1.doubleNum(10));
        System.out.println(i1.add(100,10));

    }
}
