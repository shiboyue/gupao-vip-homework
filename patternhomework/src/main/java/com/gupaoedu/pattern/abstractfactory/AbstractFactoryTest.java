package com.gupaoedu.pattern.abstractfactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {

        ICourseFactory javaFactory = new JavaCourseFactory();

        javaFactory.createClassNote();
        javaFactory.createRecordingVideo();

    }
}
