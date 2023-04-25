package com.ltp.gradesubmission.service;

import java.util.List;

import com.ltp.gradesubmission.entity.Course;
import com.ltp.gradesubmission.entity.Student;

public interface CourseService {
    Course getCourse(Long id);
    Course saveCourse(Course course);
    Course addStudentToCourse(Long studentId, Long courseId);
    void deleteCourse(Long id);
    List<Course> getCourses();
    List<Student> getEnrolledStudents(Long id);
}