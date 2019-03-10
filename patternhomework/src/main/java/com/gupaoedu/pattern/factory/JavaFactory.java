package com.gupaoedu.pattern.factory;

public class JavaFactory implements ICourseFactory {
    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }
}
