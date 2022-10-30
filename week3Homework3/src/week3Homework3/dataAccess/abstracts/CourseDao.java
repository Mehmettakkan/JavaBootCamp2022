package week3Homework3.dataAccess.abstracts;

import java.util.List;

import week3Homework3.entities.concrete.Course;

public interface CourseDao {
	void add(Course course);

	void delete(Course course);

	void update(Course course);

	List<Course> gelAll();
}
