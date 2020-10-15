package com.qingfeng.proxy.staticProxy;

public class TeacherDaoProxy implements ITeacherDao{
    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("proxy is starting! do some things");
        target.teach();
        System.out.println("commit !");
    }
}
