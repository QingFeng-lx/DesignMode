package com.qingfeng.proxy.dynamicProxy;



public class TeacherDaoImpl implements ITeacherDao {
    @Override
    public void teach(String name) {
        System.out.println(name+" the teacher is teaching");
    }
}
