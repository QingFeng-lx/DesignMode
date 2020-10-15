package com.qingfeng.builder.study;


import com.qingfeng.builder.study.ConcreateBuilder;

public class Client {
    public static void main(String[] args) {
        Builder build = new ConcreateBuilder();
        Director director = new Director(build);
        Product product = director.construct();
        product.show();
    }
}
