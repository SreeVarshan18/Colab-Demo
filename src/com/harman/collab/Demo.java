package com.harman.collab;

public class Demo {

    public static void main(String[] args) {

        int x=10,y=20, sum, val;
        Addition add_ob = new Addition();
        Multiply mul_obj = new Multiply();
        sum = add_ob.addnum(x,y);
        System.out.println(sum);
        val = mul_obj.mulnum(x, y);
        System.out.println(val);

    }
}
