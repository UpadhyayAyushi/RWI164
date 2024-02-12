package com.learnSphere.services;

import java.util.List;



import com.learnSphere.entities.Lesson;
import com.learnSphere.entities.Course;

public interface StudentService {
	List<Course> fetchCourseList();
	
	Course fetchCourse(int courseId);

	Lesson getLesson(int lessonId);

}
