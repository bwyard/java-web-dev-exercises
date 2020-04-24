package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String courseName;
    private String courseId;
    private ArrayList<Student> studentList = new ArrayList<>();

    public Course(String courseName, String courseId, ArrayList<Student> studentList) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.studentList = studentList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return courseName.equals(course.courseName) &&
                courseId.equals(course.courseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseName, courseId);
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseId='" + courseId + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
