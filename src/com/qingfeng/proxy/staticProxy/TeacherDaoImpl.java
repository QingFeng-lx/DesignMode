package com.qingfeng.proxy.staticProxy;

public class TeacherDaoImpl implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("the teacher is teaching");
    }
}
