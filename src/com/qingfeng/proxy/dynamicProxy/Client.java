package com.qingfeng.proxy.dynamicProxy;

public class Client {
    public static void main(String[] args) {
        ITeacherDao target = new TeacherDaoImpl();
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();
        proxyInstance.teach("liuxin");

    }
}
