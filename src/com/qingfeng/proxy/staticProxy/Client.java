package com.qingfeng.proxy.staticProxy;

/**
 * test the static-proxy
 */
public class Client {
    public static void main(String[] args) {
        TeacherDaoImpl teacherDao=new TeacherDaoImpl();
        TeacherDaoProxy proxy = new TeacherDaoProxy(teacherDao);
        proxy.teach();
    }
}
