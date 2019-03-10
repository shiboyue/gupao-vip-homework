package com.gupaoedu.pattern.abstractfactory;

public class JavaCourseFactory implements ICourseFactory {
    @Override
    public IClassNote createClassNote() {
        return new JavaClassNote();
    }

    @Override
    public IRecordingVideo createRecordingVideo() {
        return new JavaRecordingVideo();
    }
}
