package week3Homework3.business.abstracts;

import week3Homework3.entities.concrete.Course;

public interface CourseService {
	void add(Course course) throws Exception;

	void delete(Course course);

	void update(Course course);
}
