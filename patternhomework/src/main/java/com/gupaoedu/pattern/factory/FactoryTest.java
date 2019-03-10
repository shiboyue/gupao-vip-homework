package com.gupaoedu.pattern.factory;

public class FactoryTest {

    public static void main(String[] args) {

        ICourseFactory javaCourse = new JavaFactory();

        ICourse course = javaCourse.createCourse();


    }
}
